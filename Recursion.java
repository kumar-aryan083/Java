public class Recursion{
    public static void main(String[] args) {
        // System.out.println("Hello java");
        System.out.println(factorial(5));
        printNumbers(8);
        System.out.println();
        printNumbers1(1, 8);
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
    static void printNumbers1(int i, int n){
        if(i>n) return;
        System.out.print(i+" ");
        printNumbers1(i+1, n);
    }
}