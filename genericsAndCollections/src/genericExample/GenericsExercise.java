package genericExample;

import java.util.ArrayList;

public class GenericsExercise {
    public static void main(String[] args){
        ArrayList<Object> variables=new ArrayList<Object>();
        Double doublen=1.4;
        String name="Naveen";
        Integer intNumber=7;
        Character letter='a';

        variables.add(doublen);
        variables.add(name);
        variables.add(intNumber);
        variables.add(letter);

        for(Object variable:variables){
            GenericsExercise.displayClassName(variable);
        }
    }
    static <T>void displayClassName(T variable){
        System.out.println(variable.getClass().getName());
    }
}
