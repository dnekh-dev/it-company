package dnekh.itcompany.staff;

import dnekh.itcompany.enums.Department;
import dnekh.itcompany.enums.Grade;

public class Designer extends Employee {

    private String designTools;
    private String specialization;

    public Designer(int id, String firstName, String lastName, int age, Department department, Grade grade, int income, String designTools, String specialization) {
        super(id, firstName, lastName, age, department, grade, income);
        this.designTools = designTools;
        this.specialization = specialization;
    }

    @Override
    public void toWork() {
        System.out.println("Designer is working");
    }

    //getters and setter section
    public String getDesignTools() {
        return designTools;
    }

    public void setDesignTools(String designTools) {
        this.designTools = designTools;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() +
                "designTools=" + designTools +
                ", specialization=" + specialization + "}";
    }
}