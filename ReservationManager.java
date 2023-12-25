import java.util.ArrayList;
import java.util.HashMap;

public class ReservationManager {
    private ArrayList<Table> tables;
    private HashMap<Table, Reservation> tableReservationMap;

    public ReservationManager(ArrayList<Table> tables) {
        this.tables = tables;
        this.tableReservationMap = new HashMap<>();
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public Table getTableById(int tableNumber) {
        for (Table table : tables) {
            if (table.getTableNumber() == tableNumber) {
                return table;
            }
        }
        return null; // Return null if the table is not found
    }

    public void displayAllTables() {
        System.out.println("All Tables:");
        for (Table table : tables) {
            table.display();
        }
        System.out.println();
    }
    public void displayAvailableTables() {
        System.out.println("Available Tables:");
        for (Table table : tables) {
            if (table.isAvailable()) {
                table.display();
            }
        }
        System.out.println();
    }

    public void addReservation(String reservationTime, String reservationName, int numberOfCustomers) {
        Table selectedTable = null;
        int closestCapacityDifference = Integer.MAX_VALUE;

        for (Table table : tables) {
            if (!table.isReserved()) {
                if (table.getTableCapacity() == numberOfCustomers) {
                    selectedTable = table;
                    break;
                } else {
                    int capacityDifference = Math.abs(table.getTableCapacity() - numberOfCustomers);
                    if (capacityDifference < closestCapacityDifference && table.getTableCapacity()>numberOfCustomers) {
                        closestCapacityDifference = capacityDifference;
                        selectedTable = table;
                    }
                }
            }
        }

        if (selectedTable != null) {
            selectedTable.reserve();
            Reservation reservation = new Reservation(reservationTime, reservationName, numberOfCustomers, selectedTable);
            tableReservationMap.put(selectedTable, reservation);
            System.out.println("Reservation added: " + reservation.getReservationID());
        } else {
            System.out.println("No available tables for the reservation.");
        }
    }

    public void removeReservation(int reservationID) {
        Reservation reservationToRemove = null;

        for (Table table : tables) {
            if (table.isReserved()) {
                Reservation reservation = tableReservationMap.get(table);
                if (reservation != null && reservation.getReservationID() == reservationID) {
                    reservationToRemove = reservation;
                    break;
                }
            }
        }

        if (reservationToRemove != null) {
            reservationToRemove.getTable().unreserve();
            tableReservationMap.remove(reservationToRemove.getTable());
            System.out.println("Reservation removed: " + reservationToRemove.getReservationID());
        } else {
            System.out.println("Reservation not found: " + reservationID);
        }
    }

    public void displayAllReservations() {
        System.out.println("All Reservations:");
        for (Table table : tables) {
            if (table.isReserved()) {
                Reservation reservation = tableReservationMap.get(table);
                if (reservation != null) {
                    System.out.println("Time: " + reservation.getReservationTime() +
                            ", Table Number: " + table.getTableNumber() +
                            ", Customer Count: " + reservation.getNumberOfCustomers());
                }
            }
        }
        System.out.println();
    }
}
