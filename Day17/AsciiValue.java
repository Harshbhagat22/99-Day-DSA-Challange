import java.util.*;
public class AsciiValue
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int result = AsciiValue(ch);
		System.out.print(result);
	}
	
	public static int AsciiValue(char ch){
	    return (int) ch;
	}
}
