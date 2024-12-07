import java.util.*;
class College {
    int id;
    String name;
    
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE COLLEGE ID  :\n");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER THE COLLEGE NAME  :\n");
        name = sc.nextLine();
    }
    
    void display(){
        System.out.print("\nID :"+id+"\n"+"Name :"+name);
    }
}

class Student extends College {
    int roll;
    String name;
    void getData1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE ROLL NO OF STUDENT  :\n");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("ENTER THE STUDENT NAME  :\n");
        name = sc.nextLine();
    }
    
    void display1(){
        System.out.print("\nRoll :"+roll+"\n"+"Name :"+name);
    }
}

public class InheritanceSImple {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.getData();
        s1.getData1();
        s1.display();
        s1.display1();
    }
}