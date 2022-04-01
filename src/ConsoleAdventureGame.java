import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


public class ConsoleAdventureGame {
    public static void main(String[] args){
        startingGameLogic();
    }

    public static byte attackPointsRandom(){
        return (byte) (Math.random() * 70);
    }

    public static void startingGameLogic(){
        Scanner sc = new Scanner(System.in);
        System.out.println("START GAME [YES / NO]");
        String startOrNot = sc.nextLine();
        byte playerHealth = 100;
        byte playerStamina = 100;
        byte potionCount = 5;
        byte enemyHealth = 100;
        byte attackPoints;

        if(startOrNot.equalsIgnoreCase("yes")){
            System.out.println("Welcome To Console Adventure");
//            System.out.println("attack points " + attackPointsRandom());
            System.out.println("Enter Name:");
            String playerName = sc.nextLine();
            System.out.println("Player: " + playerName + " | " + "Health: " + playerHealth + " | Stamina: " + playerStamina);
            System.out.println("Welcome to the quick tutorial[Enter skip to skip]");
            String skip = sc.nextLine();
            if(skip.equalsIgnoreCase("skip")){

            }
        }



    }
}
