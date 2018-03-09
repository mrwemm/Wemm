//Paul & Robert
package employeemanagement;

public class Administration extends Employee{
    
   private String department;
   int bonus = 10;

    public Administration(String name, String email, String gender, String dateOfBirth, int salary, String department) {
        super(name,email,gender,dateOfBirth,salary);
        this.department = department;
    }

    
    public String getDepartment() {
        return department;
    }

    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public int calcBonus() {
        return this.salary*bonus/100;
    }
    
    
}