// ALL ABOUT ABSTRACT CLASSES AND ABSTRACT METHODS
// ABSTRACT CLASSES ARE USED TO ACHEIVE ABSTRACTION THAT IS HIDING THE INTERNAL DETAILS
// WE CANNOT CREATE OBJECT OF AN ABSTRACT CLASS HOWEVER WE CAN INHERIT IT
// WE CAN HAVE ABSTRACT METHODS IN ABSTRACT CLASSES ONLY AND ALSO REGULAR METHODS AS WELL
// ABSTRACT METHODS CAN ONLY BE DECLEARED IN ABSTRACT CLASS THEN DEFINED IN INHERITED OR CHILD CLASSES (MUST)
package com.company;

abstract class Animal
{
    Animal() //abtract class can have constructors like regular classes
    {
        System.out.println("i am abstract constructor man");
    }
    abstract void sound();        //abstract method without a body
     void eat()             //  just a normal method
    {
        System.out.println("hay i am eating yoummy grass");
    }
}

class Horse extends Animal
{
    Horse()
    {
        System.out.println("i am Horse class constructor man");
    }

    public void sound()            // overriding abstract method and defining it here it very important to define every
            //abstract method of your super abstract class over here if you are not an abstract class
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
        Horse obj= new Horse();
        obj.eat();
        obj.doing();
        obj.sound();
    }
}
