import java.util.Random;
import java.util.Scanner;


public class MethodsExercises {
    public static void main(String[] args){
//        Scanner sc =new Scanner(System.in);
        //1. Basic Arithmetic
        //c. Test your methods and verify the output.
//        System.out.println(addition(3,2));
//        subtraction(3,2);
//        multiplication(3,2);
//        division(3,2);
//        division(3,0);// Dividing by zero gives infinity

        //d.
//        modulus(4, 2);
//        modulus(3, 2);

        //2
//        System.out.print("Enter a number between 1 and 10: ");
//        System.out.println(getInteger(1, 10));

        //3
//        System.out.println("Enter number between 1 and 10:");
//        getFactorials();

        //4. Create an application that simulates dice rolling.
        System.out.println("Welcome to the dice game");
        System.out.println("------------------------");
        System.out.println("Enter number of dice sides:");
        Scanner sc =new Scanner(System.in);
        int sides = sc.nextInt();
        diceGame(sides);

    }

    //1. Basic Arithmetic
    //a. Create four separate methods. Each will perform an arithmetic operation:
    //b. Each function needs to take two parameters/arguments so that the operation can be performed.
//    public static int addition(int a, int b){
////        System.out.println(a + b);
//        return a + b;
//    }
//
//    public static void subtraction(int a, int b){
//        System.out.println(a - b);
//    }
//
//    public static void multiplication(int a, int b){
////        System.out.println(a * b);
//        //bonus
////        System.out.print("This is the recursion one: ");
//        int mult = 0;
//        int i;
//        for(i = 1; i <= a;i++)
//        {
//            mult=mult+b;
//        }
//        System.out.println(mult);
//    }
//
//    public static void division(double a, double b){
//        System.out.println(a / b);
//    }
//
//    //d. Add a modulus method that finds the modulus of two numbers.
//    public static void modulus(double a, double b){
//        System.out.println(a % b);
//    }
//
//    //2
//    public static int getInteger(int min, int max){
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//        if(userInput >= min && userInput <= max){
//            return userInput;
//        }
//        System.out.print("Number not valid ");
//
//        return getInteger(min, max);
//    }


    //3

//        public static int getFactorials() {
//            Scanner sc =new Scanner(System.in);
//            int i;
//            int factorial = 1;
//            int userInput = sc.nextInt();
//            if(userInput >= 1 && userInput <=10){
//                for(i =1; i <= userInput; i++){
//                    factorial = factorial * i;
//                }
//                System.out.println(factorial);
//                return factorial;
//            }
//            System.out.println("[Invalid Number]");
//            System.out.println("Enter number between 1 and 10:");
//            return getFactorials();
//        }

    //4. Create an application that simulates dice rolling.
    public static int generateRandomNumber(int sides){
        Random rand = new Random();
        int upperbound = sides;
        int lowerBound = 1;
        int int_random = rand.nextInt(upperbound + 1 - lowerBound) + lowerBound;
//        System.out.println(int_random);
        return int_random;
    }

    public static void diceGame(int num){
    Scanner sc =new Scanner(System.in);
    String userInput;
        do{
            System.out.println("Dice 1: " + generateRandomNumber(num));
            System.out.println("Dice 2: " + generateRandomNumber(num));
            System.out.println("Do you want to roll again? [YES / NO]");
            userInput = sc.next();

        } while(userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y"));
    }

}
