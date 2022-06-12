package com.company;
//Inter-Thread Communication
//inter thread communication or cooperation is a communication of two or more threads with each other about acquiring and releasing the lock
//this can be done by following methods
//wait()
//notify()
//notifyall()
//all of theese methods should be used within a synchronized block or method because they all belock to the object class


//Now consider this program what could be the output of this program
//you might be thinking of 1000 as loop run 10 times but here what is happening two threads are running concurrently
//Main thread and the next one which we have create obj thread
//the main thread will execute the last statement which prints the total and by the time the obj thread will be still executing so
//the output will definitely not be correct
//so to overcome this situation we need to stop main thread until obj thread will complete its execution and then notify main thread to execute again
//for that look below the updated version of this program
class FindTotal extends Thread
{
    int total=0;
    public void run()
        {
            for (int i = 0; i < 10; i++)
                    total += 100;
        }

}
public class IntercommuniiThread {
    public static void main(String[] args) throws InterruptedException {

        FindTotal obj=new FindTotal();
        obj.start();
        System.out.println("total :" + obj.total);

    }
}


//Updated version



/*
class FindTotal extends Thread
{
    int total=0;


        public void run()
        {
            synchronized (this) {
                for (int i = 0; i < 10; i++)
                    total += 100;
//                this.notify();      //we can use notify or notify all method to awake up thread  in waiting state
                                     //the difference is notify all will awake all threads in waiting state and notify will awake only one thread
                this.notifyAll();
            }
        }

}
public class IntercommuniiThread {
    public static void main(String[] args) throws InterruptedException {

        FindTotal obj=new FindTotal();
        obj.start();
        synchronized (obj) {
            obj.wait();      //main goes to waiting state
            System.out.println("total :" + obj.total);
        }
    }
}

 */