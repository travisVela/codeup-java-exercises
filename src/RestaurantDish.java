
class RestaurantDish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    private String eat() {
        return "Nom nom nom!";
    }

    public RestaurantDish(int cost, String name, boolean recommend) {
        this.costInCents = cost;
        this.nameOfDish = name;
        this.wouldRecommend = recommend;
    }

    public int getCostInCents() {
        return costInCents;
    }
    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean getWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public String getEat() {
        return eat();
    }
}
