package ifElse_8;

public class Main {
    public static void main(String[] args) {
        int s = (int) Math.floor(Math.random()*5);
        int w = (int) Math.floor(Math.random()*5);
        System.out.println("У Кузьки вылезло "+s+" зубов.");
        System.out.println("У бабы Дуси осталось "+w+" зубов.");
        if(s > w){
            System.out.println("У Кузьки больше зубов чем у Дуси.");
        } else {
            System.out.println("У Дуси больше зубов чем у Кузьки.");
        }
    }
}
