import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess a number from 1 - 100:");
        guessNumber();
    }

    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random() * 100) + 1;
        int count = 20;
        int num;
        int i;
        for (i = 1; i <= 20; i++) {
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
            if(count == 0){
                System.out.println("YOU LOST");
                break;
            }
            System.out.println("Tries left: " + count);
        }
    }


}
