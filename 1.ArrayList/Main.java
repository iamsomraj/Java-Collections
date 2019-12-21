import java.util.*;
class Main
{
    public static void main(String args[])
    {
        //List is the interface. So it cannot be used to create instances
        //hence, we have to use ArrayList
        
        //Creation
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        //Adding value
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);
        
        
        System.out.println("Values are printed: ");
        
        //getting value from the array list with the help of index
        arr.get(0);
        arr.get(1);
        
        System.out.println("Indexed traversing : ");
        //Traversing through the array list
        for(int i = 0; i<arr.size() ; i++)
        {
            System.out.println(arr.get(i));
        }
        
        //Traversing through in a not indexed way
        System.out.println("Non indexed traversing");
        for(Integer i : arr)
        {
            System.out.println(i);        
        }
        
        //Removing with index. From the last it is very fast. But from the first it is very slow
        
        arr.remove(0); //slow
        arr.remove(arr.size()-1); //Fast
        System.out.println("After deleting , the array list becomes: ");
        for(Integer i: arr)
        {
            System.out.println(i);
        }
        
        //Creation in another way
        List<Integer> a = new ArrayList<Integer>();
        
    }
}