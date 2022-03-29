import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //1. basic loops

        //a.

//        int i = 5;
//
//        while(i <= 15){
//            System.out.println(i);
//            i++;
//        }

        //For Loop
//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }

        //b.
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while (i >= -10);

//        long i = 2;
//        do{
//            System.out.println(i);
//            i = i * i;
//        }while(i < 1_000_000);

        //For Loop
//        for (int i = 0; i <= 100; i+= 2){
//            System.out.println(i);
//        }

//        for(long i = 2; i <= 1_000_000; i = i * i){
//            System.out.println(i);
//        };

        //2. FizzBuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 != 0 && i % 5 != 0) {
//                System.out.println(i);
//            }
//            else if (i % 5 == 0 & i % 3 == 0) {
//                System.out.println(i + " FizzBuzz");
//            }
//            else if (i % 3 == 0) {
//                System.out.println(i + " Fizz");
//            }
//            else if (i % 5 == 0) {
//                System.out.println(i + " Buzz");
//            }
//        }

        //3. Display a table of Powers

//        Scanner scanner = new Scanner(System.in);
//        String cont;
//        do {
//            System.out.println("Enter an integer: ");
//            int number1 = scanner.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= number1; i++) {
//                int squared = i * i;
//                int cubed = i * i * i;
//                System.out.printf("%-6d | %-7d | %-6d\n", i, squared, cubed);
//            }
//            System.out.print("Would you like to continue? [yes / no] ");
//            cont = scanner.next();
//        } while (cont.equalsIgnoreCase("yes"));

        //4
//        Scanner scanGrades = new Scanner(System.in);
//        String cont;
//
//        do{
//           System.out.println("Enter your grade:");
//            int grade = scanGrades.nextInt();
////            System.out.println(grade);
//            if(grade >= 88 && grade <= 100 ){
//                System.out.println("Grade: A");
//            }else if(grade >= 80 && grade <= 87){
//                System.out.println("Grade: B");
//            }else if(grade >= 67 && grade <= 79) {
//                System.out.println ("Grade: C");
//            }else if(grade >= 60 && grade <= 66) {
//                System.out.println("Grade: D");
//            }else if(grade >= 0 && grade <= 59) {
//                System.out.println("Grade: F");
//            }else {
//                System.out.println("Invalid");
//            }
//            System.out.println("Would you like to continue? [yes / no]");
//            cont = scanGrades.next();
//        } while(cont.equalsIgnoreCase("yes"));

    }
}
