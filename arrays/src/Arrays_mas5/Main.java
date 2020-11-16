package Arrays_mas5;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr1[i][j] = (int)(Math.random()*10);
            }
        }
        int[] arr2 = new int[5];
        for(int i = 0; i < 5; i++){
            int sum = 0;
            for(int j = 0; j < 5; j++){
                sum += arr1[i][j];
            }
            arr2[i] = sum;
        }
        for(int i : arr2){
            System.out.print(i+" ");
        }
    }
}
