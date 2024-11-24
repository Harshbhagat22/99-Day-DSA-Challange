import java.util.*;

public class MinimumBitsFlipToGetNumber_A_to_B
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result = flipBits(num1,num2);
		System.out.print(result);
	}
	
	public static int flipBits(int x ,int y){
	    int temp = x ^ y;
	    return Integer.bitCount(temp);
	}
}