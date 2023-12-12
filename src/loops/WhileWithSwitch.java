package loops;

public class WhileWithSwitch
{
    public static void main(String[] args) {
        int score =0;
        while (score<100)
        {
            switch (score)
            {
                case 25:
                    System.out.println("Score is 25...Yeeeeeyyyy");
                    break;
                case 50:
                    System.out.println("Score is 50--Half Century");
                    break;
                case 100:
                    System.out.println("Score is 50-- Century");
                default:
                    System.out.println(score);
                    break;
            }

            score++;
        }
    }
}
