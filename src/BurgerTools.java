public class BurgerTools {
    public static String mostPopularTopping;
    public static int averageDaysBeforeExpiration;
    public static int temperatureWhenCooked;
    public static String grill() {
        return "Grilling burger";
    }

    public BurgerTools(String toppings, int expiration, int temp) {
        this.mostPopularTopping =toppings;
        this.averageDaysBeforeExpiration = expiration;
        this.temperatureWhenCooked = temp;
    }

}
