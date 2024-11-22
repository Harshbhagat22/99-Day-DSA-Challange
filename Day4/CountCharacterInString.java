import java.util.*;
public class CountCharacterInString
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		int result = countChar(str,ch);
		System.out.print(result);
	}
	
	public static int countChar(String s,char ch){
	    int count = 0;
	    for(char c:s.toCharArray()){
	        if(c==ch){
	            count++;
	        }
	    }
	    
	    return count;
	}
}
