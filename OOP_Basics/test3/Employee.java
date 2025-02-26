package OOP_Basics.test3;

public class Employee implements EmployeeImpl{
    private String name;
    private int exp;

    public Employee(String name, int exp) {
        this.name = name;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String sayHello(){
        return "Employee saying Hello!";
    }

    @Override
    public String sayBye() {
        return "Employee Saying bye";
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", exp='" + exp + '\'' + '}';
    }
}
