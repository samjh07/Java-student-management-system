package util;

import java.util.Scanner;

public class ConsoleUtil {

    private static final Scanner scanner = new Scanner(System.in);


    // Read Integer Input
    public static int readInt(String message) {

        while (true) {

            try {
                System.out.print(message);
                return Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }


    // Read Double Input
    public static double readDouble(String message) {

        while (true) {

            try {
                System.out.print(message);
                return Double.parseDouble(scanner.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Invalid input! Please enter a valid decimal value.");
            }
        }
    }


    // Read String Input
    public static String readString(String message) {

        System.out.print(message);
        return scanner.nextLine();
    }


    // Read Yes/No Choice
    public static boolean readBoolean(String message) {

        while (true) {

            System.out.print(message + " (Y/N): ");

            String choice = scanner.nextLine().trim().toLowerCase();


            if (choice.equals("y")) {

                return true;

            } else if (choice.equals("n")) {

                return false;

            } else {

                System.out.println("Please enter only Y or N.");
            }
        }
    }


    // Pause Console
    public static void pause() {

        System.out.println("\nPress Enter to continue...");
        scanner.nextLine();
    }


    // Close Scanner
    public static void closeScanner() {

        scanner.close();
    }
}
