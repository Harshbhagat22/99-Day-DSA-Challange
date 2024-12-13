import java.util.*;
public class PriinTableNumber
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = 1;
	    int m = sc.nextInt();
	    System.out.println();
		for(int i=m;i<=m*10;i=i+m){
		    System.out.println(m+" X "+ n++ + " = "+ i);
		}
	}
}
