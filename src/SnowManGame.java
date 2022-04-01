import java.util.Scanner;

public class SnowManGame {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.next();
        welcome(name);
        System.out.println(returnThree());


    }
    public static int returnThree(){
        return 3;
    }
    public static void welcome(String name){
        System.out.printf("Welcome to the calculator %s\n", name);
    }
    public static void multiply(int a, int b){
        System.out.println(a * b);
    }

    public static void divide(int a, int b){
        System.out.println(a / b);
    }
}
