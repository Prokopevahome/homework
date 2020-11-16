package Arrays_mas1;

public class Main {
    public static void main(String[] args) {
        int[][] arr1 = new int[4][4];
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i==j){ arr1[i][j] = 0; }
                else if(j>i){ arr1[i][j] = 1; }
                else { arr1[i][j] = 5; }
            }
        }
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
