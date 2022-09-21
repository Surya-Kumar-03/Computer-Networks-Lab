import java.lang.*;
import java.io.*;
import java.net.*;

class telnetServer
{
	public static void main(String args[]) 
	{
 		String data = "Hello Client!! ";
 		try
		{

 			ServerSocket srvr = new ServerSocket(8088);
 			Socket skt = srvr.accept();
 			System.out.println("Client Connected!");
 			PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
 			DataInputStream din=new DataInputStream(skt.getInputStream());
 			if(din.readUTF().equals("1"))
			{
 				System.out.println("String: '" + data);
 				out.print(data);
 			}
			out.close();
 			skt.close();
 			srvr.close();
 			din.close(); 
 		}
 		catch(Exception e) 
		{
 			System.out.print(e);
 		}
 	}
}