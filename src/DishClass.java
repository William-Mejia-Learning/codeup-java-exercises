import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;
    public static int totalDishes = 0;

    public Dish() {
        totalDishes++;
    }

    public Dish(int cost, String name, boolean recommend) {
        this();
        this.costInCents = cost;
        this.nameOfDish = name;
        this.wouldRecommend = recommend;
    }

    public int getCostInCents() {
        return costInCents;
    }

    public String getNameOfDish() {
        return this.nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary() {
        System.out.printf("Cost: %d \nName: %s\nRecommended: %b\n", costInCents, nameOfDish, wouldRecommend);
        System.out.println("Total Dishes: " + totalDishes + "\n");
        System.out.printf("%s\n", "---------------------");
    }

}

class DishTools {
    static final int AVG_COST_OF_DISH_IN_CENT = 13000;

    public static void shoutDishNAme(Dish dish){
        System.out.println(dish.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish dish){
        String moreOrLess = (dish.getCostInCents() > AVG_COST_OF_DISH_IN_CENT) ? "More" : "Less";

        System.out.println(moreOrLess + " expensive than average");
    }

    public static void flipRecommendation(Dish dish){
        dish.setWouldRecommend(!dish.isWouldRecommend());

    }

    }




public class DishClass {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
//
//        System.out.println("dish1.printSummary() = " + dish1);

        dish1.setCostInCents(100);
        dish1.setNameOfDish("Pizza pie");
        dish1.setWouldRecommend(true);


        DishTools.analyzeDishCost(dish1);

        DishTools.shoutDishNAme(dish1);
        DishTools.flipRecommendation(dish1);
        dish1.printSummary();

        Dish dish2 = new Dish(10000, "California Roll", false);

        DishTools.analyzeDishCost(dish2);

        DishTools.shoutDishNAme(dish2);
        dish2.printSummary();
        DishTools.flipRecommendation(dish2);
//        System.out.println("dish2 = " + dish2);
        DishTools.shoutDishNAme(dish2);
        dish2.printSummary();



    }
}
