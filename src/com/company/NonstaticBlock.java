//NON STATIC BLOCK'S IN JAVA
class nonstaticexample
{
    int x;
    nonstaticexample() {
        System.out.println("i am an ordinary small constructor");

    }

    //this is a non-static block 1
    {
        System.out.println("i am a non static block baby");
        this.x=9; // i can use it for initialization as well
    }
    //non-static block 2
    {
        System.out.println("the value of x is "+this.x);
    }
}
public class NonstaticBlock {
    public static void main(String[] args) {
        nonstaticexample obj= new nonstaticexample();

    }
}
/*
Whenever an object is created, a non-static block will be executed before the execution of the constructor.
Non-Static Blocks
The Non-static blocks are class level blocks which do not have any prototype.
The need for a non-static block is to execute any logic whenever an object is created irrespective of the constructor.
The Non-static blocks are automatically called by the JVM for every object creation in the java stack area.
We can create any number of Non-static blocks in Java.
The order of execution of non-static blocks is an order as they are defined.
 */