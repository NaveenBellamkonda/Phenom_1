package setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args){
        List<String > numbers= new ArrayList<String>();
        numbers.add("1234");
        numbers.add("2346");
        numbers.add("5378");
        numbers.add("9537");
        numbers.add("1234");
        numbers.add("2346");
        numbers.add("5378");
        numbers.add("9537");
        numbers.add("1234");

        Set<String> uniqueNumbers=new HashSet<String>(numbers);

        for(String number:uniqueNumbers){
            System.out.println(number);
        }
    }
}
