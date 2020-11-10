package Zadacha8;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        int max = 0;
        for(int i = 1; i <= 32; i++){
            System.out.println("Введите оценку "+i+"-го ученика:");
            int a = tt.nextInt();
            if (a > max){
                max = a;
            }
        }
        System.out.println("Максимальная оценка: "+max);
    }
}
