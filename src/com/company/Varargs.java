//Varargs is a method that can accept arbitrary number of arguments and it treat those arguments as an array
package com.company;


public class Varargs {
    public int addition(int... arr)             //Vararg method these three dots tell compiler that this method is going to accept any
            // number of arguments so compiler implicitly treat arr as an array
    {
       int sum=0;
        for (int element: arr) {          //for each loop as used in arrays
            sum=sum+element;
        }
          return sum;
    }
    //we can also overload it by using additional parameters inside the varagrs method
//    public int addition(int x,int... arrr)   // using this way compiler gets confused about which method to call
//    {
//
//    }

    public static void main(String[] args) {

        Varargs obj=new Varargs();
        int c=obj.addition(4,4,3);
        int d=obj.addition(4,4,3,6);
        int e=obj.addition(4,4,3,7,8,9);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        //As a result we don't need to create different or overload methods inorder to add different numbers or any other things

    }
}
