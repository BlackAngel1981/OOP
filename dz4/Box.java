import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeightBox() {
        float totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<?> box) {
        return Double.compare(this.getWeightBox(), box.getWeightBox()) == 0;
    }

    public void transferFruit(Box<T> box) {
        for (T fruit : fruits) {
            box.addFruit(fruit);
        }
        fruits.clear();
    }

}
