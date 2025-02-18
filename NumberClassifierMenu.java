import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userChoice;

        // Start of the do-while loop for the menu
        do {
            // Display the menu options
            System.out.println("\n=== Number Classifier Menu ===");
            System.out.println("1. Classify a number as positive, negative, or zero");
            System.out.println("2. Print a multiplication table for a given number");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");

            // Read the user's menu choice
            int choice = input.nextInt();

            // Handle menu options using a switch statement
            switch (choice) {
                case 1: 
                    // Case 1: Classify the number
                    System.out.print("Enter a number to classify: ");
                    int number = input.nextInt();

                    // Classify the number (positive, negative, or zero)
                    if (number > 0) {
                        System.out.println("The number " + number + " is positive.");
                    } else if (number < 0) {
                        System.out.println("The number " + number + " is negative.");
                    } else {
                        System.out.println("The number is zero.");
                    }

                    // Check if the number is even or odd
                    if (number % 2 == 0) {
                        System.out.println("It is also an even number.");
                    } else {
                        System.out.println("It is an odd number.");
                    }
                    break;

                case 2:
                    // Case 2: Print multiplication table
                    System.out.print("Enter a number to display its multiplication table: ");
                    int tableNumber = input.nextInt();
                    System.out.println("Multiplication Table for " + tableNumber + ":");

                    // Generate and print the multiplication table using a for loop
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                    }
                    break;

                case 3:
                    // Case 3: Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    // Handle invalid menu choice
                    System.out.println("Invalid option. Please choose between 1 and 3.");
            }

            // Ask the user if they want to return to the menu
            System.out.print("Do you want to return to the menu? (Y/N): ");
            input.nextLine(); // Consume the newline character left by nextInt()
            userChoice = input.nextLine().toUpperCase().charAt(0);

        } while (userChoice == 'Y'); // Loop condition to continue based on user input

        // Close the scanner to release the resource
        input.close();
    }
}
