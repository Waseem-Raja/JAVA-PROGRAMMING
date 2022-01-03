package com.company;
class Base         // this is Base ckass
{

    public void display()
    {
        System.out.println("hello this base class or superclass blah blah");
    }
}
class Child extends Base      // this is child class
{
    public int addition(int x, int y)
    {
        return x+y;

    }

}

public class Inheritance {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.display();
        System.out.println(obj.addition(4,3));

    }
}
