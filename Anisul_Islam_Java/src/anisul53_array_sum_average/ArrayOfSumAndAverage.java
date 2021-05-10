package anisul53_array_sum_average;

import java.util.Scanner;

public class ArrayOfSumAndAverage {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] num = new double[5];
        double sum = 0;
        
        System.out.println("Please enter five numbers : ");

        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextDouble();
        }

        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }

        double max = num[0];
        double min = num[0];

        for (int i = 0; i < 5; i++) {

            if (max < num[i]) {
                max = num[i];
            }

            if (min > num[i]) {
                min = num[i];
            }
        }

//        num[0] = scan.nextInt(); 
//        num[1] = scan.nextInt(); 
//        num[2] = scan.nextInt(); 
//        num[3] = scan.nextInt(); 
//        num[4] = scan.nextInt(); 
        //int sum = num[0]+num[1]+num[2]+num[3]+num[4];
        
        System.out.println("Sum of five numbers :" + sum);
        System.out.println("Average of five numbers :" + sum / num.length);
        System.out.println("Maximum Number : " + max);
        System.out.println("Minimum Number : " + min);

    }

}
