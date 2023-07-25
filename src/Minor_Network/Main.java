package Minor_Network;

import java.util.Scanner;

public class Main
{
//    public static void main(String[] args)
//    {
//        any_ip();
//    }

    public static void any_ip()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any IP: ");
        String ip = scan.next();
        any_IP_Socket2.portScan(ip);
    }
}