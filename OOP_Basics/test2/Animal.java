package OOP_Basics.test2;

abstract public class Animal {
    private String name;
    private int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String makeSound(){
        return "Animal is making sound...";
    }
    public String sleep(){
        return "Animal is now sleeping...";
    }
    public String wakeUp(){
        return "Animal is now wake up";
    }
    abstract public String move();

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", legs=" + legs + '}';
    }
}
