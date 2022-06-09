package lesson7;

public class Main {
    public static void main(String[] args) {


        Plate plate = new Plate(100);
        Cat[] cat = {new Cat("Barsik",10), new Cat("Pushok",10), new Cat("Kuzya",25), new Cat("Shapa",50), new Cat("Vitalik",40)};

        for (Cat c : cat) {
            c.eat(plate);
            System.out.println(plate);
            System.out.println(c.toString());
        }

        plate.putFood(50);
        System.out.println(plate);


    }
}
