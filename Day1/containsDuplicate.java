import java.util.Scanner;
import java.util.Arrays;
public class containsDuplicate
{
    
    public static boolean containsDuplicates(int arr[]){
        if(arr == null || arr.length==1){
            return false;
        }
        
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        
       return false;
    }
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n];
		for(int i=0;i<arr.length;i++){
		    arr[i] = sc.nextInt();
		}
		
		boolean flag = containsDuplicates(arr);
		System.out.print(flag);
	}
}
