package Rabota_circle;

public class Circle {
    double x;
    double y;
    //радиус
    double r;
    double s;

    void printCircle() {
        System.out.println("(" + x + " ; " + y + ") r = " + r);
    }

    void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }
    void zoomCircle( double k ){r = r * k; }
    double squareCircle()
    {
        s = 3.14 * r *r;
    }

}