import OOP_Basics.test1.Bike;
import OOP_Basics.test1.Car;
import OOP_Basics.test2.Animal;
import OOP_Basics.test2.Cat;
import OOP_Basics.test2.Dog;
import OOP_Basics.test3.Employee;
import OOP_Basics.test3.Manager;

public class HelloWorld {
    public static void main(String args []){
        System.out.println("*****************###########***********###########");
        System.out.println("Hello World!");
        sayHello("Abinesh");
        System.out.println("*****************###########***********###########\n");
        Car car = new Car(1234,"TN","D");
        System.out.println(car.toString());
        System.out.println(car.turnOffAc());
        System.out.println("*****************###########***********###########");
        Bike bike =new Bike(4321,"TN","D");
        System.out.println(bike.toString());
        System.out.println(bike.startEngine());
        System.out.println(bike.stopEngine());
        System.out.println("*****************###########***********###########\n");
        Animal dog = new Dog("Puppy",4);
        System.out.println(dog.toString());
        System.out.println("*****************###########***********###########");
        Animal cat = new Cat("Tom",4);
        System.out.println(cat.toString());
        System.out.println("*****************###########***********##########\n");
        Employee employee = new Employee("abinesh",3);
        Manager manager = new Manager("Arun",25,"Raksha");
        System.out.println(employee.sayHello());
        System.out.println(manager.sayBye());
    }
    public static void sayHello(String name){
        System.out.println("Hello, My name is "+name);
    }
}
