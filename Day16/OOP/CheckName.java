class Student {
    private String name;
    
    Student(){
        this.name = "Unknown";
    }
    
    Student(String str){
        this.name = str;
    }
    
    void display(){
        System.out.print(name+"\n");
    }
}
public class CheckName
{
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Harsh Bhagat");
		s1.display();
		s2.display();
	}
}
