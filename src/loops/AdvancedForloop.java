package loops;

public class AdvancedForloop {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 56, 78, 90, 100};
//        for (int num : numbers)
//        {
//            System.out.println(num);
//        }

        for(int i =0; i<numbers.length;)
        {
            System.out.println(numbers[i]);
            i= i+2;
        }
    }

}
