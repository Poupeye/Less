package lesson7;

public class Main {
    public static void main(String[] args) {


        Plate plate = new Plate(100);
        Cat[] cat = {new Cat("Barsik"), new Cat("Pushok"), new Cat("Kuzya"), new Cat("Shapa"), new Cat("Vitalik")};

        for (Cat c : cat) {
            c.eat(plate);
            System.out.println(plate.toString());
            System.out.println(c.toString());

        }
        plate.putFood(50);
        System.out.println(plate.toString());


    }
}
