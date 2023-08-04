/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogrammingdemo;
import java.net.*;
import java.io.*;
import java.util.*;
public class serverrevno {
      public static void main(String[] args) throws Exception
    {
    
     ServerSocket ss=new ServerSocket(45); //request ne accept karva object banavo 
        
        Socket s=ss.accept();
        
        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        
        int s1=dis.readInt();
        int rem=0;
        int ans=0;
        
        while(s1!=0)
        {
            rem=s1%10;
            ans=(ans*10)+rem;
            s1=s1/10;
        }
        
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        
        dos.writeInt(ans);
        
       
        dis.close();
        is.close();
        s.close();
        
    }
}
