package iteratorExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExercise {
    public static void main(String[] args){
        List<String> names=new ArrayList<String>();
        names.add("Naveen");
        names.add("raji");
        names.add("Shreeya");

        Iterator<String > iterators= names.iterator();

        while (iterators.hasNext()){
            System.out.println(iterators.next());
        }

    }
}
