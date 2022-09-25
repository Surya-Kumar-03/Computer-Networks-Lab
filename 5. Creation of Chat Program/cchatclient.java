import java.net.*;
import java.io.*;

public class cchatclient
{
	public static void main(String arg[])throws Exception
	{
		Socket s=new Socket(InetAddress.getLocalHost(),4000);
		BufferedReader br=new BufferedReader(new
		InputStreamReader(s.getInputStream()));
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(s.getOutputStream(),true);
		String input,t;
		while(true)
		{
			System.out.println("client");
			out.println("client:"+in.readLine());
			System.out.println(br.readLine());
		}
	}
}