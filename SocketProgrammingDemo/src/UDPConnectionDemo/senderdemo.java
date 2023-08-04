/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPConnectionDemo;
import java.net.*;
import java.io.*;
import java.util.*;
public class senderdemo {
    
    public static void main(String args[])throws Exception
    {
        DatagramSocket ds=new DatagramSocket(234);
        
        byte[] sd=new byte[50];
        String msg="hello";
        sd=msg.getBytes();
        
        InetAddress inet=InetAddress.getLocalHost(); //this address are optional we can use local host directly threw argument.
        
         DatagramPacket dp=new DatagramPacket(sd,sd.length,inet,235);
         ds.send(dp);
         
         
    }
    
}
