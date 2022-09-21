import java.net.*;
import java.io.*;
public class ftpclient {
    public static void main(String args[]) {
        try {
            Socket s = new Socket(InetAddress.getLocalHost(), 4000);
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str;
            while ((str = br.readLine()) != null)
                System.out.println(str);
        } catch (Exception e) {
            System.out.println("The connection to the server has been reset");
        }
    }
}