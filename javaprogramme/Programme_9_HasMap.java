package javaprogramme;
/** Create a HashMap object called people that will store String keys and Integer
 values: And use for each loop to iterate the value from Map.*/
 import java.util.HashMap;
import java.util.Map;

public class Programme_9_HasMap {
    public static void main(String[] args) {

        Map<String, Integer> people = new HashMap<>();
        people.put("John", 32);
        people.put("Jane", 28);
        people.put("Bob", 45);

        for (Map.Entry<String,Integer> entry : people.entrySet()){
            System.out.println(entry.getKey() + " is " + entry.getValue() + " years old ");
        }

    }
}
