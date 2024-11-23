import java.util.*;
public class HalloweenCandles
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int profit = sc.nextInt();
		System.out.print(halloweenCandles(arr,profit));
	}

	public static int halloweenCandles(int arr[],int total) {
		if(arr==null || total<=0) {
			return 0;
		}

		int count = 0;

		for(int nums:arr) {
			if(nums%5==0) {
				count++;
			}

			else if(nums<=total) {
				count++;
				total -= nums;
			}
		}

		return count;
	}
}
