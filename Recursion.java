import java.util.*;

public class Recursion{
    public static void main(String[] args) {
        //---------------------------------------------------------------------------
        // Recursion part 1
        //---------------------------------------------------------------------------

        // RecursionPart1 obj = new RecursionPart1();
        // System.out.println(obj.factorial(5));
        // obj.printNumbers(8);
        // System.out.println();
        // obj.printNumbers1(8);
        // System.out.println();
        // System.out.println(obj.printSum(5));
        // System.out.println(obj.fib(6));
        // int[] arr = {1,2,3,4,5, 2, 1,5,4};
        // if(obj.checkSorted(arr, 0)){
        //     System.out.println("Sorted");
        // }else{
        //     System.out.println("Not sorted");
        // }
        // System.out.println(obj.firstOccurence(arr, 0, 5));
        // System.out.println(obj.lastOccurence(arr, arr.length-1, 5));
        // System.out.println(obj.pow(2, 10));
        // System.out.println(obj.optimizedPow(2, 5));

        //---------------------------------------------------------------------------
        // Recursion Part 2
        //---------------------------------------------------------------------------

        System.out.println("Hello Recursion part 2");
        int[] arr = {1, 2, 3};
        RecursionPart2 obj = new RecursionPart2();
        // List<List<Integer>> ans = obj.subsets(arr);
        // List<List<Integer>> ans = obj.combinationSum(arr, 4);
        List<List<Integer>> ans = obj.combinationSum2(arr, 8);

        
        for(int i = 0; i<ans.size(); i++){
            for(int j=0; j<ans.get(i).size(); j++){
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

class RecursionPart2{
    // Program to find all possible subsets or subsequences of an array.
    static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        createSubsets(arr, 0, ans, temp);
        return ans;
    }
    static void createSubsets(int[] arr, int i, List<List<Integer>> ans, List<Integer> res){
        if(i == arr.length){
            ans.add(new ArrayList<>(res));
            return;
        }
        // pick a element
        res.add(arr[i]);
        createSubsets(arr, i+1, ans, res);
        // not pick a element
        res.remove(res.size()-1);
        createSubsets(arr, i+1, ans, res);
    }

    // list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
    // The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
    // frequency of at least one of the chosen numbers is different.
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        createCombination(0, candidates, target, ds, ans);
        return ans;
    }
    static void createCombination(int i, int[] candidates, int target, List<Integer> ds, List<List<Integer>> ans){
        if(i == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[i]<=target){
            ds.add(candidates[i]);
            createCombination(i, candidates, target-candidates[i], ds, ans);
            ds.remove(ds.size()-1);
        }
        createCombination(i+1, candidates, target, ds, ans);
    }

    // find all unique combinations in candidates where the candidate numbers sum to target. 
    // Each number in candidates may only be used once in the combination.
    // Note: The solution set must not contain duplicate combinations and should be in sorted order.
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations2(0, candidates, target, ds, ans);
        return ans;
    }
    static void findCombinations2(int ind, int[] arr, int target, List<Integer> ds, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind; i<arr.length; i++){
            if(i>ind && arr[i] == arr[i-1]) continue;
            if(arr[i]>target) return;
            ds.add(arr[i]);
            findCombinations2(i+1, arr, target-arr[i], ds, ans);
            ds.remove(ds.size()-1);
        }
    }
}

class RecursionPart1{
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
    //check if array is sorted or not
    static boolean checkSorted(int arr[], int i){
        if(i == arr.length-1) return true;
        if(arr[i] > arr[i+1]){
            return false;
        }
        return checkSorted(arr, i+1);
    }
    //find first occurence of an element
    static int firstOccurence(int[] arr, int i, int target){
        if(i == arr.length) return -1;
        if(arr[i] == target) return i;
        return firstOccurence(arr, i+1, target);
    }
    //find last occurence of an element
    static int lastOccurence(int[] arr, int i, int target){
        if(i < 0) return -1;
        if(arr[i] == target) return i;
        return firstOccurence(arr, i-1, target);
    }
    //find x^n
    public static int pow(int x, int n){
        if(n == 0) return 1;
        return x * pow(x, n-1);
    }
    //find x^n in O(logN)
    public static int optimizedPow(int x, int n){
        if(n == 0) return 1;
        int powHalf = optimizedPow(x, n/2);
        int powHalfSq = powHalf*powHalf;
        if(n%2!=0){
            powHalfSq = x * powHalfSq;
        }
        return powHalfSq;
    }
}