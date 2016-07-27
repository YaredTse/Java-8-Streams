package StreamATest;

import StreamA.Foo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class FooTest {

    Foo foo = new Foo();;
    List<Foo.InnerFoo> innerFoos = new ArrayList<Foo.InnerFoo>();

    @Before
    public void setUp(){
        innerFoos.add( foo.new InnerFoo("Hhello"));
        innerFoos.add( foo.new InnerFoo("Hello"));
    }

    @Test
    public void addItemsList(){
        int a = innerFoos.size();
        Assert.assertEquals( a, 2);
    }
}
