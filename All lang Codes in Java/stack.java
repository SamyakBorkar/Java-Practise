class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push element " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " to the stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot pop element.");
            return -1;
        }
        int poppedValue = stackArray[top];
        top--;
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No element to peek.");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5); 

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element of stack: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Is the stack empty? " + stack.isEmpty());

        stack.pop();
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}
