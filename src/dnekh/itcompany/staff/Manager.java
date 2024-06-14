package dnekh.itcompany.staff;

public class Manager extends Employee {

    private String department;
    private int teamSize;
    private int yearsOfExperience;

    public Manager(int id, String firstName, String lastName, int age, String occupation, int income, String department, int teamSize, int yearsOfExperience) {
        super(id, firstName, lastName, age, occupation, income);
        this.department = department;
        this.teamSize = teamSize;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Manager(int income, String department, int teamSize, int yearsOfExperience) {
        super(income);
        this.department = department;
        this.teamSize = teamSize;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void manipulate(String... names) {
        for (var name : names) {
            System.out.printf("%s must does his work!", name);
        }
    }

    @Override
    public void toWork() {
        System.out.println("Manager is working");
    }

    //getters and setters section
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "department='" + department + '\'' +
                ", teamSize=" + teamSize +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
