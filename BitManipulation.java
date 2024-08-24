public class BitManipulation {
    public static void main(String[] args) {
        // evenOdd(12224556);
        System.out.println(getBit(10, 2));
        System.out.println(setBit(10, 2));
        System.out.println(clearBit(5, 0));
        System.out.println(updateBit(10, 2, 1));
    }

    // check if a number is even or odd
    static void evenOdd(int n){
        if((n&1) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    // get ith bit of a number
    static int getBit(int n, int i){
        if((n&(1<<i)) == 0){
            return 0;
        }else{
            return 1;
        }
    }
    
    // set ith bit
    static int setBit(int n, int i){
        return (n|(1<<i));
    }

    // clear ith bit
    static int clearBit(int n, int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }

    // update ith bit
    static int updateBit(int n, int i, int newBit){
        n = clearBit(n, i);
        int bitMask = (newBit<<i);
        return n | bitMask;
    }
}
