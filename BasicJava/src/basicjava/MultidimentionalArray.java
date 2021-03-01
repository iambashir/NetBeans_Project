package basicjava;

public class MultidimentionalArray {
  public static void main(String[] args) {
        int k;
        int[][] a = {{1,99,91,11,44},
                    {0,10,9,9,11},
                    {3,23,21,5,20},
                    {13,4,45,66,33},
                    {11,0,1,20,56}};
        System.out.println("2D arrays are sorted in ascending order : ");
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int m = j + 1; m < a[i].length; m++) {
                    if (a[i][j] > a[i][m]) {
                        k = a[i][m];
                        a[i][m] = a[i][j];
                        a[i][j] = k;
                    }
                }
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
}
