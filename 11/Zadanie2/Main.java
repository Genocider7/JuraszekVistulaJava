package Zadanie2;
public class Main
{
    public static void main(String[] args) {
        Priority mt1 = new Priority("thread with high priority");
        Priority mt2 = new Priority("thread with low priority");
        Priority mt3 = new Priority("thread nr 1 with normal priority");
        Priority mt4 = new Priority("thread nr 2 with normal priority");
        Priority mt5 = new Priority("thread nr 3 with normal priority");
        // mt1.thread.setPriority(Thread.NORM_PRIORITY + 2);
        // mt2.thread.setPriority(Thread.NORM_PRIORITY - 2);
        mt1.thread.setPriority(Thread.MAX_PRIORITY);
        mt2.thread.setPriority(Thread.MIN_PRIORITY);
        mt1.thread.start();
        mt2.thread.start();
        mt3.thread.start();
        mt4.thread.start();
        mt5.thread.start();
        try
        {
            mt1.thread.join();
            mt2.thread.join();
            mt3.thread.join();
            mt4.thread.join();
            mt5.thread.join();
        } catch (InterruptedException e)
        {
            System.out.println("Main thread has started work");
        }
        System.out.println("\nThread with high priority counted to " + mt1.count);
        System.out.println("Thread with low priority counted to " + mt2.count);
        System.out.println("First thread with normal priority counted to " + mt3.count);
        System.out.println("Second thread with normal priority counted to " + mt4.count);
        System.out.println("Third thread with normal priority counted to " + mt5.count);
    }
}