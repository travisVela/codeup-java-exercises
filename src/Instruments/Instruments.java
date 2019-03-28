package Instruments;

public class Instruments {
    public String category;
    public String name;


    public void instrumentName() {
        System.out.printf("%s is in the %s category%n", this.name, this.category);
    }

}
