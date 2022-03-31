import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number from 1 - 100:");
        guessNumber();
//        int rand = (int) (Math.random() * 6) + 1;
//        System.out.println(rand);
    }

//    public static int generateRandomNumber() {
//        Random rand = new Random();
//        int upperbound = 5;
//        int lowerBound = 1;
//        int int_random = rand.nextInt(upperbound + 1 - lowerBound) + lowerBound;
//        System.out.println(int_random);
//        return int_random;
//    }

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random() * 100) + 1;
        int count = 100;
        int num;
        int i;
        for (i = 1; i <= 100; i++) {
             num = sc.nextInt();
//            System.out.println(rand);
            if (num == rand) {
                System.out.println("YOU GUESSED IT");
                break;
            } else if (num < rand) {
                count--;
                System.out.println("TOO LOW");
            } else if (num > rand) {
                count--;
                System.out.println("TOO HIGH");
            }
            System.out.println("Tries left: " + count);
        }
    }


}
