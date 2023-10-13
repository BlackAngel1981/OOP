import java.util.Collection;
import java.util.Date;

public class BookingView implements View {

    private ViewObserver observer;

    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
//            System.out.println(table + " " + table.isStatus());
            System.out.printf("%s %s\n", table, table.isStatus());
        }
    }

    @Override
    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    @Override
    public void printReservationTableResult(String name, int tableNo, Date date, int reservationNo) {
        if (reservationNo > 0)
            System.out.printf("\n%s, столик #%d успешно забронирован %s. Номер вашей брони: #%d\n", name, tableNo, date, reservationNo);
        else
            System.out.printf("\n%s, не удалось забронировать столик #%d. Попробуйте выполнить операцию позже.\n", name, reservationNo);
    }

    public void reservationTable(Date orderDate, int tableNo, String name) {
        observer.onReservationTable(orderDate, tableNo, name);
    }

    public void changeReservationTable(int oldReservation, int oldTableNo, Date reservationDate, int newtableNo, String name) {
        observer.chReservationTable(oldReservation, oldTableNo, reservationDate, newtableNo, name);
    }

}
