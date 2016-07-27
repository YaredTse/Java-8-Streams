package StreamA;

import java.util.Arrays;
import java.util.List;

public class FilteringApples {

    public static void main(String ... args ){

        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );


        for ( Apple a : inventory ) {
            System.out.println( a.color);
        }

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
