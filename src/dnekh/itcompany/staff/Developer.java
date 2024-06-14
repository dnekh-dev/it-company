package dnekh.itcompany.staff;

import dnekh.itcompany.enums.Department;
import dnekh.itcompany.enums.Grade;

public class Developer extends Employee {

    private String programmingLanguage;
    private boolean isBackEndDeveloper;

    public Developer(int id, String firstName, String lastName, int age, Department department, Grade grade, int income, String programmingLanguage, boolean isBackEndDeveloper) {
        super(id, firstName, lastName, age, department, grade, income);
        this.programmingLanguage = programmingLanguage;
        this.isBackEndDeveloper = isBackEndDeveloper;
    }

    @Override
    public void toWork() {
        System.out.println("Developer is working");
    }

    //getters and setters section
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public boolean isBackEndDeveloper() {
        return isBackEndDeveloper;
    }

    public void setBackEndDeveloper(boolean backEndDeveloper) {
        isBackEndDeveloper = backEndDeveloper;
    }

    @Override
    public String toString() {
        return super.toString() +
                "programmingLanguage=" + programmingLanguage +
                ", isBackEndDeveloper=" + isBackEndDeveloper + "}";
    }
}
