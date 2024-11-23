import java.util.*;
public class MaximumStreakOf_1_inBinaryArray
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		System.out.print(maxStreak(arr));
	}
	
	public static int maxStreak(int arr[]){
	    
	    if(arr==null){
	        return 0;
	    }
	    
	    int current = 0;
	    int maxi= 0;
	    
	    for(int nums:arr){
	        if(nums==1){
	            current++;
	            maxi = Math.max(current,maxi);
	        }
	        
	        else {
	            current = 0;
	        }
	    }
	    
	    return maxi;
	}
}
