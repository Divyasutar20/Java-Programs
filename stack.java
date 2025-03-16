import java.util.*;

class stack {
    int top;
    int i;
    int ele;
    int size = 5;
    int stk[] = new int[size];

    stack() {

        top = -1;
    }

    void push() {
        if (top == size - 1) {
            System.out.println("Stack is Full ");
        }

        else {
            Scanner sc = new Scanner(System.in);
            ele = sc.nextInt();
            top++;
            stk[top] = ele;
            System.out.println(ele + " pushed into the stack");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty.");
        } else {
            ele = stk[top];
            top--;
            System.out.println(stk[top] + " popped from the stack");

        }
    }

    void display() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            for (i = top; i >= 0; i--) {
                System.out.println(stk[i]);
            }
        }
    }

    public static void main(String[] args) {
        stack sc = new stack();
        int option;
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("\n1.push\n2.pop\n3.display\n4.exit\nenter option:");
            option = sc1.nextInt();
            switch (option) {
                case 1:
                    sc.push();
                    break;
                case 2:
                    sc.pop();
                case 3:
                    sc.display();
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }
}