import java.util.*;
public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int merged[] = mergeArrays(arr1, arr2);
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int merged[] = new int[n1 + n2];
        int index = 0;
        for (int nums : arr1) {
            merged[index++] = nums;
        }
        for (int nums : arr2) {
            merged[index++] = nums;
        }
        return merged;
    }
}
