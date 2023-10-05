public class Main {
    public static void main(String[] args) {

        // Box of apples
        Box<Apple> boxApple = new Box<>();
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());

        System.out.println(boxApple.getWeightBox());

        // Box of oranges
        Box<Orange> boxOrange = new Box<>();
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());

        System.out.println(boxOrange.getWeightBox());

        // Comparison of boxes
        System.out.println(boxApple.compare(boxOrange));

        // Transfer fuits
        Box<Apple> newBoxApple = new Box<>();
        boxApple.transferFruit(newBoxApple);

        System.out.println(boxApple.getWeightBox());
        System.out.println(newBoxApple.getWeightBox());

    }
}
