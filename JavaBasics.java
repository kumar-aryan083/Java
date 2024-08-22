import java.util.*;

public class JavaBasics{

    public static double avgerage(double a, double b, double c){
        return (a+b+c)/3;
    }

    public static boolean isEven(int a){
        if(a%2 == 0){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static int sumOfDigits(int a){
        int ans = 0;
        while(a>0){
            int rem = a%10;
            ans+=rem;
            a/=10;
        }
        return ans;
    }

    public static boolean isPrime(int a){
        if(a == 2){
            return true;
        }
        for(int i=2; i<=(int)Math.sqrt(a); i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int binaryToDecimal(int a){
        int ans = 0;
        int pow = 0;
        while(a>0){
            int lastDigit = a%10;
            ans = ans + (lastDigit*(int)Math.pow(2, pow));
            pow++;
            a/=10;
        }
        return ans;
    }

    // public static int decimalToBinary(int a){
        
    // }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // System.out.println(decimalToBinary(a));
        // String str = String.valueOf(a);
        // if(isPalindrome(str)){
        //     System.out.println("Palindrome");
        // }else{
        //     System.out.println("Not Palindrome");
        // }

        // ----- Some inbuilt math functions -----
            // System.out.println(Math.max(45, 44));
            // System.out.println(Math.min(45, 44));
            // System.out.println((int)Math.pow(5,4));
            // System.out.println(Math.sqrt(25));
            // System.out.println(Math.abs(1-5));
        System.out.println("Hello Java");
    }
}