package basic3;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class GetIPDemo {

	
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
	
	public static void main(String[] args) {
	
		System.out.println(getIp());
	}
}
