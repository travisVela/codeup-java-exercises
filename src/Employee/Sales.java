package Employee;

public class Sales extends Employee {
    public Sales(String name, String department) {
        super(name, department);
    }

    public String work() {
        return "making sales";
    }
}
