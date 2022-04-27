package collectionsExercise;

import java.util.LinkedList;
import java.util.List;

public class CollectionsExercise {
    public static void main(String[] args){
        List<String> listOfNames=new LinkedList<String>();
        listOfNames.add("Naveen");
        listOfNames.add("Shreeya");
        listOfNames.add("Navya");

        for (String name:listOfNames){
            System.out.println(name+" "+name.length());
        }
    }
}
