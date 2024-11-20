import java.util.*;
public class sort_1_0
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		sortArray(arr);
	
	}
	
	public static void sortArray(int arr[]){
	    int left = 0;
	    int right = arr.length - 1;
	    while(left<right){
	        if(arr[left]==0){
	            left++;
	        }
	        
	        else {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            right--;
	        }
	    }
	    
	    	for(int nums:arr){
		    System.out.print(nums+" ");
		}
	}
}
