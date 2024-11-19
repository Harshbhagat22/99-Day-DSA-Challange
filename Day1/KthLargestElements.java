import java.util.*;
import java.util.Arrays;
public class KthLargestElements
{
    public static int kthLargestElement(int arr[],int k){
        if(arr.length==0){
            return 0;
        }
       
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		int result = kthLargestElement(arr,k);
		System.out.print(result);
	}
}
