//Dynamic method dispatch or Runtime Polymorphism
// used to resolve call to an overriden method at runtime
//DYNAMIC METHOD DISPATCH OR RUNTIME POLYMORPHISM OR TYPE COMPACTIBILITY
// WHEN A PARENT CLASS REFRENCE VARIABLE HOLDS OR REFRENCES TO THE OBJECT OF THE CHILD CLASS
// THEN ALL PARENTS CLASS METHODS AND ALL OVERRIDEN METHODS IN CHILD CLASS CAN BE INVOKED USING PARENTS REFRENCE VARIABLE
// BUT ANY NEWLY DEFINED METHOD IN CHILD CLASS CAN NOT BE INVOKED
//TYPE COMPACTIBILITY IN SINGLE INHERITANCE
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
        super.on();   //invoking superclass on method
        System.out.println("hay man i am brand new Duke");
    }
    void music()            // cannot be invoked shit life man
    {
        System.out.println("turn on the music babe :)");
    }

}
public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // using reference of a class only its methods can be invoked as well as overridden methods of in child class
//        Refrence variable used should always be of superclass
        Bike b = new Duke();  // upcasting using superclass reference variable and object af derived class
        b.on(); // here derived class overridden method will be called not of superclass
        b.show();  // invoke show method of superclass
//        b.music();   not allowed any other methods defined in derived class except overridden method cannot be invoked which is not
        // present in reference class
        // using upcasting mechanism or using b object
        // while every other function can be invoked in superclass
        // while to invoke superclass on method like in method overriding we can use super keyword

//         Duke obj=new Duke();  // this one is simple inheritance it can have asscess to every method of its and inherited class
//         obj.music();
//         obj.on();
//         obj.show();



 //TPE- 'COVERTIBILITY'
        // NOW IF I TRY TO ASSIGN REFRENCE OF A TO THE CHILD CLASS REFRENCE VARIABLE ITS NOT ALLOWED

//        Duke obj= b         like this its not allowed we have to explicitly tell compiler who's object is this
         Duke obj2= (Duke) b;        // this is known as type convertibility

    }
}


// TYPE COMPACTIBILITY'  IN MULTI LEVEL  INHERITANCE
