import java.util.*;
public class Main {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i ==0){
                return false;
            }
            
        }
        
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        for(int nums:arr){
            if(isPrime(nums)==true){
                System.out.print(nums+" ");
                break;
            }
        }
        
        for(int i=arr.length-1;i>=0;i--){
            if(isPrime(arr[i])==true){
                System.out.print(arr[i]+" ");
                break;
            }
        }
    }
}