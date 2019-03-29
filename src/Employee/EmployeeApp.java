package Employee;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee travis = new Developer("travis", "IT");
        Employee manager = new Manager("michael", "management");
        Employee james = new Developer("james", "codeup");
        Employee dwight = new Sales("dwight", "sales");
        Employee jim = new Sales("jim", "sales");

        System.out.println(travis.name + " " + travis.department + " " + travis.work());
        System.out.println(manager.name + " " + manager.department + " " + manager.work());
        System.out.println(james.name + " " + james.department + " " + james.work());
        System.out.println(dwight.name + " " + dwight.department + " " + dwight.work());
        System.out.println(jim.name  + " " + jim.department + " " + jim.work());

    }
}
