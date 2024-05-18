package basic3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Peer1 {
		private Socket  socket = null;
	    private ServerSocket  server   = null;
	    private DataInputStream in  =  null;
	    Integer peer1Serverport=5500;
	    Integer peer2Serverport=5501;
	    String ip = "127.0.0.1";
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
	        {
	        	server = new ServerSocket(peer1Serverport);
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
	
	
	
	
	Peer1() throws InterruptedException{
		serverthread.start(); // peer 1 server start
//		Thread.sleep(10000); // 10 sec
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		new Peer1();
		
		System.out.println();
	}
}
