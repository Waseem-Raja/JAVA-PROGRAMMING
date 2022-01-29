//ALL ABOUT NESTED CLASSES IN JAVA
// NESTED CLASSES ARE THOSE CLASSES THAT ARE DEFINED WITHIN ANOTHER CLASS
// There are two types of nested classes you can create in Java.
// FIRST ONE IS NON STATIC INNER CLASS AND SECOND ONE IS STATIC NESTED CLASS
//ALL ABOUT NESTED CLASSES
package com.company;

 class OuterClass {
    public void display() {
        System.out.println("hello i am outer class");
    }
    int count =0;

    static class innerclass { // this is the nested static class

        public void displayy() {
            System.out.println(" i am  static nested class");
        }
        //Unlike non static inner class, a static nested class cannot access the member variables of the outer class.
        // It is because the static nested class doesn't require you to create an instance of the outer class.

    }

     class  Nonstaticinnnerclass     // this is the non static class
     {
         public void  hay()
         {
             System.out.println(" i am the non static member funtion of non static inner class");
         }
//         we can also access the memebers of outer classs using this keyword and outerclass name
         // but this can only be used in nonstatic nested class not in static class


     }

    public void initiate() {
        innerclass in = new innerclass(); // we can create an object of an static or non static inner class within an
        // enclosing or outerclass's member function
        in.displayy();
        Nonstaticinnnerclass objj= new Nonstaticinnnerclass(); // creating object of a non static class within the member function of
        // of an outer or enclosing class
        objj.hay();
    }
    public void show()  // we can also create a local class within a member function of outer class
    {                   // but it can  be accessed within this member function
        int c=0;
        class LocalClass
        {
            public void disp()
            {
                System.out.println("hello i am the local class within the memever function of outer class");
            }
        }
        LocalClass objjj= new LocalClass(); // Creating the object of Local class within the member function in which it is created
        objjj.disp();
    }

}
public class NestedClasses
{

    public static void main(String[] args) {
        OuterClass outer= new OuterClass();  // Outer class
        outer.initiate();
//        innerclass obje= new innerclass();    // not permitted
//        obje.displayy();

        // Now to access the Non static class
        // we must initantiate the enclosing class first in order to instantiate the inner non static class
        OuterClass.Nonstaticinnnerclass objj= outer.new Nonstaticinnnerclass();
        objj.hay();
        // Now how to access the static class
        // here we don't require to create an instance of the outer class to instantiate the static class
        OuterClass.innerclass obj2= new OuterClass.innerclass();
        obj2.displayy();
    }
}
/* Key Points to Remember
Java treats the inner class as a regular member of a class. They are just like methods and variables declared inside a class.
Since inner classes are members of the outer class, you can apply any access modifiers like private, protected to your inner class which is not possible in normal classes.
Since the nested class is a member of its enclosing outer class, you can use the dot (.) notation to access the nested class and its members.
Using the nested class will make your code more readable and provide better encapsulation.
Non-static nested classes (inner classes) have access to other members of the outer/enclosing class, even if they are declared private. */
