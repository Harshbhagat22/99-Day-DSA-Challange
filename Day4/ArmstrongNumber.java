import java.util.*;
class Solution {
    public static boolean isArmstrong(int n){
        int temp = n;
        int sum = 0;
        int digits = Integer.toString(n).length();
        while(n>0){
            int last = n%10;
            sum += Math.pow(last,digits);
            n = n/10;
        }
	    
        return temp == sum;
    }
}

public class ArmstrongNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(Solution.isArmstrong(n));
	}
}
