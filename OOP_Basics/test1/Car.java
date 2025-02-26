package OOP_Basics.test1;

public class Car extends Vehicle{
    public Car(int id, String state, String district) {
        super(id, state, district);
    }

    @Override
    public String startEngine() {
        return "Starting the car Engine...";
    }

    public String turnOnAc(){
        return "Turning on Ac...";
    }
    public String turnOffAc(){
        return "Turning off Ac...";
    }
}
