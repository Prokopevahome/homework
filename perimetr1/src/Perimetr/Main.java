package Perimetr;

public class Main {
    public static void main(String[] args) {
        Model s = new Model();
        s.t = 12;
        s.f = 8;
        Controller c = new Controller();
        int c0 = c.perimeter(s.t, s.f);
        int c1 = c.square(s.t,s.f);
        Vuvod w = new Vuvod();
        w.printPL(c1);
        w.printPR(c0);
    }
}
