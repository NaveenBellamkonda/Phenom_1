public class ArrayExercise {
    public static void main(String[] args){
        ploop();
    }
    public static void ploop(){
        int[] numbers = {1,2,3,4};
        String[] words = {"Ignition Sequence Start!","Liftoff!"};
        System.out.println(words[0]);
        int i=0;
        while(i < numbers.length){
            System.out.println(numbers[i]);
            i+=1;
        }
        System.out.println(words[1]);
    }