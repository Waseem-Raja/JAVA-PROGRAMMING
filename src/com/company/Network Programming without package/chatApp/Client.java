

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        Socket socket=new Socket("localHost",888);
        DataInputStream dis=new DataInputStream(socket.getInputStream());
        DataOutputStream dos=new DataOutputStream(socket.getOutputStream());

//        System.out.println(str);
        Scanner scan=new Scanner(System.in);
        while (true)
        {

            String str=dis.readUTF();
            if(str.equals("exit"))
            {
                dos.close();
                dis.close();
                break;
            }
            System.out.println(str);
            System.out.println("Enter Message");
            String strr=scan.nextLine();
            dos.writeUTF(strr);
            if(strr.equals("exit"))
            {
                dos.close();
                dis.close();
                break;
            }

        }

    }
}
