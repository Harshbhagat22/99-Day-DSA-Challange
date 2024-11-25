import java.util.*;
public class RearrangeNumberEvenNumberAfterOdd
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int result [] = RearrangeNumber(arr);
		for(int nums:result) {
			System.out.print(nums+" ");
		}
	}

	public static int [] RearrangeNumber(int arr[]) {
		if(arr.length == 0 || arr == null) {
			return new int[] {0};
		}
		int ans[] = new int[arr.length];
		int index = 0;

		for(int nums:arr) {
			if(nums%2==0) {
				ans[index] = nums;
				index ++;
			}
		}

		for(int nums:arr) {
			if(nums%2 !=0) {
				ans[index] = nums;
				index++;
			}
		}

		return ans;
	}

}
