package Statements;

public class Statement_switch_NumericDataType
{
    public static void main(String[] args) {
        char day = 6;
        switch (day){
            case 1:
                System.out.println("Its " + day + " --Go to office");
                break;
            case 2:
                System.out.println("Its " + day + " --Go to Temple");
                break;
            case 3:
                System.out.println("Its " + day + " --Meet some old friends");
                break;
            case 4:
                System.out.println("Its " + day + " --Lets watch Movie");
                break;
            case 5:
                System.out.println("Its " + day + " --Lets do WFH");
                break;
            default:
                System.out.println("Its weekend....lets Party");
                break;
            case 6:
                System.out.println("Its " + day + " --Lets do dance");
                break;

        }
    }
}
