package dnekh.itcompany.staff;

public class Designer extends Employee {

    private String designTools;
    private String specialization;

    public Designer(int id, String firstName, String lastName, int age, String occupation, int income, String designTools, String specialization) {
        super(id, firstName, lastName, age, occupation, income);
        this.designTools = designTools;
        this.specialization = specialization;
    }

    public Designer(String designTools, String specialization) {
        this.designTools = designTools;
        this.specialization = specialization;
    }

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
        return "Designer{" +
                "designTools='" + designTools + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}