import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

class Dish{
   public int costInCents;
   public String nameOfDish;
   public boolean wouldRecommend;
   public static int totalDishes = 0;

   public Dish(){
       totalDishes++;
   }


    public void printSummary(){
        this.costInCents = 100;
        this.nameOfDish = "Fries";
        this.wouldRecommend = true;
        System.out.printf("Cost: %d \nName: %s\nRecommended: %b\n", costInCents, nameOfDish, wouldRecommend);
        System.out.println("Total Dishes: " + totalDishes +"\n");
        System.out.printf("%s\n","---------------------");

    }

   public void updateSummary(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
       System.out.printf("Cost: %d \nName: %s\nRecommended: %b\n", costInCents, nameOfDish, wouldRecommend);
       System.out.println("Total Dishes: " + totalDishes +"\n");
       System.out.printf("%s\n","---------------------");


   }

    public void updateSummary2(int costInCents, String nameOfDish, boolean wouldRecommend){
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
        System.out.printf("Cost: %d \nName: %s\nRecommended: %b\n", costInCents, nameOfDish, wouldRecommend);
        System.out.println("Total Dishes: " + totalDishes +"\n");
        System.out.printf("%s\n","---------------------");

    }

}


public class DishClass {
    public static void main(String[] args) {
        Dish dish1 = new Dish();

        dish1.printSummary();

        Dish dish2 = new Dish();

        dish2.updateSummary(500,
                "Coffee",
                false);

        Dish dish3 = new Dish();

        dish3.updateSummary2(1000,
                "Burrito Bowl",
                true);




    }
}
