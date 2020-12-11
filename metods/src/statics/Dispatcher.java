package statics;

public class Dispatcher {
    int m = 30;
    public static void main(String[] args) {
        int g = 20;
        System.out.println(g);
        Dispatcher f = new Dispatcher();
        System.out.println(g);
        display();
    }
    void display(){
        System.out.println(m);

    }
}
