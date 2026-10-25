package basicConcepts;

public class MultiThread {
    public static void main(String[] args)throws Exception {
        Counter counter = new Counter();
        MyThread my = new MyThread(counter);
        MyThread my1 = new MyThread(counter);
        my.start();
        my1.start();
        my.join();
        my1.join();

//        try {
//            my.join();
//            my1.join();
//        } catch (Exception r) {
//            r.printStackTrace();
//        }
        System.out.println(" Counting  : " + counter.getCount());
    }
}

class Counter {
    private int count = 0;

    void increment() {
        count++;
    }
    int getCount() {
        return count;
    }
}
class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public synchronized void run() {
        for (int i = 0; i <100; i++) {
            System.out.println(" "+i);
            counter.increment();
        }
    }


}