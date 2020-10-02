//Comparable is an interface which is implemented. Now it directly goes with the class
//Tree set is a set which is a child of actually SortedSet.

import java.util.*;

class Person implements Comparable<Person>
{
    String name;

    Person(String name)
    {
        this.name = name;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
        {
            return true;
        }
        if(obj==null || this.getClass() != obj.getClass())
        {
            return false;
        }
        Person guest = (Person) obj;
        return (
            (guest.name==this.name) ||
            (this.name != null && this.name.equals(guest.name))
        );

        
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + (this.name == null ? 0 : this.name.hashCode());
        return result;
    }

    @Override
    public int compareTo(Person o) {
        return (
            this.name.compareTo(o.name)
        );
    }

    @Override
    public String toString() {
        return "Person name : "+this.name;
    }


}
public class Main
{
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<String>();

        names.add("peter");
        names.add("same");
        names.add("mike");
        names.add("peter");
        names.add("barry");

        //display("treeset", names);

        TreeSet<Person> people = new TreeSet<Person>();

        people.add(new Person("peter"));
        people.add(new Person("same"));
        people.add(new Person("mike"));
        people.add(new Person("peter"));
        people.add(new Person("barry"));
        people.add(new Person("peter"));        
        people.add(new Person("peter"));
        people.add(new Person("barry"));
        people.add(new Person("peter"));        
        people.add(new Person("peter"));
        people.add(new Person("barry"));
        people.add(new Person("peter"));        
        people.add(new Person("peter"));
        people.add(new Person("barry"));
        people.add(new Person("peter"));
        

        display("people treeset", people);


        
    
    }

    public static void display(String name,Collection<Person> collection)
    {
        System.out.println("Collection is : "+name);
        System.out.println("Collection contains : ");
        for(Person s: collection)
            System.out.println(s);
    }
}
