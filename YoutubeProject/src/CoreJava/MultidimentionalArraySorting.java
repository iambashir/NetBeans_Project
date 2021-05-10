package CoreJava;

public class MultidimentionalArraySorting {

    public static void main(String[] args) {
        //Unsorted value
        int[][] a = {{1, 99, 91, 11, 12},
                    {0, 10, 9, 9, 11},
                    {3, 23, 21, 5, 20},
                    {13, 4, 45, 66, 33},
                    {11, 0, 1, 20, 56}
                    };

        System.out.println("After Sorting values");

        mysort(a);
    }

    //Sorting Array
    public static void mysort(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length - 1; j++) {
                for (int k = j + 1; k < a[i].length; k++) {
                    if (a[i][j] > a[i][k]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][j];
                        a[i][j] = temp;
                    }
                }
            }
        }
        //printing the sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.println();
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.println("\n");
    }

}
