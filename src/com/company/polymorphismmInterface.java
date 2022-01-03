// POLYMORPHISM IN INTERFACE IS A VERY GOOD THING

        package com.company;
interface A
{
    void camera();
}
interface B
{
    void  message();
}
class phone implements A,B
{
    public void camera()
    {
        System.out.println(" i am camera i take beautifull photos ");
    }
    public void message()
    {
        System.out.println(" wanna message ");
    }
}

public class polymorphismmInterface {
    public static void main(String[] args) {
        // polymorphism using reference of interface's
        A obj=new phone(); // here reference of interface A and object of phone is created
        obj.camera();
//        obj.message(); this is not allowed the reference of interface used only its methods can be invoked using its object

        B obj2=new phone();
        obj2.message();
//        obj2.camera() not allowed as its present in interface two and we are using reference of interface B
    }
}
// like in short if you want to open camera would want an option of message with it no for what
// if you want open message you will just o
