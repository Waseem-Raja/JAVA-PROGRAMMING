////Multithreading allow's concurrent execution of two or more parts of a program
//// threads  are  lightweight process within a process
////Help in achieving cuncurrency
//// there are two ways to achieve multithreading
//// by extending the thread class
package com.company;
//class numberss extends Thread {    //extending a thread class
//    // we can use a constructor of a thread class
//    numberss(String name)
//    {
//        super(name);    // invoking thread class's constructor
//    }
//@Override
//        public void run()         // overriding the run method of thread class
//{
//    System.out.println("hello i am a thread");
//    for (int i=0; i<3; i++)
//        System.out.println(i);
//}
//}
//// by implementing runnable interface
//class mythread implements Runnable    // implementing runnable interface
//{
//    public void run()
//    {
//        for(int i=0;i<4;i++)
//            System.out.println(i);
//    }
//
//}
//class mythread2 implements Runnable    // implementing runnable interface
//{
//    public void run()
//    {
//        for(int i=0;i<4;i++)
//            System.out.println(i);
//        try {
//            Thread.sleep(1000);   // sleep method
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
//public class Multithreadingg {
//    public static void main(String[] args) {
////          numberss obj = new numberss();
////          numberss obj2= new numberss();
////          obj.start();      // start method to start a thread
////        obj2.start();
//        // about second runnable method
//        mythread ob= new mythread();   // creating object
//        Thread t1= new Thread(ob);     // this thing is important inorder to start a thread
//        mythread2 ob2= new mythread2();
//        Thread t2= new Thread(ob2);
////        t1.start();
////        t2.start();
//        // Thread Methods
//        // we can set priorities as well for threads, but jvm is free to implement priorities in its own way
//        t1.setPriority(Thread.MAX_PRIORITY); // assigning thread one max priority10 (by default norm priority is assigned5)
//        // getid
//        System.out.println("thread id"+t1.getId());
//
//        // join : it waits for a thread to finish then next thread will start
//        try {
//            t1.join();
//        }
//        catch (Exception e)
//        {
//            System.out.println(e);
//        }
//        t2.start();
//       //ISALIVE : WILL CHECK IF THREAD IS ALIVE OR DEAD
//        System.out.println(t1.isAlive());
//
//        // THERE ARE MANY MORE METHODS OR THREAD CLASS LIKE DAEMON LEAST PRIORITY METHOD ETC
//    }
//}
//// now which one is better to work with
//// it seems both are good but if we use thread class we won't be able to extend any other class cause
//// multiple inheritance is not allowed here in java
//// so if we use runnable interface for multithreading we can extend a class as well and implement runaable
//// interface at the same time
//// class abc extends xyz implements runnable like this


/*
//how each thread will perform unique tasks
class Multithread extends Thread
{
    int indicate;
    Multithread(int x)
    {
        this.indicate=x;
    }
    public void run()         // overriding the run method of thread class
   {
       //here each thread will execute a different task
      if (this.indicate==0)
          Fun1();
      else
          Fun2();
   }
    public void Fun1()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("i am Fun 1  :"+i);
        }
    }

    public void Fun2()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("i am fun 2  :"+i);
        }
    }
    public void Fun3()
    {
        for (int i=0;i<10;i++)
        {
            System.out.println("i am Fun 3    :"+i);
        }
    }
}
public class Multithreadingg {
    public static void main(String[] args) {
Multithread obj=new Multithread(0);
Multithread obj2=new Multithread(1);
obj.start();
obj2.start();
obj.Fun3();


    }
}
*/

//Thread class Methods
/*isAlive()
set-priority and get-priority
thread.sleep()
thread.current thread()
get id()
join()      //will halt the execution of ane thread until the other thread finish's its execution
setName()

class ThreadMethods extends Thread
{
    public void run()
    {
        System.out.println("i am a thread");
        System.out.println(Thread.currentThread()); //returns the currently executing thread

        if(Thread.currentThread().isDaemon()){//checking for daemon thread
            System.out.println("daemon thread work");
        }
        else
            System.out.println("user thread work");
    }


}
public class Multithreadingg {
    public static void main(String[] args) {
        ThreadMethods obj=new ThreadMethods(); //
        ThreadMethods obj2=new ThreadMethods();

//        System.out.println(obj.getId());       //get id method will id of thread
//        System.out.println(obj.isAlive());     //is alive method will return true if thread is active else false if its dead
        obj.setName("appleThread");    //set name method will set the name of a thread
//        System.out.println(obj.getName()); //will return the name of a thread
//        obj.setPriority(10); //through set Priority  method we can  set the priority from 1 to
//        System.out.println(obj.getPriority()); //will return the priority of a thread

//        System.out.println(Thread.currentThread()); //will return the currently executing thread

        //and through this method we can set priority, name etc to that thread like
//        Thread.currentThread().setPriority(5);
//        Thread.currentThread().getId();         //like this

        obj.setDaemon(true);   //a daemon thread is a low priority thread which  are useful
        // for background supporting tasks such as garbage collection,
        // releasing memory of unused objects and removing unwanted entries from the cache. Most of the JVM threads are daemon threads.
        obj.start();
        obj2.start();


    }
}*/


//join method over here
/*
When the join() method is invoked, the current thread stops its execution and the thread goes into the wait state. The current thread remains
 in the wait state until the thread on which the join() method is invoked has achieved its dead state.
 If interruption of the thread occurs, then it throws the InterruptedException.
 */
class joinExm extends Thread
{
    @Override
    public void run() {

        for (int i=0;i<20;i++)
        {
            System.out.println("i am run method's "+ i);
        }

    }
    void fun() throws InterruptedException {
        for (int i=0;i<20;i++)
        {
            if (i==5) {
                this.join(); //using join method here
            }
            else
                System.out.println("i am fun method's " + i);
        }
    }
}

public class Multithreadingg {
    public static void main(String[] args) throws InterruptedException {
        joinExm obj=new joinExm();
        obj.start();
        obj.fun();
    }
}