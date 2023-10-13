import java.util.Collection;
import java.util.Date;

public interface View {
    void showTables(Collection<Table> tables);
    void setObserver(ViewObserver observer);
    void printReservationTableResult(String name, int tableNo, Date oredrDate, int reservationNo);
}
