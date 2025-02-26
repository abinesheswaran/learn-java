import OOP_Basics.test1.Bike;
import OOP_Basics.test1.Car;
import OOP_Basics.test1.Vehicle;

public class HelloWorld {
    public static void main(String args []){
        System.out.println("Hello World!");
        sayHello("Abinesh");
        Vehicle car = new Car(1234,"TN","D");
        System.out.println(car.toString());
        Bike bike =new Bike(4321,"TN","D");
        System.out.println(bike.toString());
    }
    public static void sayHello(String name){
        System.out.println("Hello, My name is "+name);
    }
}
