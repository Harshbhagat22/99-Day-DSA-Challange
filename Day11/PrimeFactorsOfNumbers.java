import java.util.*;
public class PrimeFactorsOfNumbers
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		findPrimeFactors(n);
		
	}
	
	public static boolean isPrime(int m){
	    if(m<=1){
	        return false;
	    }
	    
	    for(int i=2;i<=Math.sqrt(m);i++){
	        if(m%i==0){
	            return false;
	        }
	    }
	    
	    return true;
	}
	
	public static void findPrimeFactors(int n){
	    for(int i=2;i<=n/2;i++){
	        if(n%i == 0 && isPrime(i)){
	            System.out.print(i+" ");
	        }
	    }
	}
}
