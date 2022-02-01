package com.company;
//ARRAY OF OBJECTS IN JAVA
/*When we require a single object to store in our program we do it with a variable of type Object.
 But when we deal with numerous objects, then it is preferred to use an Array of Objects.
 */
class Student  // a simple class with student details
{
    String name;
    int rollNo;
    Student(String n, int r) // simple constructor to initialise the data members
    {
        this.name= n;
        this.rollNo=r;
    }
    public void display() // display method
    {
        System.out.println("Student name is: " + this.name + " "
                + "and Student Roll No is: "
                + this.rollNo);
        System.out.println();
    }
}
public class ArrayOfObjects {
    public static void main(String[] args) {
//declaring and instantiate an array of Student objects with three objects/object references then it will be written as:
        //classname[] reference variable= new classname[size]
        Student[] s1= new Student[3];
        /*
        And once an array of objects is instantiated like this,
        then the individual elements of the array of objects needs to be created using the new keyword.
         */
        s1[0] = new Student("waseem", 161544);  // Initializing the first element of the array
        s1[1] = new Student(" Prasad", 161545); // the second one
        s1[2] = new Student("rayess",161546);   // the third one

        // now how to display them?
        s1[0].display();
        s1[1].display();
        s1[2].display();
    }
}
/*
* The array of Objects the name itself suggests that it stores an array of objects.
* Unlike the traditional array stores values like String, integer, Boolean, etc
* an Array of Objects stores objects that mean objects are stored as elements of an array.
* Note that when we say Array of Objects it is not the object itself that is stored in the array but the reference of the object is stored.*/
