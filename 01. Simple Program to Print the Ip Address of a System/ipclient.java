import java.net.*;
import java.io.*;

class ipclient{
	public static void main(String args[]) throws Exception{
			InetAddress test= InetAddress.getLocalHost();
			System.out.print(test);
	}
}