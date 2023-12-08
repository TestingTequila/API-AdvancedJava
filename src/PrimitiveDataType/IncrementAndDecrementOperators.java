package PrimitiveDataType;

public class IncrementAndDecrementOperators
{
    public static void main(String[] args) {
        int z = 133;
        int y= --z;
        System.out.println(y); //132
        System.out.println(z); //132
        z++; // 133
        System.out.println(y); // 132
        System.out.println(z); //133

        y=z++;  // z =134, y =133

        System.out.println(y); //133
        System.out.println(z); //134

        y--;
        System.out.println(y); // 132
        System.out.println(z); // 134

        z = y--;
        System.out.println(y); //131
        System.out.println(z); //132

        z=y + ++y;
        System.out.println(y); // 132
        System.out.println(z); // 263
    }
}
