class Stack {

    private int[] stack;
    private int top;

    Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    // Push
    void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
    }

    // Pop
    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int value = stack[top];
        top--;
        return value;
    }

    // Peek
    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }

        return stack[top];
    }

    // Check if empty
    boolean isEmpty() {
        return top == -1;
    }

    // Size
    int size() {
        return top + 1;
    }

    // Display
    void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }
}

public class MyStack {

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Popped: " + stack.pop());

        stack.display();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Is Empty: " + stack.isEmpty());

        System.out.println("Size: " + stack.size());
    }
}