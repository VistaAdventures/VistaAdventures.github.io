import java.net.*;
import java.io.*;
import java.util.*;
public class ServerDemo
{
	public static void main(String args[]) throws Exception
	{
		
		String send,Recv;
		ServerSocket ss=new ServerSocket(7777);
		System.out.println("waiting for connection");
		Socket s=ss.accept();
		System.out.println("connected");
		InputStream io=s.getInputStream();
		DataInputStream dis=new DataInputStream(io);
		
		OutputStream io=s.getOutputStream();
		DataOutputStream dis=new DataOutputStream(io);
		
		Recv=dis.readUTF();
		System.out.println(Recv);
		Send=sc.next();
		dop.writeUTF(send);
	}
}
		
		
