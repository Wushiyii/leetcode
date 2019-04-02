package base.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //运用于类上
@Retention(RetentionPolicy.RUNTIME) //保存到运行时状态，避免被编译器或者VM去除
public @interface DBTable {

    String name() default "";
}
