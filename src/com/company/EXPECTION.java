package com.company;
// EXCEPTION IS AM UNWANTED OR UNEXPECTED EVENT WHICH OCCURES DURING THE EXECUTION OF PROGRAM THAT IS AT RUNTIME
// try catch block is used to handle exceptions
class ExceptionExample {
    public void dividee(int x) {

        //Actually the object of a class is raised whenever an exception occur's
        //like when divide by zero exception occur's then arthematicException raised its object
        try { //code that may raise an exception is kept in try blobk
            int y = x / 0; // here i am dividding the value with zero which will rise an arthematic exception
            System.out.println(y);
        }
        //there can be no or multiple catch blocks after try block or just a finally blobk

        catch (ArithmeticException e)   // this catch will be invoked as arthematic exception will occur in try block
        {
            System.out.println(e);
        }
        //Exception class is the parent class of all the exceptions so it can hangle all exceptions using typecompatibility
        //no catch block can be written after Exception class
        catch (Exception e)    // catch is used to handle exception if any occur's within try block
        {
            System.out.println(e);
        }

        //finally blobk is an optional block and will be executed once no matter what
        // and can only be one for a try catch block
        //its actually used for cleanup activities like closing connection from the database etc
        finally {
            System.out.println("i am finally and ill be executed everytime no matter exception occer's or not");
        }
        System.out.println("end of method");


    }








    //throw's is used to declare the type of exception that might occur within the method
//    throws keyword can throw multiple exception but we need to catch them where we are invoking the method
//    throws is also useful when you have checked exception(compile time )
//    (an exception that must be handled) that you don't want to catch in your current method.
    public int excep() throws ArithmeticException  // indicating that within this method there might occur an arthematic exception
    // so you need to handle it
    {
        int res = 7 / 0;
        return res;
    }



    // throw  keyword
    // throw is used to explicitly throw a single exception
//    A throwable object is an instance of class Throwable or subclass of the Throwable class which is the root class of
    //the Exception class and error class
    //we can also use throw to throw a userdefined Exception by throwing the object of userdefined exception class's

    public void thro() {

        //we can also throw this exception using throws to handle it somewhere else instead of here
        try {
            throw new ArithmeticException("truing to divide by zeero"); //throwing an exception explicitly using throw keyword
        }
        catch (ArithmeticException e)
        {
            System.out.println("arthemeatic exception is handled over here ");
        }
    }

}
public class EXPECTION {
    public static void main(String[] args) {

        ExceptionExample obj= new ExceptionExample();
        obj.dividee(4);

        // // as the excep method indicates us that an exception might occur in it so we need to use try over here where we are calling
        //the method
        try {
            obj.excep();
        }
        //if throws throw multiple exceptions then we need to catch them up here for each exception therir should a catch block
        catch (Exception e) {
            System.out.println(" thankyou throws keyword  for indicating this exception  you r so kind" + e);
        }

        //example of throw keyword
        obj.thro();
    }
}



/*
exceptions can be categorized into two types:

Unchecked Exceptions: They are not checked at compile-time but at run-time.For example:
 ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, exceptions under Error class, etc.
Checked Exceptions:
They are checked at compile-time. For example, IOException, InterruptedException, etc.
 */