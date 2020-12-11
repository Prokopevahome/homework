package Peregruzka_metodov;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        String s = "По книге, родители автора утверждали, что это — неизвестный науке зверь, который живёт в жарких тропических лесах.";
        System.out.println("Введите символ:");
        String t = tt.nextLine();
        for (int i = 0; i < s.length(); i++){
            int index = s.indexOf(t, i);
            if (index == -1){
                System.out.println("Больше не найдено.");
                break;
            }
            System.out.println(index);
            i = index;//чебурашка
        }
    }
}
