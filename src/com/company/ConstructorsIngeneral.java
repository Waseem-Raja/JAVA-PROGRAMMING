package com.company;
//CONSTRUCTORS IN JAVA
//CONSTRUCTOR IS A MEMBER FUNCTION OF A CLASS  WITH THE SAME NAME OF THAT CLASS
class ConstructorInJava
{
    int a, b;
    int c=9; //  initializations like these statements acts as the first statements of a constructor
    ConstructorInJava() // this is the default constructor invoked when the object of this class is created
                            // we can't call it directly anywhere in the program its called implicitly at the time of object creation
    {
        System.out.println("hello i am defalutConstrucot of this useless class :)");
    }
    // we can have multiple constructors in our program (Constructor Overloading)
    ConstructorInJava(int v, int u) // this is a Parameterised Constructor
    {
        this.a=v;
        this.b=u;
    }
    //we can have a member function with the same name as the constructor but it should have a return type
    // so that compiler will differentiate it with the original constructor
    public  void ConstructorInJava()
    {
        System.out.println("i am the great but useless member function with same name as  constructor");
    }
    // copy constructor
    // this constructor is not automatically created by the compiler if we want it we have to create it explicitlly
    // it recives argument as object of that class
    ConstructorInJava( ConstructorInJava objj)
    {
        this.a=objj.a;
        this.b=objj.b;
    }
    //Constructor can also be set as private
//    Once a constructor is declared private, it cannot be accessed from outside the class.
//    So, creating objects from outside the class is prohibited using the private constructor.
   public void display()
   {
       System.out.println("value of a: "+a+ " value of b: "+b);
   }
}
public class ConstructorsIngeneral {
    public static void main(String[] args) {
                 ConstructorInJava obj= new ConstructorInJava(); // here at this time the dafault constructor will be invoked
        ConstructorInJava obj2= new ConstructorInJava(3,4);// this will invoke parameterised constructor
        obj2.display();
        ConstructorInJava obj3= new ConstructorInJava(obj2);// this will invoke copy constructor
        obj3.display();
    }
}
/* Important Notes on Java Constructors
Constructors are invoked implicitly when you instantiate objects.
The two rules for creating a constructor are:
The name of the constructor should be the same as the class.
A Java constructor must not have a return type.
If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time.
The default constructor initializes instance variables with default values. For example, the int variable will be initialized to 0
Constructor types:
No-Arg Constructor - a constructor that does not accept any arguments
Parameterized constructor - a constructor that accepts arguments
Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.
A constructor cannot be abstract or static or final.
A constructor can be overloaded but can not be overridden.*/