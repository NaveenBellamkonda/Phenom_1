package inheritanceExample;

public class PersonTester {
    public static void main(String[] args){
        Person name= new Person("Naveen", "Bellamkonda");
        System.out.println(name);
        Student SId = new Student("Naveen","Bellamkonda","17D170029");
        System.out.println(SId);
        StudentEmployee SPhId= new StudentEmployee("Naveen", "Bellamkonda","17D170029", 100.00 ,"IC0927");
        System.out.println(SPhId);
    }
}
