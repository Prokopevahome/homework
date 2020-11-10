package Zadacha16;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        for(int i = 1; i <= 2; i++){
            System.out.println("Группа "+i+":");
            int n = 0;
            for(int j = 1; j <= 32; j++){
                System.out.println("Введите рост "+j+"-го ученика:");
                int a = tt.nextInt();
                if (a >= 180){
                    n++;
                }
            }
            System.out.println(""+n+" учеников могут посещать волейбольную секцию.");
        }
    }
}
