public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2, 1, 6, 5, 4, 15, 30, 25, 23, 20};
        // selectionSort(arr);
        // bubbleSort(arr);
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int didSwap = 0;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                return;
            }
        }
    }
    static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
