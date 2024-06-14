package dnekh.itcompany.staff;

import dnekh.itcompany.enums.Department;
import dnekh.itcompany.enums.Grade;

public class Manager extends Employee {

    private int teamSize;
    private int yearsOfExperience;

    public Manager(int id, String firstName, String lastName, int age, Department department, Grade grade, int income, int teamSize, int yearsOfExperience) {
        super(id, firstName, lastName, age, department, grade, income);
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
        return super.toString() +
                "teamSize=" + teamSize +
                ", yearsOfExperience=" + yearsOfExperience + "}";
    }
}
