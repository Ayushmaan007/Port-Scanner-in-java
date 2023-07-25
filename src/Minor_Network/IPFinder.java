package Minor_Network;

import java.net.InetAddress;
import java.util.Scanner;

public class IPFinder{

    public static void dns()
    {
        Scanner console = new Scanner(System.in); //input ke liye
        System.out.println("Enter Hostname/Domain name: ");
        String hostname = console.nextLine();

        //use static method getByName() to get InetAddress of the host
        InetAddress inet = null;
        InetAddress myIP = null;
        try {
            myIP = InetAddress.getLocalHost();
        }
        catch (Exception ignore)
        {
        }

        System.out.println("Host Information: " + myIP);

        try {
            inet = InetAddress.getByName(hostname);
        } catch (Exception ignore) {
        }
        assert inet != null;
        String IPAddress = inet.getHostAddress();
        System.out.println("IP address of Domain " + hostname + " is " + IPAddress);
    }
//    public static void main(String[] args) {
//
//    }
}