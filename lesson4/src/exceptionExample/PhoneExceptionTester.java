package exceptionExample;

public class PhoneExceptionTester {
    public static void main(String[] args) throws IllegalAccessException {

        String[] numbers={"91827","65796",null,"80196"};

        for(int i=0;i<numbers.length;i++) {
            try{
                System.out.println(new Phone("iPhone", numbers[i]));
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getLocalizedMessage());
            }

        }


    }
}
