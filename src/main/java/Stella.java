import java.util.Scanner;

public class Stella {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] lists = new String[100];
        int counter = 0;

        System.out.println(" > Hello! I am Stella");
        System.out.println(" > What can I do for you?");

        String user_input = scan.nextLine();

        while (!user_input.equals("bye")) {
            if (user_input.equals(("list"))) {
               for (int i = 1; i - 1 < counter; i = i + 1) {
                   System.out.println(i + ". " + lists[i-1]);
               }
            }
            else {
                lists[counter] = user_input;
                counter = counter + 1;
                System.out.println(" > added: " + user_input);
            }

            user_input = scan.nextLine();

        }

        System.out.println(" > Goodbye!");


    }
}
