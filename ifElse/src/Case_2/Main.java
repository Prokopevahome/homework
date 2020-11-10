package Case_2;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер месяца:");
        int n = tt.nextInt();
        System.out.println("Год высокосный?");
        String t = tt.nextLine();
        boolean v = t == "Да";
        String m = "";
        switch (n){
            case 1: m = "Январь: "+31; break;
            case 2: m = "Февраль: "+(v ? 29 : 28); break;
            case 3: m = "Март: "+31; break;
            case 4: m = "Апрель: "+30; break;
            case 5: m = "Май: "+31; break;
            case 6: m = "Июнь: "+30; break;
            case 7: m = "Июль: "+31; break;
            case 8: m = "Август: "+31; break;
            case 9: m = "Сентябрь: "+30; break;
            case 10: m = "Октябрь: "+31; break;
            case 11: m = "Ноябрь: "+30; break;
            case 12: m = "Декабрь: "+31; break;
        }
        System.out.println(m);
    }
}
