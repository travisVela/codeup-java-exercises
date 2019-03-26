public class BurgerTester {

    public static void main(String[] args) {
        BurgerTools burger1 = new BurgerTools("Cheese burger", 3, 300);
        System.out.println(burger1.mostPopularTopping);
        System.out.println(burger1.averageDaysBeforeExpiration);
        System.out.println(burger1.temperatureWhenCooked);
        System.out.println(burger1.grill());
    }
}
