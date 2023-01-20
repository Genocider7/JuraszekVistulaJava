package Zadanie1;
public class Main
{
    public static void main(String[] args) {
        System.out.println("Main thread has started working");
        MyThread mythread1 = MyThread.createAndStart("subthread nr 1");
        MyThread mythread2 = MyThread.createAndStart("subthread nr 2");
        MyThread mythread3 = MyThread.createAndStart("subthread nr 3");
        try 
        {
            mythread1.thread.join();
            mythread2.thread.join();
            mythread3.thread.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread has been stopped");
        }
        System.out.println("Main thread has stopped working");
    }
}