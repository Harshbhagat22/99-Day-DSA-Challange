import java.util.*;

public class PalindromeNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(isPalindrome(n));
	}
	
	public static boolean isPalindrome(int n){
	    int temp = n;
	    int num = 0;
	    while(n!=0){
	        int digit = n%10;
	        num = num*10 + digit;
	        n = n/10;
	    }
	    
	    return num == temp;
	}
}
