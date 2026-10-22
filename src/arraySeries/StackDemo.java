package JavaDsa;

public class StackDemo {
    public static void main(String[] args) {
        Stack1 stack = new Stack1();

        stack.push(5);
        System.out.println("Popped : " + stack.pop());
        System.out.println("Top element is : " + stack.peek());
        stack.push(10);
        stack.push(15);
        stack.push(20);

        stack.printStack();
    }
}

class Stack1 {
    int top = -1;
    int stack[] = new int[5];

    // Push operation
    public void push(int data) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = data;
            System.out.println(data + " pushed into stack");
        }
    }

    // Pop operation
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1; // better than 0
        } else {
            return stack[top--];
        }
    }

    // Peek operation
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack[top];
    }

    // Print stack (only valid elements)
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return;
        }

        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}






/*

public class StackDemo {
    public static void main(String[] args) {
        Stack1 stack = new Stack1();
        stack.push(5);
        System.out.println("popped"+stack.pop());
        System.out.println("Top element is : "+stack.peek());
        stack.push(10);
        stack.push(15);
        stack.printStack();
    }
}

class Stack1 {
    int top=-1;
    int stack[] = new int[5];


    public void push(int data) {
        if (top<stack.length) {
                stack[++top] = data;
        }
        else
        {
            System.out.println("Stack is overflow..");
            return;
        }

    }

    public int pop() {
        if (top>-1) {
            return stack[top--];
        }
        else
        {
            System.out.println("Stack underflow..");
        }
        return 0;
    }
public void printStack()
{
    for(int x:stack)
        System.out.print(x+" ");
    System.out.println();
}
    public int peek() {
     return stack[top];
    }
}
*/