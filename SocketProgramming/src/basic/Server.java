package basic;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

		
	
	 private Socket          socket   = null;
	    private ServerSocket    server   = null;
	    private DataInputStream in       =  null;
	    public Server(int port)
	    {
	        // starts server and waits for a connection
	        try
	        {
	        	server = new ServerSocket(port);
	        	System.out.println("Server is waiting ______");
	           socket = server.accept();
	           System.out.println("accepted by server connected to");
	           System.out.println( "Port "+socket.getPort() );
	           System.out.println("ip -> " + socket.getInetAddress());
	           
	           System.out.println("************************** Messages ******************************");
//	           System.out.println(");
	           String val =  new String();
	           in= new DataInputStream(socket.getInputStream());
//	           System.out.println("reading input from client");
//	           val= in.readUTF();
//	           System.out.println("values from client - >"+ val  );
	           while(!val.equalsIgnoreCase("quit")) {
	        	   System.out.println(val+" \t \t :)");
	        	   val=in.readUTF();
	           }
//	           System.out.println("server after while");
	           
	        }
	        catch(IOException i)
	        {
	            System.out.println(i);
	        }
	    }
	    public static void main(String args[])
	    {
	    	System.out.println("******************* Server **************************");
	        Server server = new Server(5000);
	    }
}
