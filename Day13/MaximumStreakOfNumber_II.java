import java.util.*;
public class MaximumStreakOfNumber_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxStreak(arr));
    }

    public static int maxStreak(int arr[]) {
        if (arr.length == 0) {
            return 0;
        }
        Arrays.sort(arr);
        int streak = 1, maxStreak = 1; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                streak++;
                maxStreak = Math.max(maxStreak, streak);
            } else {
                streak = 1; 
            }
        }
        return maxStreak;
    }
}
