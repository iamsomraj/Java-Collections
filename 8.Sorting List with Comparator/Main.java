// Commparator is an interface which is used for sorting. It has a compare method with two arguements.
// We have to use a different class in case of comparator

import java.util.*;

class Person
{
    String name; 
    Person(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name is : "+this.name;
    }
}


 class stringLengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if(len1>len2)
        {
            return 1;
        }

        if(len1<len2)
        {
            return -1;
        }

        return 0;

    }
}

class personNameComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return -o1.name.compareTo(o2.name);
    }
}
public class Main {
        
        public static void main(String[] args) {

            //creating the array list
            ArrayList<String> animal = new ArrayList<String>();
            //adding animals to array list

            animal.add("zebra");
            animal.add("peacock");
            animal.add("ant");
            animal.add("snake");
            animal.add("eagle");
            animal.add("bird");
            animal.add("dog");
            animal.add("cat");


            System.out.println("array list is displayed: ");
            System.out.println("before sorting : ");
            for(String s: animal)
            {
                System.out.println(s);
            }

            Collections.sort(animal, new stringLengthComparator());
            System.out.println("after sorting : ");

            for(String s: animal)
            {
                System.out.println(s);
            }


            // person objects are inserted and they are then sorted

            ArrayList<Person> people = new ArrayList<Person>();

            people.add(new Person("zebra"));
            people.add(new Person("peacock"));
            people.add(new Person("ant"));
            people.add(new Person("snake"));
            people.add(new Person("eagle"));
            people.add(new Person("bird"));
            people.add(new Person("dog"));
            people.add(new Person("cat"));


            System.out.println("People array list is displayed: ");
            System.out.println("before sorting : ");
            for(Person s: people)
            {
                System.out.println(s);
            }

            Collections.sort(people, new personNameComparator());
            System.out.println("after sorting : ");

            for(Person s: people)
            {
                System.out.println(s);
            }


    }

}