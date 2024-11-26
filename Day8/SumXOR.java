import java.util.*;

public class SumXOR
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		int result =  sumXor(arr);
		System.out.print(result);
	}
	
	public static int sumXor(int arr[]){
	    if(arr.length==0){
	        return 0;
	    }
	    
	    int sum1 = 0;
	    int sum2 = 0;
	    for(int i=0;i<arr.length;i++){
	        if(i%2 !=0){
	            sum1 += arr[i];
	        }
	        
	        else {
	            sum2 ^= arr[i];
	        }
	    
	    }
	    
	    return sum1 - sum2;
	}
}
