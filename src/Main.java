import dnekh.itcompany.enums.Department;
import dnekh.itcompany.enums.Grade;
import dnekh.itcompany.staff.Designer;
import dnekh.itcompany.staff.Developer;
import dnekh.itcompany.staff.Manager;

public class Main {

    public static void main(String[] args) {

        var javaDeveloper = new Developer(1, "Mors", "Moore", 15, Department.DEVELOPMENT,
                Grade.SENIOR, 5500, "Java", true);
        var UXUIDesigner = new Designer(2, "Alex", "Meow", 33, Department.DESIGN,
                Grade.MIDDLE, 5000, "Photoshop", "UX/UI design");
        var teamManager = new Manager(3, "Vasya", "Wow", 37, Department.MANAGEMENT,
                Grade.MIDDLE, 6000, 2, 12);

        System.out.println(javaDeveloper);
        System.out.println(UXUIDesigner);
        System.out.println(teamManager);

        var manager = new Manager(4, "Petya", "Cow", 38, Department.MANAGEMENT,
                Grade.SENIOR, 6500, 0, 10);

    }
}