package com.company;
// All about Static keyword
// The static keyword in Java is mainly used for memory management.
// The static keyword in Java is used to share the same variable or method of a given class.
// static is always 'assosiated' with class but not with instance of a class or object
/*applicable for the following:
        Blocks
        Variables
        Methods
        Classes**/
class LearningStaticKeyword
{
    //static variables
//    When a variable is declared as static, then a single
//    copy of the variable is created and shared among all objects at the class level.
//    We can create static variables at the class level only
    static int a=6;
    int y=8;  // simple non static data member



    // static blocks
//  static block is executed exactly once, when the class is first loaded.
    // if we create another object of this class then these static blocks will not be executed
    //it can also be used to initialize or access the static variables
    // we can have multiple static blocks executed in a order in which they are written
    static {
        System.out.println("hay man i am in static block ");
        a=8; // accessing static  variable
    }

    LearningStaticKeyword() // constructor of this class
    {
        System.out.println(" hay i am the constructor of this interesting class");
    }
     public void display() // simple member function
     {
         System.out.println(a);
     }
     //static Methods
    /*  Any static member can be accessed before any objects of its class are created
    , and without reference to any object. Methods declared as static have several restrictions:
They can only directly call other static methods.
They can only directly access static data.
They cannot refer to this or super in any way.*/

    static  void StaticMethod() // this is a static method can be called without the instance of this class
    {
        System.out.println(" hay i am the creaziest static method of this class :)");
        a++;
//        display();  doing this will throw an error saying"Non-static method 'display()' cannot be referenced from a static context

    }
// if we want to acess the non static members in a static method we can pass object of that class to it
    static void staticmethod2(LearningStaticKeyword obj)
    {
        // we can acess non staatic data member y with this obj passed to this static method
        System.out.println("Inside staitc method second trying to aceess non static data "+obj.y); // this way
    }

}
public class Staticcc {
    public static void main(String[] args) {
        LearningStaticKeyword obj= new LearningStaticKeyword();

        // how to call a static method
        LearningStaticKeyword.StaticMethod(); // without the object creation  of this class

        LearningStaticKeyword.staticmethod2(obj); // passing object the static method to acess its non static data


    }
}
