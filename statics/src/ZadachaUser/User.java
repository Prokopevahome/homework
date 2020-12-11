package ZadachaUser;

public class User {
    String name;
    String surname;
    int birthYear;
    public User(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
    int getAge(){
        return 2020 - birthYear;
    }
}
