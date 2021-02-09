package basicjava;

public class BitwiseOperator {


    public static void main(String[] args) {
        int a = 23;
        int b = 6;
        int c;
                        //Bashir Hossain//
        c = a & b; // Bitwise & means multiplying between two values
        System.out.println("Bitwise a & b : " + c);

        c = a | b; // Bitwise | means adding between two values
        System.out.println("Bitwise a | b : " + c);

        c = a ^ b; // Bitwise ^(Exor) means ODD=0, Even=1
        System.out.println("Bitwise a ^ b : " + c);

        c = a >> 3; // Bitwise >> means /2 numberwise
        System.out.println("Bitwise  >> value : " + c);
        
        c = a << 3; // Bitwise << means /2 numberwise
        System.out.println("Bitwise  << value : " + c);
        
        // c = a >>> 3; // Bitwise >>> means 
        // System.out.println("Bitwise >>> value : " + c);

        c = ~ a  ; // 
        System.out.println("Bitwise ~  value : " + c);    

    }
}
