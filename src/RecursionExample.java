public class RecursionExample {

//    public static void recur(int n){
//        System.out.println("Run for " + n + " times");
//        if(n == 10_000){ // base case
//            return;
//        }
//        recur(n + 1);
//    }

    public static int countUpToNumber(int count) {
        System.out.println(count);
        if (count == 100) { // base case
            return count;
        }
        return countUpToNumber(count + 1);
    }

    // TODO: use recursion to print out a given number up through 100
    public static int countTo100(int num) {
        System.out.println(num);
        if (num == 100) {
            return num;
        }
        return countTo100(num + 1);
    }


    // TODO: use recursion to add all numbers up from 1 to a given number
    public static int addNums(int num) {
//        if (num != 0)
//            return num + addNums(num - 1);
//        else
//            return num;

        if(num == 1){
            return 1;
        }
        return num + addNums(num -1);
    }


    public static void main(String[] args) {
//        recur(1);
//        countUpToNumber(1);
//        countTo100(1);
        System.out.println(addNums(5)); //addNums(5);
    }
}
