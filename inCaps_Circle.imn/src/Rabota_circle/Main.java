package Rabota_circle;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Circle c1 =new Circle();
        c1.printCircle();
        c1.x = 3;
        c1.y = 6;
        c1.printCircle();
        c1.r = 13.4;
        c1.zoomCircle();
        c1.printCircle();
        System.out.println( c1.squareCircle());
    }
}
