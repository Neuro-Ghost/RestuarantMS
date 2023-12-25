class Reservation {
    private static int nextReservationID = 1;

    private int reservationID;
    private String reservationTime;
    private String reservationName;
    private final int numberOfCustomers;
    private Table table;

    public Reservation(String reservationTime, String reservationName, int numberOfCustomers, Table table) {
        this.reservationID = nextReservationID++;
        this.reservationTime = reservationTime;
        this.reservationName = reservationName;
        this.numberOfCustomers = numberOfCustomers;
        this.table = table;
    }

    public int getReservationID() {
        return reservationID;
    }

    public String getReservationTime() {
        return reservationTime;
    }

    public String getReservationName() {
        return reservationName;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Table getTable() {
        return table;
    }
}