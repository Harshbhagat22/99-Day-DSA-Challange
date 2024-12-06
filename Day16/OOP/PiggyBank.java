class AddAmount {
    private int amount = 50;
    
    AddAmount(){
        this.amount = amount;
    }
    
    AddAmount(int value){
        this.amount = amount + value;
    }
    
    void display(){
        System.out.print(amount+"\n");
    }
}

public class PiggyBank {
    public static void main(String args[]){
       AddAmount a1 = new AddAmount();
       AddAmount a2 = new AddAmount(500);
       AddAmount a3 = new AddAmount(1000);
       System.out.print("Piggy Bank Balance     :\n");
       a1.display();
       a2.display();
       a3.display();
    }
}