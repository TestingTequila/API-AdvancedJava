package PrimitiveDataType;

public class MathOperations {
    public static void main(String[] args) {
        System.out.println(10 / 2); //[I/I =I] : 5
        System.out.println(9 / 2);  //[I/I=I]  : 4
        System.out.println(9.0 / 2); //[D/I=D] : 4.5
        System.out.println(9 / 2.0); // [I/D=D]: 4.5
        System.out.println(9.0/2.0); // [D/D=D]: 4.5

        //System.out.println(9/0);     // [I/0=AE]: ArithmeticException: / by zero

        System.out.println(0/9); //[0/I=0] : 0
        System.out.println(9/0.0); // [I/0.0=Infinity] : infinity
        System.out.println(9.0/0); //  [D/0=Infinity]  : infinity
        System.out.println(9.0/0.0);//  [D/0=Infinity]  : infinity
        //System.out.println(0/0);// [I/0=AE]: ArithmeticException: / by zero
        System.out.println(0.0/0.0); // NaN
        System.out.println(0.0/0);   //NaN
        System.out.println(0/0.0);   //NaN

        System.out.println(100/0.0); // Infinity

        System.out.println(10%2);  // Remainder : 0
        System.out.println(9%2);   // Remainder : 1
        System.out.println(9.2%2); //Remainder : 1.1999999999999993

    }
}
