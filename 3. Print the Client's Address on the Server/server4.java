import java.net.*;
import java.io.*;

class server4
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket s1 = new ServerSocket(8000);
		System.out.println("Server Running");
		Socket s2=s1.accept();
		InetAddress a=InetAddress.getLocalHost();
		String add=a.getHostAddress();
		BufferedReader in=new BufferedReader(new InputStreamReader(s2.getInputStream()));
		PrintWriter out=new PrintWriter(s2.getOutputStream(),true);
		System.out.println("Client Connected");
		System.out.println(s2);
		out.println(add);
		System.out.println("Client's IP is ");
		System.out.println(in.readLine());
		s1.close();
		s2.close();
	}
}