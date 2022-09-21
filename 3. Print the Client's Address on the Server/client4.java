import java.net.*;
import java.io.*;
class client4
{
	public static void main(String args[]) throws Exception
	{
		InetAddress a=InetAddress.getLocalHost();
		Socket s2 = new Socket(a,8000);
		String add=a.getHostAddress();
		BufferedReader in=new BufferedReader(new InputStreamReader(s2.getInputStream()));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(s2.getOutputStream()),true);
		System.out.println(in.readLine());
		out.println(add);
		s2.close();
	}
}