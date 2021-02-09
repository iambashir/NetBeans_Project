package classproject;

public class P22_NestedLoop {
 public static void main(String[] args) {
     //Run|debug
        int count = 0;
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= i; j++){
                for(int k = j; k < 2; k++){
                    System.out.println(i + " " + j + " " + k);
                    //System.out.println("Bashir");
                    count++;
                }
            }
        }
    }

}
