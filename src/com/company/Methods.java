//Methods are just like functions that perform some specific task, written in class's
package com.company;

public class Methods {

    int addition(int x, int y)        //this is a method
    {
        return x+y;
    }
    // Now if this method was static we don't need to create an object and then access it
    //we can do it without creating an object because the static is associated with class not with individual objects
    //for example
    static  int multiply(int x, int y) {       // static is associated with class that is same for all
        return x * y;
    }
    public static void main(String[] args) {

         Methods obj=new Methods();        // creating object
         int c=obj.addition(3,5);       // calling method
        System.out.println("Addition is:"+ c);

        int d=multiply(4,5); // calling static method without object that is directly
        System.out.println("multiplication is "+ d);


    }
}