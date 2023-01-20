package Zadanie1;
public class MyThread implements Runnable
{
    Thread thread;
    MyThread(String name)
    {
        thread = new Thread(this, name);
    }
    public static MyThread createAndStart(String name)
    {
        MyThread myThread = new MyThread(name);
        myThread.thread.start();
        return myThread;
    }
    public void run()
    {
        System.out.println(thread.getName() + " is starting working.");
        try
        {
            for (int count = 0; count < 10; count++)
            {
                Thread.sleep(400);
                System.out.println(thread.getName() + " is being executed. count: " + count);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(thread.getName() + " has been stopped.");
        }
        System.out.println(thread.getName() + " has finished working.");
    }
}