import java.util.*;

class Stack1 {
    int[] stk;
    int top = -1;
    int size;
    Scanner sc = new Scanner(System.in);

    Stack() 
     {  
           System.out.print("Enter stack size: ");         
           size = sc.nextInt();         
           stk = new int[size]; 
       }

    void push() {
        if (top == size - 1) {
            System.out.println("Stack is Full");
        } else {
            System.out.print("Enter element to push: ");
            int ele = sc.nextInt();
            stk[++top] = ele;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Popped element: " + stk[top--]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Operation {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(" operation: 1.Push 2.Pop 3.Display 4.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
