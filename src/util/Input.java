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

    public int getInt(int min, int max){
        int answer;
        do{
            answer = scanner.nextInt();

        }while(answer < 0 || answer > 10);
        return answer;
    }

    public int getInt(){
        int min = 1;
        int max = 10;
        int answer;
        do{
            answer = scanner.nextInt();

        }while(answer < 0 || answer > 10);
        return answer;
    }


    public double getDouble(double min, double max){
        double answer;
        do{
            answer = scanner.nextDouble();

        }while(answer < 0 || answer > 10);
        return answer;
    }

    public double getDouble(){
        double answer;
        do{
            answer = scanner.nextDouble();

        }while(answer < 0 || answer > 10);
        return answer;
    }
}
