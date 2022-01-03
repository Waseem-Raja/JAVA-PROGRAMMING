// All about interfaces : its a fully abstract class which includes a group of abstract methods
// through interface we can acheive abstraction
// we cannnot create objects of interface but a class can implement it using implement keyword
//ALL ABOUT INTERFACE'S
package com.company;
interface car        // its an interface
{
     void color(String colorr);    // abstract methods
     void type(String typee);

//     void wheels(int x)     like in abstract class where we can have regular methods within the abstract class
//     {} // but over here in interface we cannot have regular methods all methods should be  abstract that is without body
}
interface Bike2
{
    void display();
}
// all defined methods in implemented class should be public
// and data fields defined in interfaces can't be modified in implemented class but can be acessed
//class lambergini implements car        // a class can implement an interface using implements keyword
//{
//    public void color(String colorrr) // overrriden methods that should be defined in a class which implements an interface
// where these methods belong
//    {
//        System.out.println(" color  :"+ colorrr);
//    }
//   public void type(String typeee)
//    {
//        System.out.println("its a lambergini man com on");
//    }
//
//}
class dukee implements car, Bike2    // its allowed to a class to implement multiple interfaces  while in abstract class
    // we cannot extend multiple classes that is not allowed (multiple inheritance)
{
    public void color(String colorrr)
    {
        System.out.println(" color  :"+ colorrr);
    }
   public void type(String typeee)
    {
        System.out.println("its a lambergini man com on");
    }
    public void display()
    {
        System.out.println(" i am  a super duper bike");
    }


}
// You know what ? what man... Two interfaces can extend each other even multiple interface can be extended
// example
interface a      // interface one
{
    void hello();

}
interface b extends a{   // interface two inherits interface two
    void whatsup();
}
class c implements b    // class is implementing interface two
{
    public void hello()
    {
        System.out.println(" hello i belong to the interface one");
    }
    public void whatsup()
    {
        System.out.println(" hello i belong to the interface two");
    }
}
 class y extends c implements b{ // a class can extend a class and implement an interface at the same time

 }
 //we can default methods as well in interface that just work like regular methods
// they are defined in interfaces
// static method can also be defined in an interface just like a regular metod with body
//ww can have private methods as well in an interface but they can't be used by any class if its implementing that interface
// as well
interface defaultoverview
 {
//     private void privatemethod()
//     {}

     static void show() // static method
     {
         System.out.println(" i am static and i am proud of that ");
     }
     void sayhello(); //abstract method
     default void display() // default method
     {
         System.out.println("hello i am craxy default method of this interface");
     }
 }
 class xy implements defaultoverview
 {
     @Override
     public void sayhello() {
         System.out.println("i am declered in interface and defined over here i wanna go home oh my interface");
     }
     // we can override the default method over here also
     public void display()    // this will be called when called object of this method
     {
         System.out.println("hello my twin overriden default method no way");
     }

 }

public class Interface {
    public static void main(String[] args) {

//        lambergini obj= new lambergini();
//        obj.color("black");
//        obj.type("LAMBERGINI");
//        dukee obj = new dukee();
//        obj.color("black");
//        obj.type("LAMBERGINI");
//        obj.display();
        xy obj=new xy();
        obj.sayhello();   // will invoke class's defined method
        obj.display();  // will invoke interface default method if not overriden in class else it will invoke that
        // overriden default method in implemented class
        defaultoverview.show();// that is how to call a static method which is present in an interface
        // interface name and then the method name
    }
}