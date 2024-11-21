import java.util.*;
public class checkPassword
{
    public static int checkPassword(String str){
        int n = str.length();
        int a =0;
        int b = 0;
        if(n<4){
            return 0;
        }
        
        if(str.charAt(0)>='0' && str.charAt(0)<='9'){
            return 0;
        }
        
        for(int i=0;i<n;i++){
            
            if(str.charAt(i) ==' ' || str.charAt(i) =='/')
            {
                return 0;
            }
            
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                a++;
            }
            
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                b++;
            }
            
            
        }
        
        
        if(a>0 && b>0){
                return 1;
            }
            
            else {
                return 0;
            }
       
    }
    
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  String str = sc.nextLine();
	  System.out.print(checkPassword(str));
	}
}