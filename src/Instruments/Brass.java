package Instruments;

public class Brass extends Instruments {
    public static void main(String[] args) {
        trumpet();
        trombone();
    }

    public static void trumpet() {
        Brass trumpet = new Brass();
        trumpet.name = "trumpet";
        trumpet.category = "brass";
        trumpet.instrumentName();
    }
    public static void trombone() {
        Brass trombone = new Brass();
        trombone.name = "trombone";
        trombone.category = "brass";
        trombone.instrumentName();
    }

}
