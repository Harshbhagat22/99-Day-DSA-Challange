import java.util.*;

public class SumOfPrimeNumber_upto_N
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = sumOfPrime(n);
		System.out.print(result);
	}
	
	public static boolean isPrime(int n){
	    if(n<2){
	        return false;
	    }
	    
	    for(int i=2;i<=Math.sqrt(n);i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    
	    return true;
	}
	
	public static int sumOfPrime(int n){
	    int sum = 0;
	    if(n<=1){
	        return 0;
	    }
	    
	    for(int i=2;i<=n;i++){
	        if(isPrime(i)==true){
	            sum += i;
	        }
	    }
	    
	    return sum;
	}
}