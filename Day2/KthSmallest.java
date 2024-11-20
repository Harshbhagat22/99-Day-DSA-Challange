import java.util.Scanner;
import java.util.Arrays;

public class KthSmallest
{
    public static int kthSmallest(int arr[],int k){
        if(arr.length==0){
            return 0;
        }
        
        Arrays.sort(arr);
        return arr[k-1];
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		int result = kthSmallest(arr,k);
		System.out.print(result);
	}
}
