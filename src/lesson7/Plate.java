package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Food = " + food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        } else if (food < n){
            System.out.println("в торелке мало еды");
        }
    }

    public int getFood() {
        return food;
    }

    public void putFood(int n) {
        food += n;
    }


}
