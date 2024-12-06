import java.util.*;
class Student {
    String name;
    int sem;
    String branch;
    float per;
    
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name    :\n");
        name = sc.nextLine();
        System.out.print("Enter the Semester    :\n");
        sem = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter The Branch  :\n");
        branch = sc.nextLine();
        System.out.print("Enter the Percentage of Student   :\n");
        per = sc.nextFloat();
    }
    
    void display(){
        System.out.print("Name : "+name +"  ||  "+"Percentage : "+per+" "+"\n");
    }
    
    boolean isMoreThan80(){
        return per>=80;
    }
    
}

public class Main{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Student   :\n");
        int n = sc.nextInt();
        Student s[] = new Student[n];
        
        for(int i=0;i<s.length;i++){
            s[i] = new Student();
            System.out.print("\nFor Student "+(i + 1) +"\n");
            s[i].getData();
        }
        
        System.out.print("\nStudent Percentage is Greater than 80 :\n");
        for(Student stud: s){
            if(stud.isMoreThan80()==true){
                stud.display();
            }
        }
        
    }
}