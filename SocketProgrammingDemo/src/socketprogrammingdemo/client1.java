/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogrammingdemo;

/**
 *
 * @author ljeng
 */import java.net.*;
import java.io.*;

public class client1 {
    
      public static void main(String[] args) throws Exception
    {
      Socket s=new Socket("localhost",89);
      
    int a=10;
    int b=20;
        OutputStream os=s.getOutputStream();
        DataOutputStream dos=new DataOutputStream(os);
        dos.writeInt(a);
        dos.writeInt(b);
        
        dos.close();
        os.close();
        s.close();
        
        
    }
    
}
