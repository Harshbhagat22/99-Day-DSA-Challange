import java.util.*;

public class Nth_SequencePrimeNumber
{
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        
        else {
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
        }
        
        return true;
    }
    
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int num = 2;
	        int count =0;
	        while(count<n){
	           
	           if(isprime(num)){
	               System.out.print(num+" ");
	               count++;
	           }
	            
	            num++;
	        }
	}
}