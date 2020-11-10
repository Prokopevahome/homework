package Ternary_2;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите год:");
        int a = tt.nextInt();
        boolean v = a%100==0 ? a%400==0 : a%4==0;
        System.out.println(v ? "Да, год высокосный." : "Нет, год не высокосный.");
    }
}
