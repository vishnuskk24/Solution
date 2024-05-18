package basic4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.Scanner;

public class Peer1 {
		private Socket  socket = null;
	    private ServerSocket  server   = null;
	    private DataInputStream in  =  null;
	    Integer peer1Serverport=5500;
	    Integer peer2Serverport=5501;
	    static String ip = "127.0.0.1";
	    private DataOutputStream out = null;
	    
	    Thread clientthread =  new Thread(()->{
			try {
				
				socket =  new Socket(ip,peer2Serverport);
				System.out.println("connection done client");
				System.out.println("My port ->"+socket.getPort());
				System.out.println("My address - >"+ socket.getInetAddress());
				System.out.println("provide input");
				Scanner s =  new Scanner(System.in);
				
				out =  new DataOutputStream(socket.getOutputStream());
				
				String val =  "";
				
				while(!val.equalsIgnoreCase("quit")) {
					
				
					System.out.print("--->");
				// take from terminal
					val=s.nextLine();
//					send it to server
					out.writeUTF(val);
					
					
				}
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		});
		

	Thread serverthread =  new Thread(()->{
		
		 try
	        {	InetAddress bindAddr = InetAddress.getByName(ip);
			 	server = new ServerSocket(peer1Serverport, 50, bindAddr);
	        	System.out.println("Server is waiting ______");
	           socket = server.accept();
	           System.out.println("accepted by server connected to");
	           System.out.println( "Port "+socket.getPort() );
	           System.out.println("ip -> " + socket.getInetAddress());
	           new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	           clientthread.start();
	           System.out.println("************************** Messages ******************************");

	           String val =  new String();
	           in= new DataInputStream(socket.getInputStream());

	           while(!val.equalsIgnoreCase("quit")) {
	        	   System.out.println("\t \t \t\t\t\t\t"+val+" \t \t :) \n -->");
	        	   val=in.readUTF();
	           }

	           
	        }
	        catch(IOException i)
	        {
	            System.out.println(i);
	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
	});
	
	public static String getIp() {
		String ip = "";
		try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();

                // Filter to check for WiFi interfaces (commonly named wlan0, wlp2s0, etc.)
                if (networkInterface.getName().startsWith("wlan") || networkInterface.getName().startsWith("wlp")) {
                    Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress inetAddress = inetAddresses.nextElement();

                        // Check if the address is not a loopback address and is an IPv4 address
                        if (!inetAddress.isLoopbackAddress() && inetAddress.getHostAddress().indexOf(':') == -1) {
                            System.out.println("WiFi IP Address: " + inetAddress.getHostAddress());
                        }
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
		return ip;
	}
	
	
	Peer1() throws InterruptedException{
		serverthread.start(); // peer 1 server start
//		Thread.sleep(10000); // 10 sec
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		ip=getIp();
		new Peer1();
		
		System.out.println();
	}
}
