import java.util.*;

public class SpecialFibonacciSeries
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = specialFabonocii(n);
		System.out.print(result);
	
	}
	
	public static int specialFabonocii(int n){
	    if(n<=1){
	        return 1;
	    }
	    
	    int t1 = specialFabonocii(n-1);
	    int t2 = specialFabonocii(n-2);
	    
	    int a =  (t1 * t1) % 47;
	    int b =  (t2 * t2) % 47;
	    
	    return (a + b) % 47;
	}
}