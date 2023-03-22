/*import java.net.* ;
import java.util.* ;

public class Main {

        public static void main(String[] args) {
            try{
                Enumeration e = NetworkInterface.getNetworkInterfaces();
                while(e.hasMoreElements()) {
                    NetworkInterface n = (NetworkInterface) e.nextElement();
                    Enumeration ee = n.getInetAddresses();
                    while (ee.hasMoreElements()) {
                        InetAddress i = (InetAddress) ee.nextElement();
                        System.out.println(i.getHostAddress());
                    }
                }
            }catch(SocketException e){
                e.printStackTrace();
            }
        }
    }*/

/*import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Main {

    public static void main(String[] args) {
        InetAddress addr;
        try{
            addr = InetAddress.getByName("10.187.4.241");
            if(addr.isReachable(1000)) System.out.println("Node 10.187.4.241 is reachable!!");
        }
        catch(UnknownHostException e){
            e.printStackTrace();
        }
        catch(IOException i){
            i.printStackTrace();
        }
    }

}*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        InetAddress addr;
        Socket client;
        Scanner clavier = new Scanner(System.in);
        try{
            client = new Socket("192.168.0.104", 4444);
            BufferedReader in = new BufferedReader( new InputStreamReader( client.getInputStream() ) );
           PrintWriter out = new PrintWriter( client.getOutputStream(), true);
            System.out.println("MESSAGERIE BASSEL ------- MARC");
            System.out.println("Entrez votre message : ");
            String message = clavier.nextLine();
            out.write( message +"\n");
            out.flush();


        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        catch(IOException ioe){}
    }

}