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
public class URL1 {
    public static void main(String args[]) throws Exception {
        URL u = new URL("https://www.google.com");
        System.out.println(u.getProtocol());
        System.out.println(u.getHost());
        System.out.println(u.getPort());
        System.out.println(u.getDefaultPort());
        System.out.println(u.getFile());
        System.out.println(u.getAuthority());
        System.out.println(u.getQuery());
        System.out.println(u.getPath());
        System.out.println(u.getRef());
        System.out.println(u.getUserInfo());
        URLConnection con = u.openConnection();
        System.out.println(con.getContentLength());
        System.out.println(con.getContentType());
        System.out.println(con.getDate());
        System.out.println(con.getExpiration());
    }
}
