//Tree map is a class under map. It stores the key in the natural sorting order
import java.util.*;

public class Main
{
    public static void main(String args[]) {
        Map<Integer, String> map = new TreeMap<Integer, String>();
        
        System.out.println("Adding values to the map : ");
        String v = "a";
        for(int i = 0; i<5; i++)
        {
            map.put(i, v);
            v = v + "a";
        }

        System.out.println("Traversing through the map");

        for(Map.Entry<Integer, String> entry : map.entrySet() )
        {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":: "+value);
        }
    
        
    }
}