import java.util.*;

class StackArray {
    int top;
    int maxSize;
    int[] stack;

    StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into the stack.");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! Cannot pop.");
        } else {
            System.out.println(stack[top] + " popped from the stack.");
            top--;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        StackArray stack = new StackArray(size);

        while (true) {
            System.out.println("\nChoose operation:\n1. Push\n2. Pop\n3. Display\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
