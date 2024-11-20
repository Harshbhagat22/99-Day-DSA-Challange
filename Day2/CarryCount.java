import java.io.*;
import java.util.*;

public class CarryCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solve(n,m));
    }
    
    public static int solve(int num1,int num2){
        int count = 0;
        int carry = 0;
        while(num1>0 || num2>0){
            int sum = num1%10 + num2%10 + carry;
            carry = sum /10;
            
            if(carry==1){
                count++;
            }
            
            num1 /= 10;
            num2 /= 10;
        }
        
        return count;
    }
}