interface Demo {
    int x = 2;
    int y = 3;
    
    void set();
    void display();
}

class Demo1 implements Demo {
    int a,b;
   public void set(){
        System.out.println("Override");
    }
    
    public void display(){
        System.out.println("Override");
    }
}

public class InterfaceExample {
    public static void main(String args[]){
        Demo1 d1 = new Demo1();
        System.out.println(d1.x);
        System.out.println(d1.y);
        System.out.println(d1.a);
        d1.set();
        d1.display();
    }
}