//Map is an interface. It stores key and their corresponding values.
//HashMap is a class. It does not maintain the order
//It does not have duplicate keys . If same key is used, then the value gets overwritten

import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        System.out.println("Creating a hash map: ");
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        System.out.println("Adding keys and values to hash map: ");
        map.put(1,"One");
        map.put(2,"Two");
        map.put(5,"Five");
        
        System.out.println("Getting values from the hash map: ");
        String val = map.get(5);
        System.out.println(val);
        
        
        System.out.println("For iterating through the hash map: ");
        
        for(Map.Entry<Integer,String> entry: map.entrySet())
        {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" "+value);
            
        }
    }
}