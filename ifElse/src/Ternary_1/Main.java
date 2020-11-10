package Ternary_1;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите сторону а:");
        int a = tt.nextInt();
        System.out.println("Введите сторону b:");
        int b = tt.nextInt();
        System.out.println("Введите сторону c:");
        int c = tt.nextInt();
        boolean t = a==b ? true : a==c ? true : b==c ? true : false;
        System.out.println(t ? "Да, треугольник равнобедренный." : "Нет, треугольник не равнобедренный.");
    }
}
