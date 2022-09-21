import java.net.*;
import java.io.*;

public class udpclient
{
	public static int client=789;
	public static void main(String args[]) throws IOException
	{
		DatagramSocket ds=new DatagramSocket(client);
		byte b[]=new byte[1024];
		System.out.println("client....receiving....");
		while(true)
		{
			DatagramPacket dp=new DatagramPacket(b,b.length);
			ds.receive(dp);
			String s=new String(dp.getData(),0,dp.getLength());
			if(s.equals("end")) break;
			else System.out.println(s);
		}
	}
}