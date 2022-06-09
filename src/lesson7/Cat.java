package lesson7;

public class Cat {
    private String name;
    private boolean satiety;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name + " " + satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(25);
        if (plate.getFood() < 25) {
            this.satiety = false;
        }else satiety = true;




    }


}
