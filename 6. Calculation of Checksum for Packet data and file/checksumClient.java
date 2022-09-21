import java.net.*;
import java.io.*;
import java.lang.*;
import java.util.zip.*;
public class checksumClient
{
	public static void main(String[] args) throws Exception
 	{
	 	 try
	 	 {
	 	 	 Socket s=new Socket(InetAddress.getLocalHost(),1000);
	 	 	 BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	 	 	 PrintWriter out=new PrintWriter(s.getOutputStream(),true);
	 	 	 String data="";
	 	 	 CRC32 c=new CRC32();
		 	 

	 	 	 for(int i=0;i<args.length;i++)
	 	 	 {
	 	 	 	 System.out.println(args[i]);
	 	 	 	 c.update(args[i].getBytes());
	 	 	 	 data=data+args[i]+"$";
	 	 	 }
		 	 

	 	 	 System.out.println(data);
	 	 	 System.out.println("CRC = " + c.getValue());
	 	 	 out.println(data);
	 	 	 out.println(c.getValue());
	 	 	 System.out.println(br.readLine());
	 	 }
	 	 catch(Exception e){}
	}
}