package loops;

public class WhileLoop
{
    public static void main(String[] args)
    {
        //Ashish
//        int i=1;
//        while(i<11)
//        {
//            System.out.println("Ashish");
//            i++;
//        }

        int num=1;
        while (num<100)
        {
            if(100%num==0)
            {
                System.out.println(num + " : Divides the number 100");
            }
            System.out.println(num);
            num++;
        }

        // reverse order

        int i1= 10;
        while(i1>0)
        {
            System.out.println(i1);
            i1--;
        }

    }
}
