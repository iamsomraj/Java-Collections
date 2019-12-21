// Set is also an interface. Set does not conatin duplicate elements.
// Hash set is a  class but it does not maintain order
// LinkedHashSet is a class but it maintains the insertion order
// TreeSet is a set that makes the elements in the natural sorting order



//Set has many methods like contains and isEmpty()

//Intersection is done with retainAll method. A intersection B 
//Difference is done with removeAll method. A difference B 


import java.util.*;




public class Main
{
    public static void main(String args[])
    {
        System.out.println("Creation of the HashSet");
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("Bird");
        hashSet.add("Dog");
        hashSet.add("Giraffe");
        hashSet.add("Elephant");
        hashSet.add("Cat");

        System.out.println("Creation of linked hash set: ");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Bird");
        linkedHashSet.add("Dog");
        linkedHashSet.add("Giraffe");
        linkedHashSet.add("Elephant");
        linkedHashSet.add("Cat");

        System.out.println("Creation of tree set: ");
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Bird");
        treeSet.add("Dog");
        treeSet.add("Giraffe");
        treeSet.add("Elephant");
        treeSet.add("Cat");

        System.out.println("Contains method is checked: ");
        if(treeSet.contains("ant"))
        {
            System.out.println("It contains ant!");
        }

        if(treeSet.contains("Dog"))
        {
            System.out.println("It contains dog!");
        }


        System.out.println("isEmpty method is checked");
        if(treeSet.isEmpty())
        {
            System.out.println("Tree set is empty");
        }
        else{
            System.out.println("Tree set is not empty");
        }

        display("hash set", hashSet);
        display("linked hash set", linkedHashSet);
        display("tree set", treeSet);

        LinkedHashSet<String> linkedHashSet2 = new LinkedHashSet<String>();
        linkedHashSet2.add("Bird new ");
        linkedHashSet2.add("Dog");
        linkedHashSet2.add("Giraffe new ");
        linkedHashSet2.add("Elephant new ");
        linkedHashSet2.add("Cat");


        System.out.println("Intersection is performed on the intersection set with method retainAll");
        LinkedHashSet<String> intersection = new LinkedHashSet<String>(linkedHashSet2);

        display("intersection before", intersection);

        intersection.retainAll(linkedHashSet);

        display("intersection after", intersection);


        LinkedHashSet<String> difference = new LinkedHashSet<String>(linkedHashSet2);

        display("Difference before ", difference);
        difference.removeAll(linkedHashSet);
        display("difference after", difference);


    }

    public static void display(String name, Set<String> set)
    {
        System.out.println("\n\n"+name+":\n\n");
        System.out.println("In a single line: ");
        System.out.println(set);

        System.out.println("With the help of For Loop");
        for(String s: set)
        {
            System.out.println(s);
        }
    }
}