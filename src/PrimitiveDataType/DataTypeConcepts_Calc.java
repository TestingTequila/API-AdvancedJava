package PrimitiveDataType;

public class DataTypeConcepts_Calc {
    public static void main(String[] args) {

        short x = 32767;
        byte y = 12;

        int sum = x + y; // Sum is Out of range for Byte Data Type

        System.out.println(sum);

        float n1 = (float) 12.33;
        float n2 = 12.35f;

        float n3 = (float) 44.567;
        System.out.println(n1 + n2);
        System.out.println(n3);

        System.out.println("========CHAR========");
        char c1 = 'a'; // 97
        char c11 = 'b'; // 98

        System.out.println(c1);
        System.out.println(c11);

        System.out.println(c1 + c11);
        // ASCII value will be considered only if you are performing some mathematical operation on char values

        char r1 = '0'; // 48
        char r2 = '9'; // 57
        System.out.println(r1); // 0
        System.out.println(r2); // 9
        System.out.println(r1 + r2); // 105
        System.out.println(r1 * r2); // 2736

        char u1 = 'a'; //97
        char u2 = 'b'; //98
        System.out.println(u1 + "" + u2);
        System.out.println((int) u1); // 97
        System.out.println((int) u2); // 98
        System.out.println((int) u1 + (int) u2); //195
        System.out.println(u1+0); //97
        System.out.println(u1+'0'); // 97+48
        System.out.println(u1+'0'+ "" + u2); // 97+48


    }
}
