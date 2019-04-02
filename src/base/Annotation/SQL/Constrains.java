package base.Annotation.SQL;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constrains {

    //是否为主键
    boolean primaryKey() default false;

    //是否允许null
    boolean allowNull() default false;

    //判断是否唯一
    boolean unique() default false;
}
