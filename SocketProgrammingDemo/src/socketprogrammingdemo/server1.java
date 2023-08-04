/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogrammingdemo;

import java.net.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author ljeng
 */
public class server1 {
     public static void main(String[] args) throws Exception
    {
    
     ServerSocket ss=new ServerSocket(1234); //request ne accept karva object banavo 
        
        Socket s=ss.accept();
        
        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        
        int ans1=dis.readInt();
               int ans2=dis.readInt();
        System.out.println(ans1+ans2);
        
        dis.close();
        is.close();
        s.close();
        
    }
    
}
