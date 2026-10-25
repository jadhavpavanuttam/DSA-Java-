package arraySeries;

public class QueueImplement {
    public static void main(String[] args) {

//        [1,2,3,4,5]
        Queue queue = new Queue();
        queue.enQueue(10);
        queue.enQueue(12);
        queue.enQueue(15);
//        queue.deQueue();
        queue.enQueue(30);
        queue.enQueue(45);
        queue.enQueue(25);
        queue.show();
        System.out.println(queue.deQueue());
//        queue.show();
        queue.deQueue();
        queue.show();
        queue.deQueue();
        queue.show();

    }
}

class Queue {
    private int size = 0;
    private int[] arr = new int[4];
    private int rear = -1;
    private int front = 0;

    public void enQueue(int data) {
        if (!isFull()) {
            rear = (rear + 1) % 4;
            arr[rear] = data;
            size++;
        } else {
            System.out.println("Quque is Full..");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int deQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Quque is Empty...");
        }
        int data = arr[front];
        front = (front + 1) % 4;
        size--;
        return data;
    }

    public void show() {
        for (int i = front; i < size; i++)
            System.out.print(arr[i] + "  ");
        System.out.println("");
    }

    public boolean isFull() {
        return size == 4;
    }

    public int peek() {
        if (isEmpty())
            throw new RuntimeException("JavaInterviewQuetions.Queue is Empty...");
        return arr[front];
    }
}

/*
JavaInterviewQuetions.Queue basics:

in case of circular queue :
we will be gives mod i.e. ->
(rear +1)% size -> (4+1)%4=> 1
last element are shifted at this position

linear data structure:
Rear , Front
circular queue:
indexing => (rear+1) % length
double ended queue
insertion and deletion from both ends rear & front
 */
