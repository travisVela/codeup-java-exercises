public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish1 = new RestaurantDish(200, "Spaghetti", true);


        System.out.printf("%d %n%s %n%b%n", dish1.getCostInCents(), dish1.getNameOfDish(), dish1.getWouldRecommend());
        System.out.println(dish1.getEat());
    }
}
