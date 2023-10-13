import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNo, String name);

    void chReservationTable(int oldReserv, int oldTable, Date orderDate, int tableNo, String name);
}
