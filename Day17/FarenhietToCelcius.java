import java.util.*;
public class FarenhietToCelcius
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    double n = sc.nextDouble();
	    System.out.print(FarenhietToCelcius(n));
	}
	
	public static double FarenhietToCelcius(double n){
	  return (n - 32) * 5 / 9;
	}
}
