import java.util.*;

public class reverseArray {
    public static void reverseInPlace(int arr[]) {
        if (arr == null) {
            return;  
        }

        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size :\n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array Elements :\n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        reverseInPlace(arr); 

        System.out.print("The Reversed Array is:\n");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
}
