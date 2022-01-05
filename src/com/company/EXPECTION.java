package com.company;
// EXCEPTION IS AM UNWANTED OR UNEXPECTED EVENT WHICH OCCUR'S DURING THE EXECUTION OF PROGRAM THAT IS AT RUNTIME
// tru catch block to handle exceptions
public class EXPECTION {
    public void   dividee(int x)
    {
        try {
            int y = x / 0; // here i am dividding the value with zero which will create an arthematic exception
            System.out.println(y);
        }
        catch (ArithmeticException e)   // this catch will be inboked as arthematic exception will occur in try block
        {
            System.out.println( e);
        }
        catch (Exception e)    // catch is used to handle exception if any occur's within try block
        {
            System.out.println(e);
        }
        // we can use a finally block as well its optional and can only be one for a trycatch block
        finally {
            System.out.println("i am finally and ill be executed everytime no matter exception occer's or not");
        }
        System.out.println("end of method");


    }
    // throw and throw's keyword
    // throw is used to explicitly throw a single exception
    //throw's is used to declare the type of exception that might occur within the method
    public int excep() throws ArithmeticException  // indicating that within this method there might occur an arthematic exception
    // so you need to handle it
    {
      int res= 7/0;
      return res;
    }
    public int thro()
    {
        throw new ArithmeticException("truing to divide by zeero"); //throwing an exception using throw keyword
    }

    public static void main(String[] args) {

        EXPECTION obj= new EXPECTION();
        obj.dividee(4);
        try {
            obj.excep(); // as this method indicates us that a exception might occur in it so we need to use try over here
        }
        catch (Exception e) {
            System.out.println(" thankyou throws for indicating this exception " + e);
        }
        obj.thro();
    }
}
