package arraySeries;

public class StackImplement {
    public static void main(String[] args) {
        StackDemo s=new StackDemo();
//        s.push(5);
//        s.push(4);
////        s.push(6);
////        s.push(7);
//        s.push(3);
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        System.out.println(s.pop());
//        s.printStack();
//        System.out.println(s.pop());
    }
}

class Stack {
    int top = -1;
    int size;
    private int stack[] = new int[5];

    Stack() {
        size = stack.length;
    }

    void push(int data) {
        if(top==-1)
        {
            System.out.println("JavaInterviewQuetions.Stack is Overflow...");
            return;
        }
       stack[++top]=data;
    }
    int pop()
    {
        if(top>-1)
            return stack[top--];
        else
            System.out.println("JavaInterviewQuetions.Stack Underflow...");
        return -1;
    }
   int peek()
    {
      return stack[top];
    }
    void printStack()
    {
        if(top==-1)
        {
//            System.out.println("JavaInterviewQuetions.Stack is Empty..");
            return;
        }
        for (int x:stack)
            System.out.println(" "+x);
    }
}
