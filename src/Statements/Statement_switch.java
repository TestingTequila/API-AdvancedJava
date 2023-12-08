package Statements;

public class Statement_switch
{
    public static void main(String[] args) {
        String day = "Friday";
        switch (day){
            case "Monday":
                System.out.println("Its " + day + " --Go to office");
                break;
            case "Tuesday":
                System.out.println("Its " + day + " --Go to Temple");
                break;
            case "Wednesday":
                System.out.println("Its " + day + " --Meet some old friends");
                break;
            case "Thursday":
                System.out.println("Its " + day + " --Lets watch Movie");
                break;
            case "Friday":
                System.out.println("Its " + day + " --Lets do WFH");
                break;
            default:
                System.out.println("Its weekend....lets Party");

        }
    }
}
