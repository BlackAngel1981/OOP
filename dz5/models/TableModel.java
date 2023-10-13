import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model {

    private Collection<Table> tables;

    public Collection<Table> loadTables() {

        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                table.setStatus(true);
                return reservation.getId();
            }
        }
        return -1;
        //throw new RuntimeException("Некорректный номер столика");
    }

    @Override
    public int changeReservationTable(int oldReserved, int oldTableNum, Date reservationDate, int tableNo, String name) {
        for (Table table : tables) {
            if (table.getNo() == tableNo && table.isStatus()) {
                System.out.printf("\nСтолик #%d уже забронирован! Выберите другой столик\n", tableNo);
            } else if (table.getNo() == tableNo) {
                System.out.printf("\n%s, Ваша прежняя бронь №%d отменена!\n", name, oldReserved);
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                for (Table oldtable: tables) {
                    if (oldtable.getNo() == oldTableNum) oldtable.setStatus(false);
                }
                table.setStatus(true);
                return reservation.getId();
            }
        }
        return -1;
    }


}
