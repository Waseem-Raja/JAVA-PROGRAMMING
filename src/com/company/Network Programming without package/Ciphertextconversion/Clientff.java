
//reading a file  and transfarring the data to the server for encryption
import java.io.*;
import java.net.Socket;

public class Clientff {
    public static void main(String[] args) throws IOException {

        FileReader obj = new FileReader("F:\\Projects\\Java\\JAVA-PROGRAMMING\\src\\com\\company\\test.txt");
        BufferedReader br = new BufferedReader(obj);

        Socket socket=new Socket("localHost",888); //Socket class to create client side socket(end point communication)
        //with destinations ip address and port no. (i am using my machine for both so localHost)
        DataInputStream dis=new DataInputStream(socket.getInputStream());   //for reading purpose
        DataOutputStream dos=new DataOutputStream(socket.getOutputStream()); //for writing purpose

        String data;
        while ((data = br.readLine()) != null) {     //reading the file with one line at time using buffer classes method readLine()

            dos.writeUTF(data);
        }
        dos.writeUTF("exit"); //after finishing the file reading just letting server paji know when to stop
        String cipherText= dis.readUTF();
        System.out.println("Cipher text :"+ cipherText);
        System.out.println("connection closed");
        dos.close();
        dis.close();
        socket.close();
    }
}
