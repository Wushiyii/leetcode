package base.Annotation.SQL;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {

    String name() default ""; //列名

    int value() default 0; //列对应字段长度

    Constrains constraint() default @Constrains;
}
