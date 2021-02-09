package bashir1259855;

import java.util.ArrayList;

public class P07_Random_Number {

public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(10);
    for (int i = 0; i < 10; i++) {
        int temp = (int) (Math.random() * 100);
        while (arr.contains(temp)) {
            System.out.println(temp);
            temp = (int) (Math.random() * 100);
        }
        arr.add(temp);
    }

    System.out.println(arr.toString());
}
}
