import java.util.*;
public class FindUnique {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        int result = findUnique(arr);
        System.out.print(result);
    }
    
    public static int findUnique(int arr[]){
        if(arr==null){
            return 0;
        }
        
        int unique = 0;
        for(int nums:arr){
            unique ^= nums;
        }
        
        return unique;
    }
}