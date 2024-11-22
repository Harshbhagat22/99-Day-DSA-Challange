import java.util.*;
public class EvenOddString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        String result = evenOdd(arr);
        System.out.print(result);
    }
    
    public static String evenOdd(int arr[]){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                sb.append("Even");
            }
            
            else {
                sb.append("Odd");
            }
        }
        
        return sb.toString();
    }
}