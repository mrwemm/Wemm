//Paul & Robert
package employeemanagement;

public class Programmers extends Employee{
    
    private String programLang;
    int bonus = 10;

    public Programmers(String name, String email, String gender, String dateOfBirth, int salary, String programLang) {
        super(name,email,gender,dateOfBirth,salary);
        this.programLang = programLang;
    }

    
    public String getProgramLang() {
        return programLang;
    }

    
    public void setProgramLang(String programLang) {
        this.programLang = programLang;
    }
    
    @Override
    public int calcBonus() {
        return this.salary*bonus/50;
    }

    
    
}
