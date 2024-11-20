import java.io.*;
import java.util.*;

public class ratCountHouse {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        int result = ratCountHouse(r,unit,arr);
        System.out.print(result);
    }
    
    public static int ratCountHouse(int rat,int unit,int arr[]){
       if(arr.length==0){
           return -1;
       }
        int tf = rat * unit;
        int sum = 0;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            count++;
            if(sum>=tf){
                return count;  
            }
        }
        
        return 0;
    }
}