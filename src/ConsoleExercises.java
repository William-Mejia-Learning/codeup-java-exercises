import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;

//        System.out.printf("The value of pi is approximately " + "%.2f%n", pi);
//        System.out.format("The value of pi is approximately " + "%.2f%n", pi);


        //Explore the scanner class
        Scanner scanner = new Scanner(System.in);
        //1
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt(); //if it's not an int you will get an error
//        System.out.println(number);

        //2
//        System.out.print("Enter three words: ");
//
//        String str = scanner.next();
//        String str1 = scanner.next();
//        String str2 = scanner.next();
//
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str2);
//
        //Cannot do less than three words, will not log more than 3 words

        //3 -4
//        System.out.print("Enter a sentence: ");
//        String userInput = scanner.next(); // captures one word

//        String userInput = scanner.nextLine(); //captures the entire sentence

//        System.out.println(userInput);
        //If the next() is used then only the first word in the string will be output
        //If nextLine() is used, the entire sentence is output into the console


        //Calculate the perimeter and the area of Codeup's classrooms.

        //1
        // perimeter formula: P = (L + W) × 2

        System.out.println("Enter Width: ");
        double width = Double.parseDouble(scanner.nextLine());
//        double width = scanner.nextDouble();
        System.out.println("Enter Height: ");
        double height = Double.parseDouble(scanner.nextLine());
//        double height = scanner.nextDouble();
//
        //2
        double perimeter = 2 * (width + height);
        double area = width * height;

        System.out.printf("The perimeter is 2 * (%.1f + %.1f) = %.2f \n", height, width, perimeter);

        // A = LW
        System.out.printf("The area is %.1f * %.1f = %.2f", width, height, area);


    }
}
