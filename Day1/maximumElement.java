import java.util.*;
public class maximumElement
{
    public static int maxElement(int arr[]){
        if(arr==null){
            return 0;
        }
        
        if(arr.length==1){
            return arr[0];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        
        return max;
    }
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array :\n");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter the Array Elements:\n");
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		int result = maxElement(arr);
		System.out.print("The maximum element is : "+result);
	}
}
