import java.util.*;
public class ReplaceCharacterInString
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    char ch = sc.next().charAt(0);
	    char ch1 = sc.next().charAt(0);
	    
	    String result = replaceString(str,ch,ch1);
	    System.out.print(result);
	}
	
	public static String replaceString(String s,char ch,char ch1){
	    if(s==null){
	        return "";
	    }
	    StringBuilder sb = new StringBuilder();
	    for(char c:s.toCharArray()){
	       if(c==ch){
	           sb.append(ch1);
	       }
	       
	       else {
	           if(c==ch1){
	               sb.append(ch);
	           }
	           
	           else {
	               sb.append(c);
	           }
	       }
	    }
	    
	    return sb.toString();
	}
}
