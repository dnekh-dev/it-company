package dnekh.itcompany.enums;

public enum Department {

    DEVELOPMENT("Development department"),
    DESIGN("Design department"),
    MANAGEMENT("Management department");

    private final String description;

    Department(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
