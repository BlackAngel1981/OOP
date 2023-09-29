public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int eat(int plate) {
//        int result = plate;
        if (plate >= appetite) {
            plate -= appetite;
            satiety = true;
        } else {
            System.out.printf("Коту %s не хватает еды...\nAppetite: %d Plate: %d\n", name, appetite, plate);
        }
        return plate;
    }

}
