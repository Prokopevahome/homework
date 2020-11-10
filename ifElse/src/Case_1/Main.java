package Case_1;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер дня недели:");
        int n = tt.nextInt();
        String a = "";
        switch (n){
            case 1: a = "Понедельник"; break;
            case 2: a = "Вторник"; break;
            case 3: a = "Среда"; break;
            case 4: a = "Четверг"; break;
            case 5: a = "Пятница"; break;
            case 6: a = "Суббота"; break;
            case 7: a = "Воскресенье"; break;
        }
        System.out.println(""+n+"-ый день недели это "+a);
    }
}
