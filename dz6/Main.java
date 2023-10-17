import srp.Confirmation;
import srp.Input;
import srp.Reservation;

public class Main {

    /**
     * TODO: Переработать приложение в рамках принципа SRP
     *
     * @param args
     */
    public static void main(String[] args) {

        Input input = new Input();
        input.inputFromConsole();
        Reservation reservation = new Reservation();
        reservation.saveToJson(input);
        Confirmation confirmation = new Confirmation();
        confirmation.confirmationOrder(input);

    }
}
