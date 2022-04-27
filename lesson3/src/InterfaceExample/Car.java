package InterfaceExample;

public class Car {
    private String type;
    private String speed;
    private String color;

    public Car(String type,String speed,String color){
        this.type=type;
        this.speed=speed;
        this.color=color;
    }

    public String getType(){
        return type;
    }
    public String getSpeed(){
        return speed;
    }
    public String getColor(){
        return color;
    }
}
