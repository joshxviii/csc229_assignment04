package assignment_package;

public class Main {

    public static void main(String[] args) {

        //region ==== Task 01 ========================

        countDown(5);
        /*
         * OUTPUT:
         * 5...
         * 4...
         * 3...
         * 2...
         * 1...
         * Blastoff!
        */

        countDownEven(5); 
        /*
         * OUTPUT:
         * 4...
         * 2...
         * Blastoff!
        */

        /* 
         * The time complexity of these methods is O(N) linear
         * since the program will run n times.
         */

        //endregion



        //region ==== Task 2 ========================

        System.out.println(gcd(16,24));
        /*
         * OUTPUT:
         * 8
        */

        System.out.println(gcdSub(16,24));
        /*
         * OUTPUT:
         * 8
        */

        //endregion



        //region ==== Task 3 ========================

        System.out.println( fib(10) );
        /*
         * OUTPUT:
         * 55
        */

        /* 
         * The time complexity of these methods is O(2^N) exponential
         * since the program will run itslef and split into branches of 2 n times
         * increasing the runtime exponentially.
         * 
         *                      4
         *                    /   \
         *                  3       3
         *                 / \     / \
         *                2   2   2   2
         *               /\  /\   /\   /\
         *              1 1 1  1 1  1  1 1
         */ 

        //endregion



        //region ==== Homework ========================

        recursivePrint("Hello World!" , 4);
        /*
         * OUTPUT:
         * Hello World!
         * Hello World!
         * Hello World!
         * Hello World!
        */

        System.out.println( sumOf7s(7,70) );
        /*
         * OUTPUT:
         * 378
        */


        System.out.println( binarySearch(4,{1,2,3,4,5,6,7,8,9,10,12,3}) );
        
        //endregion
    
    }




    //Task 1 Methods -------------

    static void countDown(int num) {                    // This function will print 'n...' n times before printing 'Blastoff!'.
        if (num == 0) // Test num
            System.out.println("Blastoff!");
        else {
            System.out.println(num + "...");
            countDown(num-1); // Recursive Call
        } 
    }

    static void countDownEven(int num) {                // This function will print 'n...' when ever n is even before printing 'Blastoff!'.
        if (num == 0) // Test num
            System.out.println("Blastoff!");
        else {
            if (num % 2 == 0) System.out.println(num + "..."); // Only print num when num is even.
            countDownEven(num-1); // Recursive Call
        } 
    }




    //Task 2 Methods -------------

    static int gcd(int x, int y) {                      // This function returns the greatest common denominator from two intergers.
        if (x % y == 0) return y; //base case
        else return gcd(y, x % y);
    }

    static int gcdSub(int x, int y) {                   // This function returns the greatest common denominator from two intergers using subtraction.
        if (y == 0) return x; //base case
        else return gcdSub(y, Math.abs(x - y));
    }




    //Task 3 Methods -------------

    static int fib(int n) {                             // This function prints the nth number in the fibonacci sequence
        if (n <= 0) return 0; // base case
        else if (n == 1) return 1; // base case
        else return fib(n - 1) + fib(n - 2);
    }




    //Homework Methods -------------

    static void recursivePrint(String msg, int num) {   // This function will print a message n times using recursion.
        if (num > 0) {
            System.out.println(msg);
            recursivePrint(msg, num - 1);
        }
    }

    static int sumOf7s(int n1, int n2) {                // This function returns the sum of intergers from n1 to n2 that are multiples of 7
        if (n2 <= n1) return 0; // if n2 counts down to n1 end recursion
        else if ( (n2 % 7) != 0) return sumOf7s(n1, n2 - 1); // if n2 is not a multiple of 7 count down recursively 
        else return n2 + sumOf7s(n1, n2 - 1); // if n2 is a multiple of 7 and it to the next multiple of 7 if any.
    }

    static int binarySearch(int num, int[] list) {                       // This Function uses a calls the binary search function with more parameters.
        this(num, list, 0, list.length)
    }

    static int binarySearch(int num, int[] list, int low, int high) {    // This Function uses a binary search to find an int in an array recursively.
        int mid;
        mid = (high + low) / 2;
        if (num == list[mid]) return list[mid]
        else {
            if (num < list[mid]) return binarySearch(num, list, low, mid) ;
            else return binarySearch(num, list, mid+1, high)
        }
    }
}
