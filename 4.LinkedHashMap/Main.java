//LinkedHashMap is a class which implements the map interface.
//LinkedHashMap is a map which maintains the order in which they are put in.

import java.util.*;
public class Main
{
    public static void main(final String args[])
    {
        final LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();

        System.out.println("Adding values to the map");

        linkedHashMap.put(1, "aa");
        linkedHashMap.put(2, "bb");
        linkedHashMap.put(3, "cc");
        linkedHashMap.put(6,"dd");
        linkedHashMap.put(8, "rr");

        System.out.println("traversing through the map using Map.Entry");

        for(Map.Entry<Integer,String> entry:  linkedHashMap.entrySet())
        {
            int key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key+":  "+value);
        }

        System.out.println("Traversing through the map using getKeys");
        

        for(Integer i: linkedHashMap.keySet())
        {
            String value = linkedHashMap.get(i);
            System.out.println(i+":: "+value);
        }
    }
}