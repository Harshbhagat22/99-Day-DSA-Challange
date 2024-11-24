import java.util.*;
import java.util.Arrays;

public class AnagramString

{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();

		boolean flag = isAnagram(str1,str2);
		System.out.print(flag);
	}

	public static boolean isAnagram(String str1,String str2) {
	    if(str1.length()==0 || str2.length()==0){
	        return false;
	    }
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1,arr2);
	}
}
