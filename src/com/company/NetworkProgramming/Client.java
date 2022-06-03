package com.company.NetworkProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;          //java.io.net package contains all stuff related to network programming 
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket=new Socket("localHost",888); //Socket class to create client side socket(end point communication)
        //with destinations ip address and port no. (i am using my machine for both so localHost)
        DataInputStream dis=new DataInputStream(socket.getInputStream());   //for reading purpose
        DataOutputStream dos=new DataOutputStream(socket.getOutputStream()); //for writing purpose

//        System.out.println(str);
        Scanner scan=new Scanner(System.in);
        while (true)     //loop for infinite conversation
        {

            String str=dis.readUTF();     //reading the data comming from the server
            if(str.equals("exit"))
            {
                System.out.println("Connection Closed");
                dos.close();
                dis.close();
                break;
            }
            System.out.println(str);
            System.out.println("Enter Message");
            String strr=scan.nextLine();
            dos.writeUTF(strr);      //writing the data to the server
            if(strr.equals("exit"))
            {
                System.out.println("Connection Closed");
                dos.close();
                dis.close();
                break;
            }

        }

    }
}
