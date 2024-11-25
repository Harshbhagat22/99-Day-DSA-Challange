import java.util.*;

public class SecondLargestNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int result = SecondLargest(arr);
		System.out.print(result);
	}

	public static int SecondLargest(int arr[]) {
		if(arr==null || arr.length==0) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for(int nums:arr) {
			if(nums>max) {
				second = max;
				max = nums;
			}

			else if(nums>second && nums != max) {
				second = nums;
			}
		}

		return (second>Integer.MIN_VALUE)? second : -1;
	}
}
