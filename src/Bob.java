import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        String question = "Sure";
        String yell = "Whoa, chill out!";
        String address = "Fine. Be that way!";

        String talk;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Talk to Bob");
            talk = sc.nextLine();
            if(talk.endsWith("?")){
                System.out.println(question);
            } else if(talk.endsWith("!")){
                System.out.println(yell);
            } else if(talk.isEmpty()){
                System.out.println(address);
            } else{
                System.out.println("Whatever");
            }
        }while(true);

    }
}
