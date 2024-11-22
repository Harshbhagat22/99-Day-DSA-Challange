import java.util.Scanner;

class Stack {
    int top = 0;
    int stack[] = new int[50];

    void push() {
        if (top == stack.length) {
            System.out.print("ERROR: Overflow\n");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the item to be inserted:\n");
            int item = sc.nextInt();
            stack[top] = item;
            top++;
        }
    }

    void pop() {
        if (top == 0) {
            System.out.print("ERROR: Underflow\n");
        } else {
            top--; 
            System.out.println("Popped item: " + stack[top]);
            stack[top] = 0; 
        }
    }

    void display() {
        if (top == 0) {
            System.out.print("Stack is empty\n");
            return;
        }
        System.out.print("Stack contents: ");
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack s = new Stack();
        int x;
        System.out.println("        STACK         ");
        System.out.print("1.PUSH \n2.POP\n3.DISPLAY\n4.EXIT\n");
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Enter Your choice:\n");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.print("Invalid input\n");
                    break;
            }

            System.out.print("Do you want to continue 1/0:\n");
            x = sc.nextInt();
        } while (x == 1);
        
        
    }
}
