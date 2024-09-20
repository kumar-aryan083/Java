import java.util.*;

public class Array {
    
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        int[] arr = {10, 5, 2, 7, 1, 9};
        // printArray(arr);
        // System.out.println("Max Element : "+largestElement(arr));
        // System.out.println("Min Element : "+smallestElement(arr));
        
        // System.out.println("Element found at index: "+linearSearch(arr, 83));
        // System.out.println("Element found at index: "+binarySearch(arr, 83));
        
        // allPair(arr);
        // allSubarrays(arr);
        // subarraySum(arr);
        System.out.println(longestSubarrayLength(arr, 15));
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int largestElement(int arr[]){
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            ans = Math.max(arr[i], ans);
        }
        return ans;
    }
    public static int smallestElement(int arr[]){
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            ans = Math.min(arr[i], ans);
        }
        return ans;
    }

    public static int linearSearch(int arr[], int k){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == k){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int arr[], int k){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == k){
                return mid;
            }
            if(arr[mid]<k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }

    public static void allPair(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.print(arr[i]+" "+arr[j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void allSubarrays(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k= i; k<=j; k++){
                    System.out.print(arr[k]+ " ");
                }
                System.out.println();
            }
        }
    }
    public static void subarraySum(int arr[]){
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                for(int k= i; k<=j; k++){
                    sum+=arr[k];
                }
                maxi = Math.max(maxi, sum);
                mini = Math.min(mini, sum);
            }
        }
        System.out.println("Maximum subarray sum : "+maxi);
        System.out.println("Minimum subarray sum : "+mini);
    }
    static int longestSubarrayLength(int[] arr, int k){
        int n = arr.length;
        int left = 0, right = 0;
        int sum = arr[0], ans = 0;
        while(right<n){
            while(left<=right && sum>k){
                sum-= arr[left];
                left++;
            }
            if(sum == k){
                ans = Math.max(ans, right-left+1);
            }
            right++;
            if(right<n) sum+=arr[right];
        }
        return ans;
    }
}
