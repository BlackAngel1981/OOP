package srp;

public class Confirmation {

    public void confirmationOrder(Order order) {

//        double totalValue = order.getQnt() * order.getPrice();
        System.out.printf("%s, товар %s в кол-ве: %d по цене %.2f (1 шт.) Общая стоимость: %.2f зарезервирован успешно! Копия договора отправлена " +
                        "на email %s",
                order.getClientName(), order.getProduct(), order.getQnt(), order.getPrice(), order.getQnt() * order.getPrice(), order.getEmail());

    }

}
