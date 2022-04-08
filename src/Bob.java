import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {
        System.out.println("Lets talk to Bob, see what mood hes in today!");

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.endsWith("!")) {
            System.out.println("Whoa, Chill out BRO!");
        } else if (userInput.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever!");
        }

    }
}
