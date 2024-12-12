abstract class Demo {
     int x=5,y=10;
    abstract void fun1();
}

class Demo1 extends Demo {
     int a=1,b=2;
    void set(){
        System.out.println("Child function");
    }
    
    void fun1(){
        System.out.println("Override function");
    }
}

public class AbstractClass {
    public static void main(String agrs[]){
        Demo1 d1 = new Demo1();
        System.out.println(d1.x);
        System.out.println(d1.y);
        System.out.println(d1.a);
        System.out.println(d1.b);
        d1.set();
        d1.fun1();
    }
}

