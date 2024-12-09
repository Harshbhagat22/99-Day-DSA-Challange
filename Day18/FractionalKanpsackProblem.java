import java.util.*;
class Main {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int weight[] = new int[n];
    int profit[] = new int[n];
    float PiWi[] = new float[n];
    for(int i=0;i<weight.length;i++){
        weight[i] = sc.nextInt();
    }
    
    for(int i=0;i<profit.length;i++){
        profit[i] = sc.nextInt();
    }
    
    for(int i=0;i<PiWi.length;i++){
        PiWi[i] = (float) profit[i] / weight[i];
    }
    
    int capacity = sc.nextInt();
    
    System.out.print(knapsackProblem(weight,profit,PiWi,capacity));
    
    }
    
    public static float knapsackProblem(int weight[],int profit[],float PiWi[],int capacity){
       float total = 0;
       for(int i=0;i<weight.length;i++){
           for(int j=i+1;j<weight.length;j++){
               if(PiWi[i]<PiWi[j]){
                   float temp = PiWi[i];
                   PiWi[i] = PiWi[j];
                   PiWi[j] = temp;
                   
                   int temp1 = weight[i];
                   weight[i] = weight[j];
                   weight[j] = temp1;
                   
                   
                   int temp2 = profit[i];
                   profit[i] = profit[j];
                   profit[j] = temp2;
               }
           }
       }
       
       for(int i=0;i<PiWi.length;i++){
           if(capacity==0){
               break;
           }
           
           else if(weight[i]<=capacity){
               total += profit[i];
               capacity -= weight[i];
           }
           
           else {
               total += PiWi[i] * capacity;
               capacity = 0;
           }
       }
       
       return total;
    }
}