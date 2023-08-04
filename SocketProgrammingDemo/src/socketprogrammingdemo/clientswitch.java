/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogrammingdemo;

import java.net.*;
import java.io.*;
import java.util.*;
public class clientswitch {
    
      public static void main(String[] args) throws Exception
    {
      Socket s=new Socket("localhost",45);
      
    int a;
    int b;
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Symbol :");
   String sym=sc.next();
    System.out.println("Enter the value of a :");
   a=sc.nextInt();
   System.out.println("Enter the value of b :");
   b=sc.nextInt();
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeInt(a);
        dos.writeInt(b);
        dos.writeUTF(sym);
        
        dos.close();
        os.close();
        s.close();
        
        
    }
}
