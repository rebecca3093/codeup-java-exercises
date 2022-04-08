import java.util.Scanner;

public class WarmUp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("Do you live in Dallas y/n");

        String userLivesInDallas = scanner.next();

        boolean livesInCity = true;

        if (userLivesInDallas.equalsIgnoreCase("Y")) {
            livesInCity = true;
        }else {
            livesInCity = false;
        }





        boolean hasTransportation = true;
        boolean canComeInPerson = livesInCity && hasTransportation;


        if (canComeInPerson){
            System.out.println("Yay, you can come to the campus");
        }else {
            System.out.println("No campus for you!!!");
        }

    }
}
