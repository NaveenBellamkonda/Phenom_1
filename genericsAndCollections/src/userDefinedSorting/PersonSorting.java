package userDefinedSorting;

import java.util.ArrayList;
import java.util.Collections;

public class PersonSorting{
    public static void main(String[] args){
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Naveen"));
        people.add(new Person("Shreeya"));
        people.add(new Person("Navya"));

        for (Person each:people) System.out.println(each.name);

        Collections.sort(people);

        for (Person person:people) System.out.println(person.name);
    }
}
