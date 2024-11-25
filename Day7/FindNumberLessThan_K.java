import java.util.*;

public class FindNumberLessThan_K
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();

		int result = findNum(arr,k);
		System.out.print(result);
	}

	public static int findNum(int arr[],int x) {
	    if(arr==null || arr.length==0){
	        return -1;
	    }
	       int count = 0;
	       for(int nums:arr){
	           if(nums<x){
	               count++;
	           }
	       }
	       
	       return count;
	}
}