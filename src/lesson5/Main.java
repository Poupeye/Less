package lesson5;

import java.util.MissingFormatArgumentException;

public class Main {
    public static void main(String[] args) {
        ages();
    }

    public static void ages() {
        Person[] personal = {new Person("Егоров Андрей Сергеевич", "Директор", "prop@mail.ru", 95854123, 750000, 62),
                new Person("полов Илья Дрочевич", "Курьер", "qpooeep@mail.ru", 599951423, 35000, 19),
                new Person("Любимова Мария Егорова", "Бухгалтер", "zp@mail.ru", 99994123, 250000, 49),
                new Person("Довалова Олеся Батьковна", "Секритарь", "dayu@mail.ru", 969696963, 300000, 22),
                new Person("Стрижов Виталий Игоревич", "Завхоз", "drusch@mail.ru", 99783423, 45000, 41)};
        for (Person p : personal) {
            if (p.age > 40) {
                p.info();
            }
        }
    }
}






