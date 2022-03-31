public class warmups {
//    ================================= WARM UP
//
//Create a Java class, JavaWarmups. Add a main method to test the warmup methods.
    public static void main(String[] args){
        //Examples...
        System.out.println(returnFirstCapitalLetter("hellO")); //returns 'O'
        System.out.println(returnFirstCapitalLetter("hello")); // return ' '
        System.out.println(returnFirstCapitalLetter("hEllo")); // return 'E'
        System.out.println(returnFirstCapitalLetter("hELlO")); // returns 'E'
        System.out.println(returnFirstCapitalLetter("H")); // returns 'H'


    }
        //Create a method, returnFirstCapitalLetter, that takes in a string and returns the first capital letter as a char. If no capital letter is found, return a single space character ' '. Assume only letters in the input string and all possible inputs will have at least one letter.

    public static char returnFirstCapitalLetter(String input){
     int i;
     for(i = 0; i < input.length(); i++){
         if(input.charAt(i) == Character.toUpperCase(input.charAt(i))){
             return input.charAt(i);
         }
     }
     return ' ';
    }

}
