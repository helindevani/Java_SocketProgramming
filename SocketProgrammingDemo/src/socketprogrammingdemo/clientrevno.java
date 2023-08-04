/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogrammingdemo;

import java.net.*;
import java.io.*;
import java.util.*;
public class clientrevno {
           public static void main(String[] args) throws Exception
    {
      Socket s=new Socket("localhost",45);
      
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
   int sym=sc.nextInt();
   
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
       
        dos.writeInt(sym);
        
         InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        
        int s1= dis.readInt();
        System.out.println("reverse the number:"+s1);
        
        dos.close();
        os.close();
        s.close();
        
        
    }
}
