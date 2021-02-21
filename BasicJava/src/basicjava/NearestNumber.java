package basicjava;

public class NearestNumber {
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
    public static void main(String[] args) {

        //Enter Your values within this array how many numbers you want to compare
        double[] testArray = new double[]{10, 20, 25, 40, 50, 60};
        double[] resultArray = findClosest(testArray);
        System.out.println("Closest were: " + resultArray[0] + ", " + resultArray[1]);
    }
}
