import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
//        Be creative in communicating different options with your
//        user different and for given scenarios. Create at least three phases of the chatbot, for example...
//
//        "How are you?" (AI says)
//			           |                              |
//        good                        bad (user types)
//
//        "Awesome! Are you super happy?" 	    "Will cake make you better?"
//
//        yes          no                     yes             no
//
//        Keep the chat options relatively simple and plan it out clearly before coding it.
        Scanner sc = new Scanner(System.in);
//        System.out.println("How are you? [good / bad]");
        String mood;

            System.out.println("How are you? [good / bad]");
            mood = sc.next();
            if (mood.equalsIgnoreCase("good")) {
                System.out.println("Are you super happy? [yes / no]");
                String happyMeter = sc.next();
                if (happyMeter.equalsIgnoreCase("yes")) {
                    System.out.println("Love to hear that");
                }
            }
                if(mood.equalsIgnoreCase("bad")){
                    System.out.println("Would you like some cake? [yes / no]");
                    String cake =sc.next();
                    if (cake.equalsIgnoreCase("yes")){
                        System.out.println(":)");
                    }
                }

    }
}
