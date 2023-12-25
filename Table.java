import java.util.ArrayList;

class Table {
    private final int tableNumber;
    private final int tableCapacity;
    private boolean isReserved;

    public Table() {
        this.tableNumber = 0;
        this.tableCapacity = 0;
        this.isReserved = false;
    }
    public Table(int tableNumber, int tableCapacity) {
        this.tableNumber = tableNumber;
        this.tableCapacity = tableCapacity;
        this.isReserved = false;
    }
    public boolean isAvailable() {
        return !isReserved;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getTableCapacity() {
        return tableCapacity;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void reserve() {
        isReserved = true;
    }

    public void unreserve() {
        isReserved = false;
    }
public void display(){
    System.out.println("Table info:\n-Number: "+this.tableNumber+"\n-Table Capacity: "+this.tableCapacity);
}

}
