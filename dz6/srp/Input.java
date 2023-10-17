package srp;

import java.util.Scanner;

public class Input extends Order {
  public void inputFromConsole() {
        clientName = prompt("Client name: ");
        email = prompt("Client email: ");
        product = prompt("Product: ");
        qnt = Integer.parseInt(prompt("Quantity: "));
        price = Double.parseDouble(prompt("Price: "));
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
