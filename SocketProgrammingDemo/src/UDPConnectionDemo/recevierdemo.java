/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPConnectionDemo;

import java.net.*;
import java.io.*;
import java.util.*;
public class recevierdemo {
    public static void main(String args[])throws Exception
    {
           DatagramSocket ds=new DatagramSocket(235);
             byte[] rd=new byte[50];
              DatagramPacket dp=new DatagramPacket(rd,rd.length);
         ds.receive(dp);
         
         String msg=new String(dp.getData());
           System.out.println(msg);
    }
    
    
}
