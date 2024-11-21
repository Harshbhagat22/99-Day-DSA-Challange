import java.util.*;

public class MoveZeroEnd {
    public static int[] endWithZero(int arr[]) {
        int low = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[low] = arr[i];
                low++;
            }
        }
        for (int i = low; i < arr.length; i++) {
            arr[i] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = endWithZero(arr);
        for (int k : ans) {
            System.out.print(k + " ");
        }
    }
}
