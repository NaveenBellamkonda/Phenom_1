package regExExample;

import java.util.regex.Pattern;

public class RegExTester {
    public static void main(String[] args){
        String emailRegEx="^(.+)@(.+).com$";
        Pattern pattern= Pattern.compile(emailRegEx);
        System.out.println(new Person("Naveen","naveen@gmail.dom"));
    }
}
