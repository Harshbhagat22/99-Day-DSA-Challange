import java.util.*;
public class AsciiToChar
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int x = sc.nextInt();
	    char result = AsciiToChar(x);
	    System.out.print(result);
	}
	
	public static char AsciiToChar(int n){
	    return (char) n;
	}
}
