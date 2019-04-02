package base.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Reference{
    boolean next() default false;
}
public @interface InnerAnnotationDemo {

    //枚举类型
    enum Status{FIXED,NORMAL};
    Status status() default Status.FIXED;

    boolean showSupport() default false;

    String name() default "";

    //class类型
    Class<?> className() default Void.class;

    //嵌套注解
    Reference reference() default @Reference(next = true);

    long[] value();
}
