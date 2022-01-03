// when same method is defined in subclass like both having same name return type and parameter list then
// we say its method overriding
// Runtime polymorphism
package com.company;
class Parent
{
    public void Animal()
    {
        System.out.println(" hay dude i am in parent class ");
    }
}
class Derived extends Parent {

    public void  Animal()       // this method is overridden
    {
        super.Animal();  // using super we can invoke same method in super class
        System.out.println(" hay dude i am in child class ");
    }
}
public class MethodOveriding {
    public static void main(String[] args) {

          Derived obj= new Derived();
          obj.Animal();

    }
}
// if method in superclass is having public or protected we can have same method with  public or protected  access modifier in child class
//but not private
// now if we want to call super class method we can make use of super keyword in subclass