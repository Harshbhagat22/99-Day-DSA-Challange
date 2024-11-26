import java.util.*;
public class StabilizeSystem
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = stabilizeSystem(n);
		System.out.print(result);

	}

	public static int stabilizeSystem(int n) {
		String str = Integer.toString(n);
		StringBuilder sb = new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(ch== '0') {
				sb.append('5');
			}

			else {
				sb.append(ch);
			}
		}

		int temp = Integer.parseInt(sb.toString());
		return temp;
	}
}
