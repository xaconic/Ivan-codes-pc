// SDPT SWITCH CHALLENGE DATE FORMATTER

import java.util.Scanner;
public class Challenge_Swich {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.print("Enter Month : ");
        int month = scanner.nextInt();

        String monthword = "";

        switch (month) {
            case 1:
                monthword = "January";
            break;
            case 2:
                monthword = "February";
            break;
            case 3:
                monthword = "March";
            break;
            case 4:
                monthword = "April";
            break;
            case 5:
                monthword = "May";
            break;
            case 6:
                monthword = "June";
            break;
            case 7:
                monthword = "July";
            break;
            case 8:
                monthword = "August";
            break;
            case 9:
                monthword = "September";
            break;
            case 10:
                monthword = "October";
            break;
            case 11:
                monthword = "November";
            break;
            case 12:
                monthword = "December";
            break;
            default:
            System.out.println("Invalid Month");

        }

        System.out.print("Enter Day   : ");
        int day = scanner.nextInt();

        if (day >= 31 || day <= 0) {
            System.out.println("Invalid Day");
        }

        System.out.print("Enter Year  : ");
        int year = scanner.nextInt();

        if (year >= 2025 || year < 2000) {
            System.out.println("Invalid Year");
        }

        // RESULT
        System.out.println("");
        System.out.println("Month : " + month);
        System.out.println("Day   : " + day);
        System.out.println("Year  : " + year);

        System.out.println("");
        System.out.println(monthword + " " + day + ", " + year);

        scanner.close();
    }
    
}

// Improvised Codes

/* import java.util.Scanner;

public class Challenge_Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.print("Enter Month : ");
        int month = scanner.nextInt();

        String monthword = "";

        switch (month) {
            case 1:
                monthword = "January";
                break;
            case 2:
                monthword = "February";
                break;
            case 3:
                monthword = "March";
                break;
            case 4:
                monthword = "April";
                break;
            case 5:
                monthword = "May";
                break;
            case 6:
                monthword = "June";
                break;
            case 7:
                monthword = "July";
                break;
            case 8:
                monthword = "August";
                break;
            case 9:
                monthword = "September";
                break;
            case 10:
                monthword = "October";
                break;
            case 11:
                monthword = "November";
                break;
            case 12:
                monthword = "December";
                break;
            default:
                monthword = "Invalid Month";
                System.out.println("Invalid Month");
                scanner.close();
                return; // Exit the program as month is invalid
        }

        System.out.print("Enter Day   : ");
        int day = scanner.nextInt();

        // Corrected day validation
        if (day < 1 || day > 31) {
            System.out.println("Invalid Day");
            scanner.close();
            return; // Exit the program as day is invalid
        }

        System.out.print("Enter Year  : ");
        int year = scanner.nextInt();

        // Corrected year validation
        if (year < 2000 || year >= 2025) {
            System.out.println("Invalid Year");
            scanner.close();
            return; // Exit the program as year is invalid
        }

        // Result
        System.out.println("");
        System.out.println("Month : " + month);
        System.out.println("Day   : " + day);
        System.out.println("Year  : " + year);

        // Handle cases where month, day, or year were invalid
        if (monthword.equals("Invalid Month") || day < 1 || day > 31 || year < 2000 || year >= 2025) {
            System.out.println("Date Information is invalid.");
        } else {
            System.out.println("");
            System.out.println(monthword + " " + day + ", " + year);
        }

        scanner.close();
    }
}
 */
