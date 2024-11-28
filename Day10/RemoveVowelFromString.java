import java.util.*;

public class RemoveVowelFromString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.print(removeVowel(str));
	}

	public static String removeVowel(String str) {
		StringBuilder ans = new StringBuilder();
		String vowels = "AEIOUaeiou";
		for (char c : str.toCharArray()) {
			if (vowels.indexOf(c) == -1) {
				ans.append(c);
			}
		}
		
		return ans.toString();
	}
}
