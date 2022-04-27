package queueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args){
        Queue<String > numbers= new LinkedList<String>();
        numbers.add("1234");
        numbers.add("2346");
        numbers.add("5378");
        numbers.add("9537");
        numbers.add("1234");
        numbers.add("2346");
        numbers.add("5378");
        numbers.add("9537");
        numbers.add("1234");

        while (!numbers.isEmpty()) System.out.println(numbers.poll());
    }
}
