import java.util.*;

public class IsSorted
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		System.out.print(isSorted(arr));
	}
	
	public static boolean isSorted(int arr[]){
	    if(arr==null || arr.length==0){
	        return true;
	    }
	    
	    for(int i=0;i<arr.length-1;i++){
	        if(arr[i]>arr[i+1]){
	            return false;
	        }
	    }
	    
	    return true;
	}
}
