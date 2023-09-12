package com.example.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpAddressExam {

    public static void main(String[] args) {

        try {
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println(ia.getHostAddress());
        }catch (UnknownHostException uhe){
            uhe.printStackTrace();
        }

        try {
            InetAddress[] iaArray = InetAddress.getAllByName("www.google.com");
            for ( InetAddress ia : iaArray
                 ) {
                System.out.println(ia.getHostAddress());
            }
        }catch (UnknownHostException uhe){
            uhe.printStackTrace();
        }
    }
}
