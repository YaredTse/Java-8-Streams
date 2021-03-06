package appa;

import java.lang.annotation.Annotation;
import java.util.Arrays;

@Author(name = "Raoul")
@Author(name = "Mario")
@Author(name = "Alan")
@TestAnnotation(surname = "Alan")
public class Book {

    interface Foo{
        boolean test();
    }

    public static void main(String[] args) {

        Author[] authors = Book.class.getAnnotationsByType(Author.class);
        TestAnnotation[] test = Book.class.getAnnotationsByType(TestAnnotation.class);
        Annotation[] test2 = Book.class.getDeclaredAnnotations();
        System.out.println( test2.getClass());

        Arrays.asList(test).stream()
                .forEach( (a) -> {
                    System.out.println() ;
                    System.out.println( a.surname() ) ;
                    System.out.println() ;
                });

        Arrays.asList(authors).stream().forEach(a -> {
            System.out.println(a.name());
        });

    }

}
