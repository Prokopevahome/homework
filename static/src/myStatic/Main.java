package myStatic;

public class Main {
   int y = 30;
  static int z = 40;
    public static void main(String[] args) {
        int x = 20;
        System.out.println(x);
        Main a = new Main();
        System.out.println(a.y);
        a.display();
    }
    void display(){
        System.out.println(y);
        System.out.println(z);
    }
}
