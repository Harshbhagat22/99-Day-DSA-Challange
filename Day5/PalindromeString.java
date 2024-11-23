import java.util.*;

public class PalindromeString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str){
	  String temp = str;
	  StringBuilder sb = new StringBuilder(str);
	  String temp1 = sb.reverse().toString();
	  
	  return temp.equals(temp1);
	  
	}
}
