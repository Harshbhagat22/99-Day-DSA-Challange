import java.io.*;
import java.util.*;

public class CountDifference {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();
        
        int result = solve(arr,num,diff);
        System.out.print(result);
    }
    
    public static int solve(int arr[],int x,int y){
        if(arr==null){
            return -1;
        }
        
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(Math.abs(x - arr[i])<=y){
                count++;
            }
        }
        
        return (count>1)? count : -1;
    }
}