package bashir1259855;

public class P04_Multidimentional_Array {

public static void main(String[] args) {
    int[][] a = new int[5][5];
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            a[i][j] = (int) (Math.random() * 10);
        }
    }
    System.out.println("before sorting ....");
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println("after sorting ....");

    //calling method for sorting and printing sorted array
    sort2D(a);

}

//sorting the array

public static void sort2D(int[][] a) {
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length - 1; j++) {
            for (int k = 0; k < a[i].length - j - 1; k++) {
                if (a[i][k] > a[i][k + 1]) {
                    int temp = a[i][k];
                    a[i][k] = a[i][k + 1];
                    a[i][k + 1] = temp;
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
}

}
