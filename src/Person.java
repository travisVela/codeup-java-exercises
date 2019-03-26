public class Person {

    private String name;

    //constructor
    public Person(String name) {
        this.name = name;
    }

    //name getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //sayHello log
    public void SayHello() {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        Person travis = new Person("Travis");
        System.out.println(travis.getName());
        travis.setName("John");
        System.out.println(travis.getName());


    }
}
