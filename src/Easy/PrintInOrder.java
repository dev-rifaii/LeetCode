package Easy;

public class PrintInOrder {
    Object lock;
    boolean l1;
    boolean l2;

    public PrintInOrder() {
        l1 = false;
        l2 = false;
        lock = new Object();
    }

    public void first(Runnable printFirst) {
        synchronized (lock) {
            printFirst.run();
            l1 = true;
            lock.notifyAll();
        }

    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (lock) {
            while (!l1) {
                lock.wait();
            }
            printSecond.run();
            l2 = true;
            lock.notifyAll();
        }

    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (lock) {
            while (!l2) {
                lock.wait();
            }
            printThird.run();
        }
    }
}
