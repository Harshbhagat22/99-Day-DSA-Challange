import java.util.*;
public class AreaOfCanopy
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = (int) areaOfCanopy(n);
		System.out.print(result);
	}
	
	public static float areaOfCanopy(int n){
	    float pi = 3.14f;
	    float area = pi * n * n;
	   return area;
	}
}
