/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogrammingdemo;

import java.net.*;
import java.io.*;
import java.util.*;
public class clientpalin {
          public static void main(String[] args) throws Exception
    {
      Socket s=new Socket("localhost",45);
      
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the String:");
   String sym=sc.next();
   
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
       
        dos.writeUTF(sym);
        
         InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        
        String s1= dis.readUTF();
        System.out.println("reverse the String:"+s1);
        
         if(s1.equals(sym))
        {
                

            System.out.println("string is palin");
        }
        else
        {
            System.out.println("string is not palin");
        }
        
        dos.close();
        os.close();
        s.close();
        
        
    }
}
