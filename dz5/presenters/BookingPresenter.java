import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model tableModel;
    private final View bookingView;

    public BookingPresenter(Model tableModel, View bookingView) {
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    public Collection<Table> loadTables(){
        return tableModel.loadTables();
    }
    public void updateTablesUI(){
        bookingView.showTables(loadTables());
    }

    public void updateReservationResultUI(String name, int tableNum, Date orderDate, int reservationId){
        bookingView.printReservationTableResult(name, tableNum, orderDate, reservationId);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo, name);
        updateReservationResultUI(name, tableNo, orderDate, reservationNo);
    }

   @Override
    public void chReservationTable(int oldReserv, int oldTable, Date orderDate, int tableNo, String name) {
        int chReservationNo = tableModel.changeReservationTable(oldReserv, oldTable, orderDate, tableNo, name);
        updateReservationResultUI(name, tableNo, orderDate, chReservationNo);
    }

}
