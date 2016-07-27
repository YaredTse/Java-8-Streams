package StreamA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilteringApples {

    public static void main(String ... args ){

        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );

//        for ( Apple a : inventory ) {
//            System.out.println( a.color);
//        }

        List<Apple> greenApples = filterApple(inventory, FilteringApples::isGreenApple);
        System.out.println( greenApples );

        List<Apple> heavyApples = filterApple(inventory, FilteringApples::isHeavyApple );
        System.out.println( heavyApples );

    }

    public static boolean isGreenApple(Apple apple){
        return "green".equals( apple.getColor() );
    }

    public static boolean isHeavyApple(Apple apple){
        return apple.getWeight() > 150;
    }

    public static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> p){
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory ){
            if ( p.test(apple))
                result.add(apple);
        }

        return result;
    }

    public static class Apple{

        private int weight = 0;
        private String color = "";

        public Apple(int wht, String clr ){
            this.weight = wht;
            this.color = clr;
        }

        public Integer getWeight(){
            return weight;
        }

        public void setWeight(Integer weight){
            this.weight = weight;
        }

        public String getColor(){
            return color;
        }

        public void setColor(String color){
            this.color = color;
        }

        public String toString(){
            return "Apple{" +
                   "color='" + color + '\'' +
                   ", weight=" + weight +
                   '}';
        }

    }
}
