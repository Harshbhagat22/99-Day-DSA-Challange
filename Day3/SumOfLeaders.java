import java.util.*;
public class SumOfLeaders
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		System.out.print(sumOfleaders(arr));
		
	}
	
	public static int sumOfleaders(int arr[]){
	    int leader = arr[arr.length-1];
	    int sum = leader;
	    for(int i=arr.length-2;i>=0;i--){
	        if(arr[i]>leader){
	            leader = arr[i];
	            sum += leader;
	        }
	    }
	    
	    return sum;
	}
}