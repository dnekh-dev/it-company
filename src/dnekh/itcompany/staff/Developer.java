package dnekh.itcompany.staff;

public class Developer extends Employee {

    private String programmingLanguage;
    private boolean isBackEndDeveloper;

    public Developer(int id, String firstName, String lastName, int age, String occupation, int income, String programmingLanguage, boolean isBackEndDeveloper) {
        super(id, firstName, lastName, age, occupation, income);
        this.programmingLanguage = programmingLanguage;
        this.isBackEndDeveloper = isBackEndDeveloper;
    }

    public void writeCodeLines(int quantityOfCodeLines) {
        System.out.println("Developer has written " + quantityOfCodeLines + " lines of code");
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
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                ", isBackEndDeveloper=" + isBackEndDeveloper +
                '}';
    }
}
