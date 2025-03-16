public

import java.util.*;

class Queue {
    int[] queue;
    int front = -1, rear = -1, size;
    Scanner sc = new Scanner(System.in);

    Queue() {
        System.out.print("Enter queue size: ");
        size = sc.nextInt();
        queue = new int[size];
    }

    void enqueue() {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        } else {
            System.out.print("Enter element to enqueue: ");
            int ele = sc.nextInt();
            if (front == -1)
                front = 0;
            queue[++rear] = ele;
        }
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println("Dequeued element: " + queue[front++]);
        }
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Operation {     public static void main(String[] args) {         Queue queue = new Queue();         Scanner sc = new Scanner(System.in); 
        while (true) { 
            System.out.println("Queue operations: 1.Enqueue 2.Dequeue 3.Display 4.Exit");             int choice = sc.nextInt();             switch (choice) {                 case 1 -> queue.enqueue();                 case 2 -> queue.dequeue();                 case 3 -> queue.display();                 case 4 -> { 
                    System.out.println("Exit");                     return; 
                } 
                default -> System.out.println("Invalid choice"); 
            } 
        } 
    } 
}{

}
