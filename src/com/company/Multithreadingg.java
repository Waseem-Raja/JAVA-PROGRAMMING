//Multithreading allow's concurrent execution of two or more parts of a program
// thread's  are  light weight process within a process
//Help in aceiving cuncurrency
// there are two ways to acieve multithreading
// by extending the thread class
package com.company;
class numberss extends Thread {    //extending a thread class
    // we can use a constructor of a thread class
    numberss(String name)
    {
        super(name);    // invoking thread class's constructor
    }
@Override
        public void run()         // overriding the run method of thread class
{
    System.out.println("hello i am a thread");
    for (int i=0; i<3; i++)
        System.out.println(i);
}
}
// by implementing runnable interface
class mythread implements Runnable    // implementing runnable interface
{
    public void run()
    {
        for(int i=0;i<4;i++)
            System.out.println(i);
    }

}
class mythread2 implements Runnable    // implementing runnable interface
{
    public void run()
    {
        for(int i=0;i<4;i++)
            System.out.println(i);
        try {
            Thread.sleep(1000);   // sleep method
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
public class Multithreadingg {
    public static void main(String[] args) {
//          numberss obj = new numberss();
//          numberss obj2= new numberss();
//          obj.start();      // start method to start a thread
//        obj2.start();
        // about second runnable method
        mythread ob= new mythread();   // creating object
        Thread t1= new Thread(ob);     // this thing is important inorder to start a thread
        mythread2 ob2= new mythread2();
        Thread t2= new Thread(ob2);
//        t1.start();
//        t2.start();
        // Thread Methods
        // we can set priorities as well for threads, but jvm is free to implement priorities in its own way
        t1.setPriority(Thread.MAX_PRIORITY); // assigning thread one max priority10 (by default norm priority is assigned5)
        // getid
        System.out.println("thread id"+t1.getId());

        // join : it waits for a thread to finish then next thread will start
        try {
            t1.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        t2.start();
       //ISALIVE : WILL CHECK IF THREAD IS ALIVE OR DEAD
        System.out.println(t1.isAlive());

        // THERE ARE MANY MORE METHODS OR THREAD CLASS LIKE DAEMON LEAST PRIORITY METHOD ETC
    }
}
// now which one is better to work with
// it seems both are good but if we use thread class we won't be able to extend any other class cause
// multiple inheritance is not allowed here in java
// so if we use runnable interface for multithreading we can extend a class as well and implement runaable
// interface at the same time
// class abc extends xyz implements runnable like this