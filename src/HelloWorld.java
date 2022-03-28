public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");

        //1
//        int myFavoriteNumber = 24;

        //2
//        String myString = "This is my first string in JAVA";
        //3
        //char myChar = (char) myString; //java: incompatible types: java.lang.String cannot be converted to char

        //4
        //myString = 3.14159; //java: incompatible types: double cannot be converted to java.lang.String

        //5

//        long myNumber;//Nothing happens, I just declared a long

        //6
        //myNumber = 3.14;// java: incompatible types: possible lossy conversion from double to long

        //7
//        myNumber = 123L;

//        System.out.println("myNumber = " + myNumber); // it prints out 123

        //8
//        myNumber = 123;

//        System.out.println("myNumber = " + myNumber); // prints out 123
        //Long takes in large numbers but cannot handle doubles

        //9

//        float myNumber = (float) 3.14;
//
//        System.out.println("myNumber = " + myNumber); // the code compiels unless I'm not understanding what is being asked

        //10
//        int x = 5;
//        System.out.println(x++); //5
//        System.out.println(x); //6
//
//        int x = 5;
//        System.out.println(++x); //6
//        System.out.println(x); //6

        // The first one does the addition after the fact, the second does it before


        //11
//        String class = "Hello"; // You cant name a variable class, it's a restricted word

        //12
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
////        int three = (int) "three";
//
//        System.out.println("three = " + three); // I did not know what to expect, but it is a ClassCastException


//        int three = (int) "three"; //This one is supposed to be a number and get an error when creating the variable

        //13
//        int x = 4;
//        x += 5;
//
//        System.out.println("x = " + x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//
//        System.out.println("y = " + y);

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;
//
//        System.out.println("y = " + y);
        
        
        //14
        int myNumber = Integer.MAX_VALUE;

        System.out.println("myNumber = " + myNumber);
        //This happens //java: incompatible types: possible lossy conversion from int to byte


    }
}
