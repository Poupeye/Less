package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat " + name + " " + satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(appetite);
        if (plate.getFood() < appetite) {
            this.satiety = false;
        } else satiety = true;
    }
}
