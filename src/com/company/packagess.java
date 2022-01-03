// ALL ABOUT PACKAGES HERE
// AS I HAVE CREATED A PACKAGE NAMELY PROJECTS.JAVA AND IN IT I HAVE CREATED TWO CLASSE'S WITH PUBLIC ACESS MODIFIERS
//SO THAT THEY CAN BE ACCESSIBLE OUTSIDE THE PACKAGE AS WELL
// packages are fun to use and very usefull when it comes to naming conflicts like there can be two classes with same name
// in two packages
//helps in acheiving Encapsulation
//package name and directory structure  are closely related
package com.company;
import  Projects.Java.subpackage.subpackages;   // importing subpackage created within projects.java
import Projects.Java.Multiplication;   // Multiplication class defined in project.java package
import Projects.Java.addition;
public class packagess  {
    public static void main(String[] args) {
        Multiplication obj = new Multiplication();
        System.out.println(obj.Multiplicationnn(3, 4, 5, 5));
        addition obj2 = new addition();
        System.out.println(obj2.add(4, 4, 4));
        // can i have access to the subpackge if i import it over here lets c?
        subpackages obj3 =new subpackages();
        obj3.display();    // oh yes we have to explicityly import subpackeges cause these are not imported by default
    }
}


// i can use any other class, interface over here defined in whatever package by just importing it.
class package2 implements a  // this a interface is defined in com.company package that i am usisng rt now

{
    @Override
    public void hello() {
        System.out.println(" i am an interface and defined within this package ");
    }
}