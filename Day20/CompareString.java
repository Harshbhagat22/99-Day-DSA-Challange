import java.util.*;

public class CompareString
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(stringCompare(s1,s2)==0){
		    System.out.print("Equals");
		}
		
		else {
		    if(stringCompare(s1,s2)<0){
		        System.out.print("String 1 is smaller than second \n");
		    }
		    
		    else {
		        System.out.print("String 1 is greater than second");
		    }
		}
	}
	
	public static int stringCompare(String str1,String str2){
	    return str1.compareTo(str2);
	}
}
