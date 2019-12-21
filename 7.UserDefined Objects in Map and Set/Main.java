// When user defined objects are used as keys in maps or elements in sets
// we have to override the hashcode and equals method to our class


import java.util.*;

class Person
{
    String name ;
    int id;

    Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return ("\n\nId is : "+id+" Name is : "+name);
    }

    @Override
    public boolean equals(Object obj) {

        // first compare between the object and this instance
        // if same , then return true

        if(obj == this)
        {
            return true;
        }
        

        // second compare null and the object
        // and also the class of the object and this instance 
        // if not same return false

        if(obj == null || (obj.getClass() != this.getClass()))
        {
            return false;
        }

        // third create a guest and check all members
        // if integer then check the equals
        // if string first check the reference and then check by equals

        Person guest = (Person) obj;

        return (
            (this.id == guest.id) &&
            (this.name == guest.name || (this.name != null && (this.name).equals(guest.name)))
        );

    
    }

        @Override
        public int hashCode() {
          final int prime = 31;
          int result = 1;

          result = prime * result + (id);
          result = prime * result +  (this.name == null ? 0 : name.hashCode());

          return result;
        }


    
}

public class Main
{
    public static void main(String[] args) {
        Person p1 = new Person(1,"one ");
        Person p2 = new Person(2,"two ");
        Person p3 = new Person(3, "three ");
        Person p4 = new Person(1, "one ");

        //Creating the linked hash map and storing the user defined objects as key
        //As the equals and hashcode methods are overwritten, thats why no duplication is maintained
        LinkedHashMap<Person, String> linkedHashMap = new LinkedHashMap<Person, String>();
        linkedHashMap.put(p1,"one");
        linkedHashMap.put(p2,"one");
        linkedHashMap.put(p3,"one");
        linkedHashMap.put(p4,"one");


        //Creating linked hash set and checking the duplicasy

        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<Person>();
        linkedHashSet.add(p1);
        linkedHashSet.add(p2);
        linkedHashSet.add(p3);
        linkedHashSet.add(p4);
        System.out.println("The linked hash map is printed: ");
        for(Map.Entry<Person,String> entry : linkedHashMap.entrySet())
        {
            System.out.println(entry.getKey());
        }
        System.out.println("The linked hash set is printed: ");
        for(Person P: linkedHashSet)
        {
            System.out.println(P);
        }

    }


}