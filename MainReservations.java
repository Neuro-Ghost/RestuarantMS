import java.util.ArrayList;
import java.util.Scanner;

public class MainReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create tables
        ArrayList<Table> tables = new ArrayList<>();
        tables.add(new Table(1, 4));
        tables.add(new Table(2, 6));
        tables.add(new Table(3, 2));
        tables.add(new Table(4, 8));
        tables.add(new Table(5, 4));

        // Create reservation manager
        ReservationManager reservationManager = new ReservationManager(tables);

        // Display welcome message
        System.out.println("︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻︻");
        System.out.println(" ⧉ Welcome to Bazalt! We are Delighted to have you! ⧉ ");
        System.out.println("︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼︼");
        // Display available tables with their counts
        System.out.println("Available Tables: ʕノ•ᴥ•ʔノ ︵ ┻━┻ ");
        for (Table table : tables) {
            if (!table.isReserved()) {
                table.display();
                System.out.println();
            }
        }

        // Make 5 reservations
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nReserving for Person " + i + ":");

            // Ask the user for reservation details
            System.out.print("Enter reservation name: ");
            String reservationName = scanner.nextLine();

            System.out.print("Enter reservation time: ");
            String reservationTime = scanner.nextLine();

            System.out.print("Enter number of customers: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Consume the invalid input
            }
            int numberOfCustomers = scanner.nextInt();

            // Add reservation
            reservationManager.addReservation(reservationTime, reservationName, numberOfCustomers);

            // Display all reservations
            reservationManager.displayAllReservations();

            // Display available tables with their counts
            System.out.println("Available Tables: (╯ತᨎತ）╯︵ ┻━┻");
            for (Table table : tables) {
                if (!table.isReserved()) {
                    table.display();
                    System.out.println();
                }
            }

            // Consume the newline left in the buffer
            scanner.nextLine();
        }

        // Close the scanner
        scanner.close();
    }
}
