package com.company.NetworkProgramming;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket server=new ServerSocket(888);   //ServerSocket class to create server socket(end point communication)
        //with its Port number on which its providing some service
        Socket socket=server.accept();     //socket will contain clients socket

        DataInputStream dis=new DataInputStream(socket.getInputStream());  //for reading data
        DataOutputStream dos=new DataOutputStream(socket.getOutputStream());  //for writing data

        Scanner scan=new Scanner(System.in);
        while (true)      //loop for infinite communication
        {

            System.out.println("Enter Message");
            String strr=scan.nextLine();
            dos.writeUTF(strr);
            String str=dis.readUTF();
            if(strr.equals("exit")||str.equals("exit"))
            {
                System.out.println("Connection Closed");
                dos.close();
                dis.close();
                break;
            }
            System.out.println(str);
        }

    }
}
