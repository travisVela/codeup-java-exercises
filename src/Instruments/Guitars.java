package Instruments;


public class Guitars extends Instruments {

    public static void main(String[] args) {
    guitars();

    }
    public static void guitars() {
        Guitars telecaster = new Guitars();
        telecaster.name = "telecaster";
        telecaster.category = "guitar";
        telecaster.instrumentName();

        Guitars stratocaster = new Guitars();
        stratocaster.name = "stratocaster";
        stratocaster.category = "guitar";
        stratocaster.instrumentName();
    }

    @Override
    public void instrumentSounds() {
        super.instrumentSounds();
        System.out.println("weeping");
    }
}
