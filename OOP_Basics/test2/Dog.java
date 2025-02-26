package OOP_Basics.test2;

public class Dog extends Animal{
    public Dog(String name, int legs) {
        super(name, legs);
    }

    @Override
    public String move() {
        return "Dog is now running...";
    }
}
