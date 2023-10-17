package srp;

public class Order {
    protected String clientName;
    protected String email;
    protected String product;
    protected int qnt;
    protected double price;
    public Order() {
    }

    public Order(String clientName, String email, String product, int qnt, int price) {
        this.clientName = clientName;
        this.email = email;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }


    public String getClientName() {
        return clientName;
    }

    public String getEmail() {
        return email;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }

}
