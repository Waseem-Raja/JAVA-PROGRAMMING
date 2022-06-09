
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class Serverff {

    public static String Cypherencryption(String str)
    {
        String ciphertext="";
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        int key=4;

        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                ciphertext+=' ';
            else {

                for (int j = 0; j < alphabet.length(); j++) {
                    if (str.charAt(i) == alphabet.charAt(j)) {
                        int k = (j + key) % 26;
                        ciphertext += alphabet.charAt(k);
                        break;
                    }

                }
            }

        }

        return ciphertext;
    }
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(888);   //ServerSocket class to create server socket(end point communication)
        //with its Port number on which its providing some service
        Socket socket=server.accept();     //socket will contain clients socket
        System.out.println("Server started");
        DataInputStream dis=new DataInputStream(socket.getInputStream());  //for reading data
        DataOutputStream dos=new DataOutputStream(socket.getOutputStream());  //for writing data

        String CipherText="";
        String str1,str2;
        String plaintext="";
        while(true) {
             str1 = dis.readUTF();  //reading the clients data
            plaintext+=str1;
             str2=str1.toLowerCase();//converting all incoming data to lower case
            if(str2.equals("exit"))     //condition to come out of loop when client finishes sending data
                break;
            CipherText += Cypherencryption(str2);//passing to the Encryption method for encrypting  the data
            CipherText+=" ";  //after each line of data adding space
        }
        System.out.println("PLAINTEXT :"+ plaintext);
        dos.writeUTF(CipherText);   //transferring data(cipher-text) to client
        dos.close();
        dis.close();
        socket.close();
    }
}
