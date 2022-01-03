//Method Overloading that is having two or more same methods with same name but differ in parameters
//return types can be different cause it is not associated with return types
package com.company;

public class MethodOverloading {

    int add(int a, int b)      //method with two parameters
    {
        return a+b;
    }
    int add(int a, int b , int c)        //method with three parameters having same name as upper method
    {
        return a+b+c;
    }
    public static void main(String[] args) {

        MethodOverloading obj=new MethodOverloading();
        int c=obj.add(3,5);
        int d= obj.add(5,6,4);
        System.out.println("Addition of first method with two parameters"+ c);
        System.out.println("Addition of first method with two parameters"+ d);

    }
}
