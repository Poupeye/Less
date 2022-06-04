package lesson5;

public class Person {
    private String name;
    private String jobTitle;
    private String email;
    private int tell;
    private int money;
    private int age;

    public Person(String name, String jobTitle, String email, int tell, int money, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.email = email;
        this.tell = tell;
        this.money = money;
        this.age = age;
    }

    public void  info() {
        System.out.println("Сотрудник-" + name + "\t" + "Возраст-" + age + "\t" + "Должность-" + jobTitle + "\t" + "Email-" + email + "\t" + "Телефон-" + tell + "\t" + "Затплата-" + money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTell() {
        return tell;
    }

    public void setTell(int tell) {
        this.tell = tell;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
