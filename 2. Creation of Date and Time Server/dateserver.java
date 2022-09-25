import java.net.*;
import java.io.*;
import java.util.*;

public class dateserver
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket sSocket = new ServerSocket(1000);
		Socket cSocket=sSocket.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
		PrintWriter out=new PrintWriter(cSocket.getOutputStream(),true);
		Date d = new Date();
		try
		{
			while(true)
			{
				d= new Date();
				out.println("Time at server;" +d.toString());
				System.out.println(br.readLine());
				Thread.sleep(1000);
			}
		}
		catch(IOException e)
		{
			System.out.println("----Client has Closed-----");
		}
	}
}