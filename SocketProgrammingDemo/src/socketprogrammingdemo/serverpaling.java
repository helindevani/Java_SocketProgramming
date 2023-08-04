/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogrammingdemo;

import java.net.*;
import java.io.*;
import java.util.*;
public class serverpaling {
       public static void main(String[] args) throws Exception
    {
    
     ServerSocket ss=new ServerSocket(45); //request ne accept karva object banavo 
        
        Socket s=ss.accept();
        
        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        
        String s1=dis.readUTF();
        
        StringBuffer sb=new StringBuffer(s1);
        String Ans=sb.reverse().toString();
        
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        
        dos.writeUTF(Ans);
        
       
        
       
        dis.close();
        is.close();
        s.close();
        
    }
}
