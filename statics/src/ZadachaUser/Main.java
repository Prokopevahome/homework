package ZadachaUser;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Кристина", "Прокопьева ", 1986);
        System.out.println(u1.name + " " + u1.surname + " " + u1.getAge());
        User u2 = new User("Иван", "Попович", 2005);
        System.out.println(u2.name + " " + u2.surname + " " + u2.getAge());
    }
}
