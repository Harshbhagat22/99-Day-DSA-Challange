import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int arr1[] = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        IntersectionOfArrays(arr, arr1, n, m);

        sc.close();
    }

    public static void IntersectionOfArrays(int arr[], int arr1[], int n, int m) {
        int i = 0;
        int j = 0;
        boolean hasIntersection = false;

        while (i < n && j < m) {
            if (arr[i] < arr1[j]) {
                i++;
            } else if (arr1[j] < arr[i]) {
                j++;
            } else {
                System.out.print(arr[i] + " ");
                hasIntersection = true;
                i++;
                j++;
            }
        }

        if (!hasIntersection) {
            System.out.println("No intersection found.");
        } else {
            System.out.println();
        }
    }
}
