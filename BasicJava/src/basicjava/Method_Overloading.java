
package basicjava;

public class Method_Overloading {
    
    static int plusMethod(int x, int y ){
    return x+y;
    }
    
    static double plusMethod(double x, double y ){
    return x+y;
 
    
    }
    

    public static void main(String[] args) {
        
        int myNum1 = plusMethod(2, 8);
        double myNum2 = plusMethod(10.25, 5.35);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        
        
    }
    

}
