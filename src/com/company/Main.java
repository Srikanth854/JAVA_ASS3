package com.company;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main {
    public static void isReachable(String address) {
        try {
            InetAddress inetAddress = InetAddress.getByName(address);
            boolean isReachable = inetAddress.isReachable(5000);
            System.out.printf("Is the address [%s] reachable? -%s\n", address, isReachable ? "Yes" : "No");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the IP address");
        String st;
        st=in.nextLine();
        isReachable(st);
    }
}
