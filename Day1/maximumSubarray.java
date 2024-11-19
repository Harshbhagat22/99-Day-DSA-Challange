import java.util.*;
public class maximumSubarray
{
    public static int maximumSubArray(int arr[]){
        if(arr==null){
            return 0;
        }
        
        if(arr.length==1){
            return arr[0];
        }
        
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            
            if(sum>maxi) {
                maxi = sum;
            }
            
            if(sum<0){
                sum = 0;
            }
        }
        
        return maxi;
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Array Size :\n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the Array Elements :\n");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        int result = maximumSubArray(arr);
        System.out.print("The maximumSubArray is : "+ result);
	}
}
