//Dynamic method dispatch or Runtime Polymorphism
// used to resolve call to an overriden method at runtime
//POLYMORPHISM OR DYNMAIC METHOD DISPATCH
package com.company;
class Bike
{
    public void on()
    {
        System.out.println("hay man i am just old bike");
    }
    public void show()
    {
        System.out.println("listen man please show up");
    }


}
class Duke extends Bike
{
    public void on()        //Overriden method
    {
//        super.on();   invoking superclass on method
        System.out.println("hay man i am brand new Duke");
    }
    void music()            // cannot be invoked shit life man
    {
        System.out.println("turn on the music babe :)");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // using reference of a class only its methds can be invoked
        Bike b = new Duke();  // upcasting using superclass reference variable and object af derived class
        b.on(); // here derived class overriden method will be called not of superclass
        b.show();  // invoke show method of superclass
//        b.music();   not allowed any other methods defined in derived class except overriden method cannot be invoked which is not
        // present in reference class
        // using upcasting mechanism or using b ovject
        // while every other function can be invoked in superclass
        // while to invoke superclass on method like in method overriding we can use super keyword

         Duke obj=new Duke();  // this one is simple inheritance it can have asscess to every method of its and inherited class
         obj.music();
         obj.on();
         obj.show();


    }
}
