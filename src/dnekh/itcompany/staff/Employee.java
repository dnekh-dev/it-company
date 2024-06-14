package dnekh.itcompany.staff;

import dnekh.itcompany.enums.Department;
import dnekh.itcompany.enums.Grade;

public abstract class Employee {

    private final int id;
    private String firstName;
    private String lastName;
    private int age;
    private Department department;
    private Grade grade;
    private int income;

    public Employee(int id, String firstName, String lastName, int age, Department department, Grade grade, int income) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
        this.grade = grade;
        this.income = income;
    }

    public abstract void toWork();

    //getters and setters section
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", grade=" + grade +
                ", income=" + income +
                ", ";
    }
}
