import java.util.*;

public class CyclicRotationOfArrayByOne
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int result [] = cyclicRotateArrayByOne(arr);
		for(int nums:result) {
			System.out.print(nums+" ");
		}
	}

	public static int [] cyclicRotateArrayByOne(int arr[]) {
		if(arr.length==0) {
			return new int [] { };
		}

		int ans[] = new int[arr.length];
		ans[0] = arr[arr.length-1];
		for(int i=1; i<arr.length; i++) {
			ans[i] = arr[i-1];
		}

		return ans;
	}
}