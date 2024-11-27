import java.util.*;

public class LeapYearOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = isLeapYear(n);
		if(flag == true) {
			System.out.print(n+ " is Leap Year");
		}

		else {
			System.out.print(n+ " is not Leap Year");
		}
	}

	public static boolean isLeapYear(int n) {
		return (n%400==0 || (n%4==0 && n%100 !=0));
	}
}