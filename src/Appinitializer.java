import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Appinitializer {
    //database area
    static String[][] users = new String[3][2];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitState=false;
        String[] initializePageQuestions = {
                "1) Do you want to login?",
                "2) Are you new to here?",
                "3) Do you want to exit the page?",
        };

        while (!exitState){
            for (String question : initializePageQuestions) {
                System.out.println(question);
            }
            int userInput=scanner.nextInt();

            switch (userInput) {
                case 1:
                    if (login()) {
                        uiUpdate("Log IN");
                        openDashboard();
                    }
                    break;
                case 2:
                    if (register()) {
                        uiUpdate("Register");
                        openDashboard();
                    }
                    break;
                case 3:
                    uiUpdate("Back to home");
                    System.out.println("Good Bye! \uD83D\uDC4B");
                    return;
                default:
                    System.out.println("Wrong input \uD83D\uDE0F");
                    return;
            }

        }


    }
    //    logInprocess
    public static boolean login() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your email!");
        String email = input.nextLine();
        System.out.println("Please enter your password");
        String password = input.nextLine();

        for (int i = 0; i < users.length; i++) {
            if (users[i][0]!=null && users[i][0].equals(email)) {
                if (users[i][1].equals(password)) {
                    System.out.println("Log in successfully!");
                    return true;
                } else {
                    System.out.println("wrong password");
                    return false;
                }
            }
        }
        System.out.println("User email not found");
        return false;
    }

    //    register process
    public static boolean register() {
        Scanner input = new Scanner(System.in);
        if (users[users.length - 1][0] != null) {
            System.out.println("user database is full");
            return false;
        }

        System.out.println("Insert your email");
        String email = input.nextLine();
        System.out.println("Insert your password");
        String password = input.nextLine();

        for (int x = 0; x < users.length; x++) {
            if (users[x][0] == null) {
                users[x][0] = email;
                users[x][1] = password;
                return true;
            } else {
                if (users[x][0].equalsIgnoreCase(email)) {
                    System.out.println("Email already exists");
                    return false;
                }
            }
        }
        return false;
    }

    public static void openDashboard() {
        System.out.println("Dashboard");
    }
    public static void uiUpdate(String posstion){
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat=new SimpleDateFormat("HH:mm-ss");

        String simpledate=dateFormat.format(date);
        String simpleTime=timeFormat.format(date);
        System.out.println("=========================="+simpledate+"======="+simpleTime+"=================");

    }
}
