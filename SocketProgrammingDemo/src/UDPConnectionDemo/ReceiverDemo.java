/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPConnectionDemo;

import java.net.*;
import java.io.*;
import java.util.*;
public class ReceiverDemo {
     public static void main(String args[])throws Exception
    {
        DatagramSocket ds=new DatagramSocket(248);
        
        byte[] sd=new byte[50];
        String msg="hello";
        sd=msg.getBytes();
        
        InetAddress inet=InetAddress.getLocalHost(); //this address are optional we can use local host directly threw argument.
        
         DatagramPacket dp=new DatagramPacket(sd,sd.length,inet,249);
         ds.send(dp);
         
          byte[] rd1=new byte[50];
         DatagramPacket dp2=new DatagramPacket(rd1,rd1.length);
         ds.receive(dp2);
         
         String msg1=new String(dp2.getData());
           System.out.println(msg1);
    }
}
