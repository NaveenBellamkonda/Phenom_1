package mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {
    public static void main(String[] args){
        Map<String ,Person> mapOfPeople= new HashMap<String, Person>();
        ArrayList<Person> people=new ArrayList<Person>();
        Person naveen = new Person("Naveen","naveen@gmail.com");
        Person rajeev = new Person("rajeev","rajeev@gmail.com");
        Person Sam =new Person("Sam","sam@gmail.com");

        people.add(naveen);
        people.add(rajeev);
        people.add(Sam);

        for(Person person:people){
            mapOfPeople.put(person.getEmail(), person);
        }

        for(String email: mapOfPeople.keySet()){
            System.out.println(email);
        }
        for(Person person: mapOfPeople.values()){
            System.out.println(person);
        }

    }
}
