import java.util.*;

public class Gcd
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1<=0 || n2 <=0){
		    return;
		}
		
		int result = gcd(n1,n2);
		if(result>1){
		    System.out.print(result);
		}
		
		else {
		  System.out.print(1);
		}
		
		
	}
	
	public static int gcd(int a, int b){
	    while(b!=0){
	        int temp = b;
	        b = a%b;
	        a = temp;
	    }
	    
	    return a;
	}
}