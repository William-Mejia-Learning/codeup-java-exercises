package util;

import java.util.Scanner;

public class Input {
    //1 Create an input validation class
    private Scanner scanner = new Scanner(System.in);

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String answer = scanner.next();
        if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")){
            return true;
        }
        return false;
    }

//    public boolean YesNo(String prompt){
//        System.out.println(prompt);
//        return YesNo();
//    }

//    public int getInt(int min, int max){
//        int answer;
//        do{
//            answer = scanner.nextInt();
//
//        }while(answer < 0 || answer > 10);
//        return answer;
//    }

//    public int getInt(){
//        int min = 1;
//        int max = 10;
//        int answer;
//        do{
//            answer = scanner.nextInt();
//
//        }while(answer < min || answer > max);
//        return answer;
//    }

    public int getInt(){
        try {
            int inputInt = scanner.nextInt();
            return inputInt;
        } catch(Exception e){
            System.out.println("MUST enter a valid integer: ");
            scanner.nextLine();
            return getInt();
        }
    }

    public int getInt(int min, int max){
        System.out.println("Enter input between " + min +" and " + max);

        int userInt = getInt();

        if(userInt > max || userInt < min){
            return getInt(min, max);
        }
        return userInt;
    }

//    public double getDouble(double min, double max){
//        double answer;
//        do{
//            answer = scanner.nextDouble();
//
//        }while(answer < 0 || answer > 10);
//        return answer;
//    }

    public double getDouble(){
        try{
            double userInput = scanner.nextDouble();
            return userInput;
        } catch (Exception e){
            System.out.println("Must enter a valid number: ");
            scanner.nextLine();
            return getDouble();
        }
    }

    public double getDouble(double min, double max){
        System.out.println("Enter input between " + min +" and " + max);

        double userInput = getDouble();

        if(userInput > max || userInput < min){
            return getDouble(min, max);
        }
        return userInput;
    }



//    public double getDouble(){
//        double answer;
//        do{
//            answer = scanner.nextDouble();
//
//        }while(answer < 0 || answer > 10);
//        return answer;
//    }
}
