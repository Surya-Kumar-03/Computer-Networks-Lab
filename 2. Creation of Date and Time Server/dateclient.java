import java.net.*;
import java.io.*;

public class dateclient
{
	public static void main (String[] args) throws Exception
	{
		try
		{
			Socket s=new Socket(InetAddress.getLocalHost(),1000);
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String input;
			PrintWriter out=new PrintWriter(s.getOutputStream(),true);
			while((input=br.readLine())!=null)
			{
				System.out.println(input);
				out.println("Date and Time Received-----------client Acknowledge------");
			}
		}
		catch(Exception e)
		{
		}
	}
}