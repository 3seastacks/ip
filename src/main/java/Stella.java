import java.util.Scanner;

public class Stella {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" > Hello! I am Stella");
        System.out.println(" > What can I do for you?");

        String user_input = scan.nextLine();

        while (!user_input.equals("bye")) {
            System.out.println(" > " + user_input);
            user_input = scan.nextLine();

        }

        System.out.println(" > Goodbye!");


    }
}
