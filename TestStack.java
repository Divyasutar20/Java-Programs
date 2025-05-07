import java.util.*;

interface Stack {
    int size = 5;

    void push(int value);

    int pop();

    void display();

    boolean overflow();

    boolean underflow();
}

class IntegerStack implements Stack {
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

public class TestStack {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.display();

        stack.pop();
        stack.pop();

        stack.display();
    }
}
