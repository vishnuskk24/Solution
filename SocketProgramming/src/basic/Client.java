package basic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	
	 // initialize socket and input output streams
    private Socket socket = null;
//    private DataInputStream input = null;
    private DataOutputStream out = null;
 
    // constructor to put ip address and port
    public Client(String address, int port)
    {
    	try {
			socket =  new Socket(address,port);
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
//				send it to server
				out.writeUTF(val);
				
				
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    }
	
	public static void main(String[] args) {
		
		System.out.println("*************** Client *********************");
		Client c = new Client("127.0.0.1",5000);
	}
	
	
}
