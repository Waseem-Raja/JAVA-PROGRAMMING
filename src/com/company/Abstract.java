// ALL ABOUT ABSTRACT CLASSES AND ABSTRACT METHODS
// ABSTRACT CLASSES ARE USED TO ACHEIVE ABSTRACTION THAT IS HIDING THE INTERNAL DETAILS
// WE CANNOT CREATE OBJECT OF AN ABSTRACT CLASS HOWEVER WE CAN INHERIT IT AND ASLO CAN CREATE REFRENCE OF IT USING TYPECOMPACTIBILITY
// WE CAN HAVE ABSTRACT METHODS IN ABSTRACT CLASSES  AND ALSO REGULAR METHODS AS WELL
// ABSTRACT METHODS CAN ONLY BE DECLEARED IN ABSTRACT CLASS THEN DEFINED IN INHERITED OR CHILD CLASSES (MUST)
package com.company;

abstract class Animal
{
    Animal() //abtract class can have constructors like regular classes
    {
        System.out.println("i am abstract constructor man");
    }


    abstract void sound();        //abstract method without a body


     void eat()             //  can have also normal method
    {
        System.out.println("hay i am eating yoummy grass");
    }

    static  void Astaticmethod() // static method
    {
        System.out.println("i am the static method in an aabstract class");
    }

}

class Horse extends Animal       //if derived class is also an abstract then its not mendatory to define abstract methdos of super class in it
{
    Horse()
    {
        System.out.println("i am Horse class constructor man");
    }

    public void sound()            // overriding abstract method and defining it here its cumpulsory to define every
            //abstract method of your super abstract class over here if it is   not an abstract class
    {
        System.out.println("eneeeeehaaaaaaaa");
    }
    public void doing()
    {
        System.out.println(" tadak tadak tadak :)");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Horse obj = new Horse();
        obj.eat();
        obj.doing();
        obj.sound();

        Animal.Astaticmethod(); // using the name of class and the static methods name we can invoke it drirectly without creation of an object

        //we can also create reference of abstract calass using typecompactibility
        Animal ref = new Horse();   //this is typecompactibilty(we can store object of derived class in reference of its immediate parent class)
//        using ref object we can invoke all the methods including inherited or overriden but not any newwly defined methd in derived class

        ref.eat();
        ref.sound();
//        ref.doing() this is not allowed over here as its a newly defined method in derived class
    }

}
/*
Key Points to Remember
We use the abstract keyword to create abstract classes and methods.
An abstract method doesn't have any implementation (method body) in am abstract class.
A class containing abstract methods should also be abstract.
We cannot create objects of an abstract class.
To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
We can access the static attributes and methods of an abstract class using the reference of the abstract class. For example,  Animal.Astaticmethod();
we can also create reference of an abstract class using typecompactibiliy
 */