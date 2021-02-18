
// Java Method Parameters Practice - 01

//package basicjava;
//
//public class Methods_Parameters{
//
//static void myMethod(){
//    for (int i = 0; i < 5; i=i+2) {   
// 
//    System.out.println("Age: " + i);
// }
//    
//}
//    public static void main(String[] args) {
//        myMethod();
//        myMethod();
//        myMethod();
//    }
//}
//    
    

// Java Method Parameters Practice - 02

//package basicjava;
//public class Methods_Parameters{
//
//    static void myMethod(String fname){
//        System.out.println(fname + "Years old");
//    
//    }
//    
//    public static void main(String[] args) {
//        myMethod("Bashir 30 ");
//        myMethod("Tushar 28 ");
//        myMethod("Raihan 27 ");
//        
//    }
//}
  
    
    // Java Method Parameters Practice - 03

package basicjava;
public class Methods_Parameters{

    static int myMethod(int x, int y , int k){
        return x + y + k ;
        
    }

    public static void main(String[] args) {
      int z = myMethod(5,8, 2);  
        System.out.println(z);     
        
    }

}