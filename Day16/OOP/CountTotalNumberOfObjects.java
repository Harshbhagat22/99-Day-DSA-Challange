class Test {
    private static int x = 0;
    
    Test (){
        x++;
    }
    
    void display(){
        System.out.print(x+"\n");
    }
}
public class CountTotalNumberOfObjects
{
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		System.out.print("Total Number of Object = ");
		t1.display();
	}
}
