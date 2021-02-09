
package classproject;

public class P05a3_Array_Practice {
    
    // Single dimnetional array
    
    
    //Access the Elements of an Array
    public static void main(String[] args) {
        String[] cars = {"BMW","RR","Tata", "Ferari"};
        System.out.println(cars[2]);
        
        // Change an Array Element
     cars[2] = "Nano";
        System.out.println(cars[2]);
        
        //Array Length
        System.out.println(cars.length);
        
     //Loop Through an Array with For-Each
        for (String car : cars) {
            System.out.print(car + ", ");
        }
        
        
        System.out.println(" ");
        // Multidimnetional array
      
      String[][] carsBrand = {{"BMW"   , "Ford",  "Nano",    "Tata" },
                              {"Ferari", "Akdum", "Bakdum",  "RR"},
                              {"Honda" , "Hero" , "Discovery" ,}
                              };
        String x = carsBrand[0][2];
        
        System.out.println(x);
        
        
        
        
        
        
    }
}
