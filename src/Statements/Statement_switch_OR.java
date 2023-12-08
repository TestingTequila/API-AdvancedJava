package Statements;

public class Statement_switch_OR
{
    public static void main(String[] args) {
        String day = "Friday";
        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Its " + day + " --Lets do WFH");
                break;
            case  "Saturday":
                System.out.println("Its " + day + " --Lets dance");
                break;
            default:
                System.out.println("Its weekend....lets Party");
                break;

        }
    }
}
