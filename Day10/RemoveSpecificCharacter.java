import java.util.*;

public class RemoveSpecificCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		System.out.print(removeString(str,ch));
	}

	public static String removeString(String str,char ch) {
		StringBuilder sb = new StringBuilder();
		for(char c:str.toCharArray()) {
			if(c != ch) {
				sb.append(c);
			}
		}

		return sb.toString();
	}
}
