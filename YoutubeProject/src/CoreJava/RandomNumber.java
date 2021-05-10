
package CoreJava;

import java.util.ArrayList;

public class RandomNumber {

    public static void main(String[] args) {
        //Create an array list
        ArrayList<Integer> arr = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            //Random number will be within 100
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
