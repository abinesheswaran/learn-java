package OOP_Basics.test3;

public class Manager extends Employee{
    private String team;

    public Manager(String name, int exp, String team) {
        super(name, exp);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

}
