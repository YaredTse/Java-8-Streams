package StreamA;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Foo {

    public class InnerFoo{

        String str = null;

        public InnerFoo(String a){
            this.str = a;
        }

        public String getString(){
            return this.str;
        }

    }

    public static void main( String [] args){

        Foo foo = new Foo();

        List<InnerFoo> innerFoos = new ArrayList<InnerFoo>();
        innerFoos.add( foo.new InnerFoo("First"));
        innerFoos.add( foo.new InnerFoo("Second"));
        innerFoos.add( foo.new InnerFoo("Third"));
        innerFoos.add( foo.new InnerFoo("Forth"));

        innerFoos.stream()
                .filter( (s) -> s.str.startsWith("F"))
                .map( (f) -> f.str.toUpperCase() )
                .sorted()
                .forEach( System.out::println );

    }
}
