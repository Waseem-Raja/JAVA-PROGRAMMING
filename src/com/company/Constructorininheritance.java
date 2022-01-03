//CONTRUCTORS IN JAVA
package com.company;
class Constructors
{
    int x;
    Constructors()      //first this constructor will be called
    {
        System.out.println("i am super class constructore");
    }
    Constructors(int y)       // a parameterixed constructor (constructor ovverloading)
    {
        this.x=y;
        System.out.println("wohoo um parameterised constructor of super class with value" + x);
    }
}
class Deroved extends Constructors
{
//    Deroved() // this will be called after super class constructor by default
//    {
//        super(4);// with super we can call any parameterised constructor of super class and that will be invoked first then
//        // this derived class's constructor
//        System.out.println("hay dude i am Derived class constructor");
//    }
    Deroved(int x, int y) // by default this will invoke base class's default constructor
    {
        System.out.println("hay man its Derived class's parameterised constructor"+ x+y);
    }
}

public class Constructorininheritance {
    public static void main(String[] args) {

        Deroved obj= new Deroved(2,6);
//        Deroved obj= new Deroved();
    }
}
//  call to the derived class's constructor weather its parameterised or default it will invoke first default  constructor of
// base class .
//if we want to call parameterised constructor of super class then we can use super keyword to do that in any of derived class's
//constructor weather its default or parameterised