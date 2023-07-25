package Minor_Network;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;


class Thread_1_Test extends Thread
{
    private final String ip;
    static int i = 0;
    static int[] Array = new int[65535];

    static File file1 = new File("Thread_1.txt");
    static FileWriter fw1;

    static {
        try {
            fw1 = new FileWriter(file1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static PrintWriter pw1 = new PrintWriter(fw1);
    public Thread_1_Test(String ip)
    {
        this.ip = ip;
    }

    public void run()
    {
        int currentPort = 0;

        while(currentPort <= 13107)
        {
            try {
                Socket socket1 = new Socket();
                socket1.connect(new InetSocketAddress(ip, currentPort), 1);
//                System.out.println(socket1.getLocalSocketAddress());
//                System.out.println(socket1.getRemoteSocketAddress());
                int local_port = socket1.getLocalPort();
                socket1.close();
                Array[i] = currentPort;
                System.out.println(i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Array[i]);
                System.out.println("_________________________");
//                pw1.println(i+1 + " : " + Array[i]);
                pw1.println(i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Array[i]);
                pw1.println("_________________________");
                i++;
//                System.out.println("Local Port used: "+ local_port + " " + ip + " ,port open: " + currentPort);
//                System.out.println("______________________");
            }
            catch (IOException ignored)
            {
            }
            currentPort++;
        }

        Thread_1_Test.pw1.close();
        Encryption.Encrypt();

    }
}

class Thread_2 extends Thread
{
    private final String ip;
    public Thread_2(String ip)
    {
        this.ip = ip;
    }
    public void run()
    {
        int currentPort = 13108;
        while(currentPort <= 26214)
        {
            try {
                Socket socket2 = new Socket();
                socket2.connect(new InetSocketAddress(ip, currentPort), 1);
//                System.out.println(socket2.getLocalSocketAddress());
//                System.out.println(socket2.getRemoteSocketAddress());
                int local_port = socket2.getLocalPort();
                socket2.close();
                Thread_1_Test.Array [Thread_1_Test.i] = currentPort;
                System.out.println(Thread_1_Test.i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Thread_1_Test.Array[Thread_1_Test.i]);
                System.out.println("_________________________");
//                Thread_1_Test.pw1.println(Thread_1_Test.Array[Thread_1_Test.i]);
                Thread_1_Test.pw1.println(Thread_1_Test.i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Thread_1_Test.Array[Thread_1_Test.i]);
                Thread_1_Test.pw1.println("_________________________");
                Thread_1_Test.i++;
//                System.out.println("Local Port used: "+ local_port + " " + ip + " ,port open: " + currentPort);
//                System.out.println("______________________");
            }
            catch (IOException ignore) {
            }
            currentPort++;
        }
    }
}

class Thread_3 extends Thread
{
    private final String ip;

    public Thread_3(String ip)
    {
        this.ip = ip;
    }
    public void run()
    {
        int currentPort = 26215;
        while(currentPort <= 39321)
        {
            try {
                Socket socket3 = new Socket();
                socket3.connect(new InetSocketAddress(ip, currentPort), 1);
//                System.out.println(socket3.getLocalSocketAddress());
//                System.out.println(socket3.getRemoteSocketAddress());
                int local_port = socket3.getLocalPort();
                socket3.close();
                Thread_1_Test.Array[Thread_1_Test.i] = currentPort;
                System.out.println(Thread_1_Test.i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Thread_1_Test.Array[Thread_1_Test.i]);
                System.out.println("_________________________");
//                Thread_1_Test.pw1.println(Thread_1_Test.Array[Thread_1_Test.i]);
                Thread_1_Test.pw1.println(Thread_1_Test.i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Thread_1_Test.Array[Thread_1_Test.i]);
                Thread_1_Test.pw1.println("_________________________");
                Thread_1_Test.i++;
//                System.out.println("Local Port used: "+ local_port + " " + ip + " ,port open: " + currentPort);
//                System.out.println("______________________");
            }
            catch (IOException ignore) {
            }
            currentPort++;
        }
    }
}

class Thread_4 extends Thread
{
    private final String ip;

    public Thread_4(String ip)
    {
        this.ip = ip;
    }
    public void run()
    {
        int currentPort = 39322;
        while(currentPort <= 52428)
        {
            try
            {
                Socket socket4 = new Socket();
                socket4.connect(new InetSocketAddress(ip, currentPort), 1);
//                System.out.println(socket4.getLocalSocketAddress());
//                System.out.println(socket4.getRemoteSocketAddress());
                int local_port = socket4.getLocalPort();
                socket4.close();
                Thread_1_Test.Array[Thread_1_Test.i] = currentPort;
                System.out.println(Thread_1_Test.i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Thread_1_Test.Array[Thread_1_Test.i]);
                System.out.println("_________________________");
//                Thread_1_Test.pw1.println(Thread_1_Test.Array[Thread_1_Test.i]);
                Thread_1_Test.pw1.println(Thread_1_Test.i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Thread_1_Test.Array[Thread_1_Test.i]);
                Thread_1_Test.pw1.println("_________________________");
                Thread_1_Test.i++;
//                System.out.println("Local Port used: "+ local_port + " " + ip + " ,port open: " + currentPort);
//                System.out.println("______________________");
            }
            catch (IOException ignore)
            {
            }
            currentPort++;
        }
    }
}


class Thread_5 extends Thread
{
    private final String ip;

    public Thread_5(String ip)
    {
        this.ip = ip;
    }
    public void run()
    {
        int currentPort = 52429;
        while(currentPort <= 65535)
        {
            try
            {
                Socket socket5 = new Socket();
                socket5.connect(new InetSocketAddress(ip, currentPort), 1);
//                System.out.println(socket5.getLocalSocketAddress());
//                System.out.println(socket5.getRemoteSocketAddress());
                int local_port = socket5.getLocalPort();
                socket5.close();
                Thread_1_Test.Array[Thread_1_Test.i] = currentPort;
                System.out.println(Thread_1_Test.i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Thread_1_Test.Array[Thread_1_Test.i]);
                System.out.println("_________________________");
//                Thread_1_Test.pw1.println(Thread_1_Test.Array[Thread_1_Test.i]);
                Thread_1_Test.pw1.println(Thread_1_Test.i+1 + " ---> " + "Local Port used: "+ local_port + ", ipaddress: " + ip + ", port open: " + Thread_1_Test.Array[Thread_1_Test.i]);
                Thread_1_Test.pw1.println("_________________________");
                Thread_1_Test.i++;
//                System.out.println("Local Port used: "+ local_port + " " + ip + " ,port open: " + currentPort);
//                System.out.println("______________________");
            }
            catch (IOException ignore) {
            }
            currentPort++;
        }
    }
}

//class thread
//{
//    public String ip;
//
//    public thread(String ip)
//    {
//        this.ip = ip;
//    }
//
//    public void threadCall()
//    {
//
//
//        System.out.println(Thread_1_Test.Array[1]);
//    }
//}


public class any_IP_Socket2
{
    public static void portScan(String ip)
    {

//        thread t = new thread(ip);
//        t.threadCall();

        Thread_1_Test t1 = new Thread_1_Test(ip);
        Thread_2 t2 = new Thread_2(ip);
        Thread_3 t3 = new Thread_3(ip);
        Thread_4 t4 = new Thread_4(ip);
        Thread_5 t5 = new Thread_5(ip);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


//        search s = new search();
//        s.search_same();

//        System.out.println(Thread_1_Test.Array[1]);

    }

}