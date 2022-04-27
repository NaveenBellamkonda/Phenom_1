package scannerExample;

import java.util.Scanner;

public class UserInputTester {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Please enter a String");
            String UserInput = scanner.nextLine();
            System.out.println(UserInput);
        }catch (Exception ex){
            ex.getLocalizedMessage();
        }finally {
            scanner.close();
        }
    }
}
