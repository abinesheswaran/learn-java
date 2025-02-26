package OOP_Basics.test2;

public class Cat extends Animal{
    public Cat(String name, int legs) {
        super(name, legs);
    }

    @Override
    public String move() {
        return "Cat is now running...";
    }
}
