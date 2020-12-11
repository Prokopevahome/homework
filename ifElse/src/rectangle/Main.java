package rectangle;

public class Main {
    public static void main(String[] args) {
        Line a = new Line();
        a.a = 56;
        a.b = 34;
        a.c = 12;
        PIPer pp = new PIPer();
        int pp1 = pp.square(a.a, a.b, a.c);
        int pp2 = pp.volume(a.a, a.b, a.c);
        Vuvod w = new Vuvod();
        w.printPl(pp1);
        w.printob();
    }
}
