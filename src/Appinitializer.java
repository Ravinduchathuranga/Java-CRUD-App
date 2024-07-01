import java.util.Scanner;

public class Appinitializer {
    public static void main(String[] args) {
        //database area
        String[][]users=new String[3][2];
        Scanner scanner = new Scanner(System.in);
        String[] initializePageQuestions = {
                "1) Do you want to login?",
                "2) Are you new to here?",
                "3) Do you want to exit the page?",
        };
        for (String question : initializePageQuestions) {
            System.out.println(question);
        }
        int userInput = input.nextInt();
        switch (userInput) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                return;
        }
    }
//    logInprocess
    public static boolean login(){

    }
//    register process
    public static boolean register(){

    }
}
