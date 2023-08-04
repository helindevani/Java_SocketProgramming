package socketprogrammingdemo;

import java.net.*;
import java.io.*;
import java.util.*;

public class Server {
     public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(77); //request ne accept karva object banavo 
        
        Socket s=ss.accept();
        Random r=new Random();
        
        int rn=r.nextInt();
        
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        
        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        
        String s2=dis.readUTF();
        System.out.println(s2);
        
        dos.writeUTF("hello");
        
        dis.close();
        is.close();
        
        dos.close();
        os.close();
        s.close();
   }
}
