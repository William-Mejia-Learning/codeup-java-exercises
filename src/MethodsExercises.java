import javax.print.MultiDocPrintService;
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
        System.out.print("Enter a number between 1 and 10: ");
        System.out.println(getInteger(1, 10));

    }

    //1. Basic Arithmetic
    //a. Create four separate methods. Each will perform an arithmetic operation:
    //b. Each function needs to take two parameters/arguments so that the operation can be performed.
    public static int addition(int a, int b){
//        System.out.println(a + b);
        return a + b;
    }

    public static void subtraction(int a, int b){
        System.out.println(a - b);
    }

    public static void multiplication(int a, int b){
//        System.out.println(a * b);
        //bonus
//        System.out.print("This is the recursion one: ");
        int mult = 0;
        int i;
        for(i = 1; i <= a;i++)
        {
            mult=mult+b;
        }
        System.out.println(mult);
    }

    public static void division(double a, double b){
        System.out.println(a / b);
    }

    //d. Add a modulus method that finds the modulus of two numbers.
    public static void modulus(double a, double b){
        System.out.println(a % b);
    }

    //2
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if(userInput >= min && userInput <= max){
            return userInput;
        }
        System.out.print("Number not valid ");

        return getInteger(min, max);
    }


    //3

    

}
