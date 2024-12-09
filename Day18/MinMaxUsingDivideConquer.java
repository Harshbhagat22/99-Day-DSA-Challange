import java.util.*;
class Result {
    int min;
    int max;
    
}

public class MinMaxUsingDivideConquer {
    public static Result minMax(int arr[],int low,int high){
        Result result = new Result();
        if(low==high){
            result.min = arr[high];
            result.max = arr[low];
            return result;
        }
        
        if(high==low + 1){
            if(arr[low]<arr[high]){
                result.min = arr[low];
                result.max = arr[high];
            }
            
            else {
                result.min = arr[high];
                result.max = arr[low];
            }
            
            return result;
        }
        
        int mid = (low + high)/2;
        
        Result leftArray = minMax(arr,low,mid);
        Result rightArray = minMax(arr,mid+1,high);
        
        result.min = Math.min(leftArray.min,rightArray.min);
        result.max = Math.max(leftArray.max,rightArray.max);
        
        return result;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        Result res = minMax(arr,0,arr.length - 1);
        System.out.println(res.min);
        System.out.println(res.max);
    }
}