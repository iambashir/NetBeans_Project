
package CoreJava;

public class ClosestNumber {
    static double[] findClosest(double[] dblArray) {
        double[] closest = new double[2];
        double bestDiff = Double.MAX_VALUE;
        double currDiff;
        for (int i = 0; i < dblArray.length; i++) {
            for (int j = 0; j < dblArray.length; j++) {
                if (i != j) {
                currDiff = Math.abs(dblArray[i] - dblArray[j]);
                if (currDiff < bestDiff) {
                    closest[0] = dblArray[i];
                    closest[1] = dblArray[j];
                    bestDiff = currDiff;

                   }
                }
            }
        }
        return closest;
    }
       //Enter your number within this array how many numbers you want to compare
       public static void main(String[] args) {
       double[] testArray = new double[]{10, 20, 25, 40, 50, 60, 70, };
       double[] resultArray = findClosest(testArray);
       System.out.println("Closest were: " + resultArray[0] + ", " + resultArray[1]);   
        
    }
    
}
