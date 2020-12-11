package rabota_cilde;

public class Сircle {
    //координаты центра
    double x;
    double y;
    //радиус
    double r;
    void printCircle(){
        System.out.println("(" + x +";" + y + ")");
    }
    void moveCircle(double a, double b){
        x=x+a;
        y= y+b;
    }
    void zoomCircle(double k){
        r=r*k;
    }
}
