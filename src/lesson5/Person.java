package lesson5;

public class Person {
    public String name;
    public String jobTitle;
    public String email;
    public int tell;
    public int money;
    public int age;

    public Person(String name, String jobTitle, String email, int tell, int money, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.tell = tell;
        this.money = money;
        this.age = age;
    }

    public void info() {
        System.out.println("Сотрудник-" + name + "\t" + "Возраст-" + age + "\t" + "Должность-" + jobTitle + "\t" + "Email-" + email + "\t" + "Телефон-" + tell + "\t" + "Затплата-" + money);
    }
}
