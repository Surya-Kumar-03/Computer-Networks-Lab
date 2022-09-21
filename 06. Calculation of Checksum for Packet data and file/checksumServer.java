import java.net.*;
import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.lang.*;

public class checksumServer extends Thread
{
	public static void main(String[] args) throws Exception
 	{
	 	 try
	 	 {
	 	 	 ServerSocket sSocket=new ServerSocket(1000);
	 	 	 Socket cSocket=sSocket.accept();
	 	 	 BufferedReader br=new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
	 	 	 PrintWriter out=new PrintWriter(cSocket.getOutputStream(),true);
	 	 	 String str1,str2;
	 	 	 str2=br.readLine();
	 	 	 System.out.println("INCOMING DATA : " + str2);
	 	 	 StringTokenizer s=new StringTokenizer(str2,"$");
	 	 	 CRC32 c=new CRC32();
	 	 	 str1=s.nextToken();
	 	 	 for(int i=0;i<s.countTokens()+2;i++)
	 	 	 {
	 	 	 	 System.out.println(str1);
		 	 	 

	 	 	 	 System.out.println("str1");
		 	 	 

	 	 	 	 System.out.println(str2);
	 	 	 	 System.out.println("str2");
	 	 	 }
	 	 	 System.out.println(str1);
	 	 	 c.update(str1.getBytes());
			 System.out.println("str3");
		 	 

	 	 	 long rCRC=Long.parseLong(br.readLine()),cCRC=c.getValue();
	 	 	 System.out.println("rCRC = " + rCRC);
	 	 	 System.out.println("cCRC = " + cCRC);
			 System.out.println("dsfghdfd");
	 	 	 if(rCRC==cCRC)
	 	 	 {
	 	 	 	 System.out.println("CRC Check successful...");
	 	 	 	 System.out.println("CRC Check successful...");
	 	 	 }
	 	 	 else
	 	 	 {
	 	 	 	 out.println("CRC Check un-successful...");
	 	 	 	 System.out.println("CRC Check un-successful...");
	 	 	 }
	 	 }
	 	 catch(Exception e){}
	}
}