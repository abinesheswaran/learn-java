package OOP_Basics.test1;

public class Vehicle {
    private int id;
    private String state;
    private String district;

    Vehicle(int id, String state, String district) {
        this.id = id;
        this.state = state;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String startEngine() {
        return "Engine Starging...";
    }

    public String stopEngine() {
        return "Engine Stoping...";
    }

    @Override
    public String toString() {
        return "OOP.Vehicle{" + "id=" + id + ", state='" + state + '\'' + ", district='" + district + '\'' + '}';
    }
}
