package com.company;
import java.io.*;       //java.io package contains all stuff related files so we need to import it before using files
/*
To read data from the file, we can use subclasses of either InputStream or Reader.

The Reader class-
of the java.io package is an abstract superclass that represents a stream of characters.
Since Reader is an abstract class, it is not useful by itself. However, its subclasses can be used to read data.
Subclasses of Reader
In order to use the functionality of Reader, we can use its subclasses. Some of them are:
BufferedReader     //It extends the abstract class Reader.
InputStreamReader
FileReader     //It extends the InputSreamReader class.
StringReader



The InputStream clas-
s of the java.io package is an abstract superclass that represents an input stream of bytes.
Since InputStream is an abstract class, it is not useful by itself. However, its subclasses can be used to read data.
Subclasses of InputStream
In order to use the functionality of InputStream, we can use its subclasses. Some of them are:
FileInputStream
ByteArrayInputStream
ObjectInputStream


The Writer class-
 of the java.io package is an abstract superclass that represents a stream of characters.
Since Writer is an abstract class, it is not useful by itself. However, its subclasses can be used to write data.
Subclasses of Writer
In order to use the functionality of the Writer, we can use its subclasses. Some of them are:
BufferedWriter
OutputStreamWriter
FileWriter
StringWriter

 */


public class Files {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Reading from files using fileReader class

        FileReader obj = new FileReader("F:\\Projects\\Java\\JAVA-PROGRAMMING\\src\\com\\company\\test.txt");     //throws an Exception (FileNotFoundException)
//        int data;
//        data=obj.read();       //reads a character that is one byte at a time and also throws an exception (IOException)
//        System.out.println((char)data);
//
//        //reading whole file character by character
//        //while ((data=obj.read())!=-1)  //end of the file is -1
////        {
////            System.out.print((char)data);
////        }
//
//
//
//        //reading at chunk of characters from the file
//        int x;
//        int hell=0;
//        char arr[]=new char[50];
//
//        while ((x=obj.read(arr))!=-1)      //x will contain number of characters read successfully else if end of the file then -1
//        {
//
//            String str=new String(arr,0,x);     //0 indicates index of array and x number of characters
//            System.out.print(str);
//            ++hell;
//        }
//        System.out.print("number of iterations :"+ hell);
//        obj.close();
//    }
//


        //writing into the file using FileWriter class

        FileWriter writer = new FileWriter("F:\\Projects\\Java\\JAVA-PROGRAMMING\\src\\com\\company\\test2.txt");  //FileWriter class to write into a file
//        BufferedReader br = new BufferedReader(obj);
//        String data, upper;
//
//        while ((data = br.readLine()) != null) {     //reading the file with one line at time using buffer classes method readLine()
//
//            upper = data.toUpperCase();
//
//            upper = upper.replace('A', 'Z');     //replacing A with z using replace(old,new) function of String class
//
//
//            writer.write(upper);            //writing into the another file
//            writer.write("\n");

//
//        }
//




        //without buffer-reader class
        int x;
        char arr[]=new char[50];

        while ((x=obj.read(arr))!=-1)       //reading the file with 50 character's at a time
            //x will contain number of characters read successfully else if end of the file then -1
        {

            String str=new String(arr,0,x);     //0 indicates index of array and x number of characters
            writer.write(str);         //writing on another file

        }
        obj.close();
        writer.close();

//        br.close();



    }
}


