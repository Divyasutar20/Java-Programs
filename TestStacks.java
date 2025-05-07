import java.util.*;

interface Stacks {
    int size = 5; // Fixed size of the stack

    void push(int value);

    int pop();

    void display();

    boolean overflow();

    boolean underflow();
}

class IntegerStack implements Stacks {
    private List<Integer> stackList = new ArrayList<>();

    @Override
    public void push(int value) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackList.add(value);
            System.out.println("Pushed: " + value);
        }
    }

    @Override
    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int value = stackList.remove(stackList.size() - 1);
            System.out.println("Popped: " + value);
            return value;
        }
    }

    @Override
    public void display() {
        if (stackList.isEmpty()) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Stack elements: " + stackList);
        }
    }

    @Override
    public boolean overflow() {
        return stackList.size() >= size;
    }

    @Override
    public boolean underflow() {
        return stackList.isEmpty();
    }
}

public class TestStacks {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        stacks.pop(); // Underflow test
        stacks.push(10);
        stacks.push(20);
        stacks.push(30);
        stacks.push(40);
        stacks.push(50);
        stacks.push(60); // Overflow test

        stacks.display();

        stacks.pop();
        stacks.pop();

        stacks.display();
    }
}
