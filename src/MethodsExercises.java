import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        //1. Basic Arithmetic
        //c. Test your methods and verify the output.
        System.out.println(addition(3,2));
        subtraction(3,2);
        multiplication(3,2);
        division(3,2);
        division(3,0);// Dividing by zero gives infinity

        //d.
        modulus(4, 2);
        modulus(3, 2);
        modulus(1, 2);
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

    public static void multiplyLoop(int a, int b){
        //Bonus
        int mult = 0;
        int i;
        for(i = 1; i <= a;i++)
        {
            mult=mult+b;
        }
        System.out.println(mult);
    }

    public static void multiplication(int a, int b){
//        System.out.println(a * b);
        //bonus
        System.out.print("This is the recursion one: ");
        multiplyLoop(a, b);
    }

    public static void division(double a, double b){
        System.out.println(a / b);
    }

    //d. Add a modulus method that finds the modulus of two numbers.
    public static void modulus(double a, double b){
        System.out.println(a % b);
    }
}
