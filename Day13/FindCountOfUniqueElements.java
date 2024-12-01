import java.util.*;
public class FindCountOfUniqueElements
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		System.out.print(countUnique(arr));
	}
	
	public static int countUnique(int arr[]){
	    if(arr.length==0){
	        return 0;
	    }
	    
	    Arrays.sort(arr);
	    int count = 1;
	    for(int i=1;i<arr.length;i++){
	        if(arr[i] !=arr[i -1]){
	            count++;
	        }
	    }
	   return count;
	}
}
