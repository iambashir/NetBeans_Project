package classproject;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class P017_HashMapProject{

public static void main(String[] args) {

    // Create a HashMap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer>();

    // Add keys and values (Name, Age)
    people.put("Sajib", 32);
    people.put("Topu", 30);
    people.put("Bashir", 33);

    for (String i : people.keySet()) {
        System.out.println("Name: " + i + " Age: " + people.get(i));
    }
}

}
