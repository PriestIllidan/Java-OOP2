import java.util.Scanner;

public class NumberDouble {

    static Scanner scanner = new Scanner(System.in);

    static double getNumber() {
        System.out.println("Enter number: ");
        double number;
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            System.out.println("Error, enter number!");
            scanner.next();
            number = getNumber();
        }
        return number;
    }
}