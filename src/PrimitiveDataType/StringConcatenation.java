package PrimitiveDataType;

public class StringConcatenation {
    public static void main(String[] args) {
        String x = "hello";
        String y = "World";

        int a = 100;
        int b = 200;

        System.out.println(x); // hello
        System.out.println(y); // world

        System.out.println(x + y); // helloWorld
        System.out.println(a + b); // 300
        String sum = x + a;
        System.out.println(x + a); //hello100
        System.out.println(a + b + x + y); //300helloWorld
        System.out.println(x + y + a + b); // helloWorld100200
        System.out.println(x + y + (a + b)); // helloWorld300
        System.out.println(a + b + x + y + a + b);//300helloWorld100200

        double d1 = 12.33;
        double d2 = 23.44;
        System.out.println(x+y+d1+d2); //helloWorld12.3323.44


    }
}
