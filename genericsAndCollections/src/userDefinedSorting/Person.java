package userDefinedSorting;

public class Person implements Comparable<Person> {
    String name;
    public Person(String name){
        this.name=name;
    }

    @Override
    public int compareTo(Person person) {
        return name.compareTo(person.name);
    }
}
