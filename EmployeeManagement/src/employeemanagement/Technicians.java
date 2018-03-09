//Paul & Robert
package employeemanagement;

public class Technicians extends Employee {
    
    private String floor;
    int bonus = 10;

    public Technicians(String name, String email, String gender, String dateOfBirth, int salary, String floor) {
        super(name, email, gender, dateOfBirth, salary);
        this.floor = floor;
    }

    
    public String getFloor() {
        return floor;
    }

    
    public void setFloor(String floor) {
        this.floor = floor;
    }
    
    @Override
    public int calcBonus() {
        return this.salary*bonus/200;
    }
}
