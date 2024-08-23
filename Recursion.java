public class Recursion{
    public static void main(String[] args) {
        // System.out.println("Hello java");
        System.out.println(factorial(5));
        printNumbers(8);
        System.out.println();
        printNumbers1(8);
        System.out.println();
        System.out.println(printSum(5));
        System.out.println(fib(6));
    }

    // factorial of a number
    static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }
    // print numbers in decreasing order
    static void printNumbers(int n){
        if(n == 0) return;
        System.out.print(n + " ");
        printNumbers(n-1);
        return;
    }
    // print numbers in increasing order
    static void printNumbers1(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printNumbers1(n-1);
        System.out.print(n + " ");
    }
    // print sum of first n natural numbers
    static int printSum(int n){ 
        if(n == 1) return 1;
        int fnm1 = printSum(n-1);
        int fn = n+fnm1;
        return fn;
    }
    //print fibonacci number
    static int fib(int n){
        if(n == 1 || n == 0) return n;
        int fibn = fib(n-1)+fib(n-2);
        return fibn;
    }
}