import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        System.out.println("Array list maintains an array internally!");
        System.out.println("Linked list maintains a two way linked list!");
        System.out.println("For adding or removing items from the list, Linked list is preffered!");
        
        List<Integer> linkedList = new LinkedList<Integer>();
        
        //adding values
        
        for(int i = 0; i< 10; i++)
        {
            linkedList.add(i);
        }
        
        //removing values
        
        linkedList.remove(5);
        
        display(linkedList);
    }
    
    public static void display(List<Integer> list)
    {
        System.out.println("Linked List is displayed below: ");
        for(int i = 0; i<list.size() ; i++)
        {
            System.out.println(list.get(i));
        }
    }
}