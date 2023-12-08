package Statements;

public class Statement_switch_api
{
    public static void main(String[] args) {
        String request = "GET";
        switch (request){
            case "GET":
                if(request.equalsIgnoreCase("get")) {
                    System.out.println("Its " + request + " --Go to office");
                }
                break;
            case "POST":
                System.out.println("Its " + request + " --Go to Temple");
                break;
            case "DELETE":
                System.out.println("Its " + request + " --Meet some old friends");
                break;
            case "PATCH":
                System.out.println("Its " + request + " --Lets watch Movie");
                break;
            case "PUT":
                System.out.println("Its " + request + " --Lets do WFH");
                break;
            default:
                System.out.println("Its weekend....lets Party");

        }
    }
}
