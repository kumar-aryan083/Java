import java.util.Scanner;

public class TwoD_array {

    public static int diagonal_sum(int[][] arr) {
        int ans = 0;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            ans += arr[i][i];
            if (i != n - 1 - i) {
                ans += arr[i][n - 1 - i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 8, 7 } };
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(diagonal_sum(arr));
    }
}
