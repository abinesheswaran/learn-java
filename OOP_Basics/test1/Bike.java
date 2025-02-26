package OOP_Basics.test1;

public class Bike extends Vehicle{
    public Bike(int id, String state, String district) {
        super(id, state, district);
    }
    @Override
    public String startEngine() {
        return "Bike Engine Starging...roommmm rommmmmm!";
    }
}
