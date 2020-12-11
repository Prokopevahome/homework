package fractioncalculator;

import java.util.Scanner;

public class Main {
    static Scanner c =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("ввидите числитель и знаменатель первой дроби ");
        int x1 = c.nextInt();
        int y1 = c.nextInt();
        System.out.println("ввидите чиститель и знаменатель второй дроби");
        int x2 = c.nextInt();
        int y2 = c.nextInt();
        Fraction f1 = new Fraction(x1, y1);
        Fraction f2 = new Fraction(x2, y2);
        Fraction summa = Character.add(f1, f2);
        System.out.println("Сума даних дробей равна ");
        View.display(summa);
    }
}
