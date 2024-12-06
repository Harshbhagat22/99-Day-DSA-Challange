class Programming {
    private String name;
    
    Programming(String str){
        this.name = "I Love " + str;
    }
    
    Programming(){
        this.name = "I Love Programming Languages";
    }
    
    void display(){
        System.out.print(name+"\n");
    }
}

public class ProgramOnConstructor {
    public static void main(String args[]){
        Programming p = new Programming();
        Programming p1 = new Programming("Java");
        Programming p2 = new Programming("Python");
        Programming p3 = new Programming("CPP");
        p.display();
        p1.display();
        p2.display();
        p3.display();
        
    }
}