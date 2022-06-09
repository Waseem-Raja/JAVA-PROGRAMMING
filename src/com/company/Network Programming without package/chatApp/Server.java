

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket server=new ServerSocket(888);
        Socket socket=server.accept();     //socket will contain clients socket

        DataInputStream dis=new DataInputStream(socket.getInputStream());
        DataOutputStream dos=new DataOutputStream(socket.getOutputStream());

        Scanner scan=new Scanner(System.in);
        while (true)
        {

            System.out.println("Enter Message");
            String strr=scan.nextLine();
            dos.writeUTF(strr);
            String str=dis.readUTF();
            if(strr.equals("exit")||str.equals("exit"))
            {
                dos.close();
                dis.close();
                break;
            }
            System.out.println(str);
        }

    }
}
