import java.util.*;
public class DifferenceBetweenCountOfEvenAndOdd
{
	public static int diffOfCount(int arr[]) {
		if(arr == null) {
			return 0;
		}
		int even = 0;
		int odd = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
			}

			else {
				odd++;
			}
		}

		return odd - even;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print(diffOfCount(arr));
	}
}