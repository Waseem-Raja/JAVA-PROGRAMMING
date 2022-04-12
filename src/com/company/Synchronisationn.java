/*
When we start two or more threads within a program, there may be a situation when multiple threads try
to access the same resource, and finally they can produce unforeseen result due to concurrency issues.
For example, if multiple threads try to write within a same file then they may corrupt the data because one of the threads can
override data or while one thread is opening the same file at the same time another thread might be closing the same file.
So there is a need to synchronize the action of multiple threads and make sure that only one thread can access the
resource at a given point in time. This is implemented using a concept called monitors. Each object in Java is associated with a monitor,
 which a thread can lock or unlock. Only one thread at a time may hold a lock on a monitor.
Java programming language provides a very handy way of creating threads and synchronizing their task by using synchronized blocks,methods.
You keep shared resources within this block. Following is the general form of the synchronized statement −
 */
package com.company;
class ticketBooking extends Thread {

    int availableTickets;

    ticketBooking() {
        availableTickets= 20;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            ticketBooking();
        }
    }

    synchronized void ticketBooking() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is booking ticket number " + availableTickets);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " has completed booking for ticket number " + availableTickets);
        availableTickets--;
    }


}
public class Synchronisationn {

    public static void main(String[] args) {
        ticketBooking obj=new ticketBooking();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("One");
        t2.setName("Two");
        t1.start();
        t2.start();

        //note
        //if we invoke any un synchronised method within the synchronised method then monitor will release the lock
        // of that thread and any other thread will execute that synchronised method and if we invoke any other synchronised
        //method then monitor will maintain the lock
    }
}
/*
Java Synchronized Method
If we use the Synchronized keywords in any method then that method is Synchronized Method.
It is used to lock an object for any shared resources.
The object gets the lock when the synchronized method is called.
The lock won’t be released until the thread completes its function.

Synchronized Block
Suppose you don’t want to synchronize the entire method, you want to synchronize few lines of code in the method,
then a synchronized block helps to synchronize those few lines of code. It will take the object as a parameter.
 It will work the same as Synchronized Method. In the case of synchronized method
lock accessed is on the method but in the case of synchronized block lock accessed is on the object.


Static Synchronization
In java, every object has a single lock (monitor) associated with it.
The thread which is entering into synchronized method or synchronized block will get that lock, all other threads which are
 remaining to use the shared resources have to wait for the completion of the first thread and release of the lock.
Suppose in the case of where we have more than one object, in this case, two separate threads will acquire the locks
 and enter into a synchronized block or synchronized method with a separate lock for each object at the same time.
 To avoid this, we will use static synchronization.
In this, we will place synchronized keywords before the static method. In static synchronization,
lock access is on the class not on object and Method.
 */

/*
Inter – Thread Communication
Inter – Thread communication or cooperation is a communication
 of two or more threads with each other. It can be done by using the following methods.

wait() //is not synchronized
notify()
notifyAll()
Why we need Inter – Thread Communication?

There is a situation on the thread that keeps on checking some conditions repeatedly, once that condition satisfies
thread moves with the appropriate action. This situation is known as polling.
This is a wastage of CPU time, to reduce the wastage of CPU time due to polling, java uses Inter – Thread Communication Mechanism.
wait(), notify(), notifyAll() methods must be called within a synchronized method or
block otherwise program will compile but when you run it, it will throw illegal monitor State Exception.


wait () Method
It causes the current thread to place itself into the waiting stage until another thread invokes
the, notify() method or notifyAll() method for this object.

notify () Method
This method wakes up a single thread called wait () on the same object. If there is more
than one thread that is waiting on this same object, then any one of them arbitrarily chosen to be awakened.
 Here awakened thread will not able to proceed until the current thread release lock. If any threads
  are trying to get the lock on this object then the awakened thread will also compete with them in the usual manner.

notify All() Method
Rather than a single thread, it will wake up all the threads waiting on this object monitor.
 The awakened thread will not able to proceed until the current thread releases the lock. Again,
 these awakened threads need to compete with all other threads which are trying to get the lock on this object.
 */