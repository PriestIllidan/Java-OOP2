import java.util.Scanner;

public class NumberInt {

    static Scanner scanner = new Scanner(System.in);

    static int getNumber() {
        System.out.println("Enter number: ");
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.out.println("Error, enter number!");
            scanner.next();
            number = getNumber();
        }
        return number;
    }
}
