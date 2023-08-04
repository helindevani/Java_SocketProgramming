package socketprogrammingdemo;


import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception
    {
        Socket s=new Socket("localhost",77);
        
        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String s1="hii";
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeUTF(s1);
        
        String a=dis.readUTF();
        System.out.println(a);
        os.close();
        dos.close();
        dis.close();
        is.close();
            s.close();
   }
}
