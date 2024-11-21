import java.util.*;

class Solution {
    int findMissingNumber(int arr[], int n) {
        if (n <= 1) {
            return -1;
        }
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Solution s = new Solution();
        System.out.print(s.findMissingNumber(arr, n));
    }
}
