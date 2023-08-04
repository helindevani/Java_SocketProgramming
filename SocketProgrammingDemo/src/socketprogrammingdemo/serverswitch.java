/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogrammingdemo;

import java.net.*;
import java.io.*;
import java.util.*;
public class serverswitch {
      public static void main(String[] args) throws Exception
    {
    
     ServerSocket ss=new ServerSocket(45); //request ne accept karva object banavo 
        
        Socket s=ss.accept();
        
        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        
       
        
       // System.out.println(s1);
        
        int ans1=dis.readInt();
        int ans2=dis.readInt();
        
         String s1=dis.readUTF();
        
        //int ans3=dis.readInt();
        //int ans4=dis.readInt();
        
        switch(s1)
        {
            case "+": System.out.println(ans1+ans2);
                        break;
            case "-":  
                        System.out.println(ans1-ans2);
                        break;
            default : System.out.println("enter a valid String");
                         break;
        }
        
        dis.close();
        is.close();
        s.close();
        
    }
}
