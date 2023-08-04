/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javap1;
import java.net.*;
/**
 *
 * @author ljeng
 */
public class JavaP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        InetAddress inet1 = InetAddress.getByName("localhost");
        InetAddress inet2 = InetAddress.getLocalHost();
        InetAddress inet3[] = InetAddress.getAllByName("CE-002");

        System.out.println(inet1);
        System.out.println(inet2);
        
        for(InetAddress i : inet3){
            System.out.println(i);
        }
        InetAddress i = InetAddress.getByName("localhost");
        System.out.println(i.getHostAddress());
        System.out.println(inet1.equals(inet2));
        System.out.println(inet1.isMulticastAddress());
    }
    
}
