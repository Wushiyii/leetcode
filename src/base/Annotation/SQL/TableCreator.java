package base.Annotation.SQL;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {

    public static String createTableSql(String className) throws ClassNotFoundException {
        Class<?> clazz = Class.forName(className);
        DBTable dbTable = clazz.getAnnotation(DBTable.class);

        if (dbTable == null) {
            System.out.println("NO DBTable annotation detected in this class : " + className);
            return null;
        }

        String tableName = dbTable.name();//数据库表名
        //如果表名为空，使用类名代替
        if (tableName.trim().length() < 1) {
            tableName = clazz.getName().toUpperCase();
        }
        List<String> columns = new ArrayList<>();
        //获取当前类所有成员属性
        for (Field field : clazz.getDeclaredFields()) {
            String columnName = null;
            //获取成员属性上的注解
            Annotation[] fieldAns = field.getDeclaredAnnotations();
            if (fieldAns.length < 1)
                continue;

            //判断注解类型
            if (fieldAns[0] instanceof SQLInteger) {
                SQLInteger sqlInteger = (SQLInteger) fieldAns[0];
                //获取注解中对应名称，如果没有则取参数大写为列名
                if (sqlInteger.name().trim().length() < 1) {
                    columnName = field.getName().toUpperCase();
                }else {
                    columnName = sqlInteger.name();
                }

                //构建语句
                columns.add(columnName+" INT" + getConstrains(sqlInteger.constraint()));
            }

            //判断注解类型
            if (fieldAns[0] instanceof SQLString) {
                SQLString sqlString = (SQLString) fieldAns[0];
                //获取注解中对应名称，如果没有则取参数大写为列名
                if (sqlString.name().trim().length() < 1) {
                    columnName = field.getName().toUpperCase();
                }else {
                    columnName = sqlString.name();
                }
                //构建语句
                columns.add(columnName+" VARCHAR(" + sqlString.value() + ")" + getConstrains(sqlString.constraint()));
            }
        }
        //建表语句
        StringBuilder command = new StringBuilder("CREATE TABLE " + tableName + "(");
        for (String column : columns) {
            command.append("\n" + column + ",");
        }
        return command.substring(0,command.length()-1) + ")";
    }

    private static String getConstrains(Constrains con) {
        String constrains = "";
        if (!con.allowNull()) {
            constrains += " NOT NULL";
        }
        if (!con.primaryKey()) {
            constrains += " PRIMARY KEY";
        }
        if (!con.unique()) {
            constrains += " UNIQUE";
        }
        return constrains;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String[] arg = {"base.Annotation.SQL.Member"};
        for (String s : arg) {
            System.out.println("Table for " + s + " is : \n" + createTableSql(s));
        }
    }
}
