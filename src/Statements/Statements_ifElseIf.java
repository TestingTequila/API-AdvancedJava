package Statements;

public class Statements_ifElseIf
{
    public static void main(String[] args) {

        int age = 7;

        if(age<2)
        {
            System.out.println("The child should go to child care center");
        }
        else if (age >2 && age <5 )
        {
            System.out.println("The child should go to play school");
        }
        else if (age >5)
        {
            System.out.println("The child should go senior play school");
        }
    }
}
