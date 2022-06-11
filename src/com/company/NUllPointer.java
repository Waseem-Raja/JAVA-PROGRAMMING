package com.company;
//About NUll-Pointer Exception
/*
NullPointerException is a RuntimeException. In Java, a special null value can be assigned to an object reference.
 NullPointerException is thrown when program attempts to use an object reference that has the null value.
        These can be:
        Invoking a method from a null object.
        Accessing or modifying a null object’s field.
        Taking the length of null, as if it were an array.
        Accessing or modifying the slots of null object, as if it were an array.
        Throwing null, as if it were a Throwable value.
        When you try to synchronize over a null object.
*/


public class NUllPointer {
    public void hello(String abc)
    {
        System.out.println(abc.equals("hello")); //null pointer exception
    }

    public static void main(String[] args) {

        //example one
//        Boolean val=null;
//        if(val)                 //Null pointer Exception
//            System.out.println("null value");

        //example two
//        NUllPointer obj=null;
//        obj.hello();   //null pointer exception

        //example three
        NUllPointer obj=new NUllPointer();
        obj.hello(null);
    }
}
