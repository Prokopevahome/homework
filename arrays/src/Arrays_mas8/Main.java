package Arrays_mas8;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = new int[20][20];
        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 20; j++){
                arr1[i][j] = (int)(Math.random()*70-30);
            }
        }
        int[] arr2 = new int[20];
        for(int i = 0; i < 20; i++){
            int sum = 0;
            for(int j = 0; j < 20; j++){
                sum += arr1[i][j];
            }
            arr2[i] = sum;
        }
        for(int i : arr2){
            System.out.print(i+" ");
        }
    }
}
