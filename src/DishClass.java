import org.w3c.dom.ls.LSOutput;

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

    public static int getTotalDishes() {
        return totalDishes;
    }

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

//    public void setNameOfDish(String nameOfDish) {
//        this.nameOfDish = nameOfDish;
//    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

    public static void setTotalDishes(int totalDishes) {
        Dish.totalDishes = totalDishes;
    }

    public void printSummary() {
        System.out.printf("Cost: %d \nName: %s\nRecommended: %b\n", costInCents, nameOfDish, wouldRecommend);
        System.out.println("Total Dishes: " + totalDishes + "\n");
        System.out.printf("%s\n", "---------------------");
    }

}

class DishTools {

    public static int shoutDishName(String string) {


        return 0;
    }

}


public class DishClass {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        DishTools dish2 = new DishTools();
//        dish2.getNameOfDish();
//
        System.out.println("dish1.printSummary() = " + dish1);
//
//        dish1.setCostInCents(100);
//        dish1.setNameOfDish("Pizza pie");
//        dish1.setWouldRecommend(true);
//
//        dish1.printSummary();

//        System.out.println(shoutDishName());


    }
}
