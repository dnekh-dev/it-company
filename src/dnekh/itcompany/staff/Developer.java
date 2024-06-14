package dnekh.itcompany.staff;

public class Developer extends Employee {

    private String programmingLanguage;
    private boolean isBackEndDeveloper;

    public Developer(int id, String firstName, String lastName, int age, String occupation, int income, String programmingLanguage, boolean isBackEndDeveloper) {
        super(id, firstName, lastName, age, occupation, income);
        this.programmingLanguage = programmingLanguage;
        this.isBackEndDeveloper = isBackEndDeveloper;
    }

    public Developer(String programmingLanguage, boolean isBackEndDeveloper) {
        this.programmingLanguage = programmingLanguage;
        this.isBackEndDeveloper = isBackEndDeveloper;
    }

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
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", isBackEndDeveloper=" + isBackEndDeveloper +
                '}';
    }
}
