import java.util.Scanner;

public class Panugaling_Activity_VI {
    public static void main(String[] args) {

        // Scanner Object
        Scanner scanner = new Scanner(System.in);

        // Declaring Variables
        double x, y;
        double sum, difference, product;

        // Header
        System.out.println(""); // Adding Spacing
        System.out.println("WELCOME");
        System.out.println(""); // Adding Spacing

        // User Input
        System.out.print("Please Enter First Number: ");
        x = scanner.nextDouble();

        System.out.print("Please Enter Second Number: ");
        y = scanner.nextDouble();

        // Performing Simple Equations
        sum = x + y;
        difference = x - y;
        product = x * y;

        // Printing Results
        System.out.println(""); // Adding Spacing
        System.out.println(""); // Adding Spacing
        System.out.println("RESULTS");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

    }

}
