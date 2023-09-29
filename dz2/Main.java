public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);

        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Murzik", 40, false);
        cats[1] = new Cat("Vasyaka", 30, false);
        cats[2] = new Cat("Barsik", 40, false);

        for (var item : cats) {
            int response = item.eat(plate.getFood());
            plate.setFood(response);
            if (item.isSatiety()) {
                System.out.printf("Кот %s наелся.\n", item.getName());
                plate.info();
            }
        }
        plate.setFood(100);
    }
}
