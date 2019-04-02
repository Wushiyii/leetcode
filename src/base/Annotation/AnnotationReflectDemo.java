package base.Annotation;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@DocumentB
public class AnnotationReflectDemo extends A{

    public static void main(String[] args) {
        Class<?> clazz = AnnotationReflectDemo.class;

        //根据指定注解获取该注解
        DocumentA documentA = clazz.getAnnotation(DocumentA.class);
        System.out.println("A : " +documentA);

        //获取对象的全部注解，包括从父类继承的注解
        Annotation[] annotations = clazz.getAnnotations();
        System.out.println("Annotations : " + Arrays.toString(annotations)); //Annotations : [@base.Annotation.DocumentA(), @base.Annotation.DocumentB()]

        //获取对象的全部注解，但不包括从父类继承的注解
        Annotation[] declaredAnnotations = clazz.getDeclaredAnnotations();
        System.out.println("declaredAnnotations : " + Arrays.toString(declaredAnnotations)); //declaredAnnotations : [@base.Annotation.DocumentB()]

        //判断注解DocumentA是否在该元素上
        boolean present = clazz.isAnnotationPresent(DocumentA.class);
        System.out.println("isPresent ? " + present); //isPresent ? true

    }
}


@DocumentA
class A{}