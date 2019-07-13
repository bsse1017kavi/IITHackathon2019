package uploadModule;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UploaderServer
{
	public void inputFile()throws IOException
	{
		ServerSocket serverSocket = new ServerSocket(4444);


	    Socket socket = null;
	    socket = serverSocket.accept();

	    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
	    DataInputStream in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
	    byte[] bytes = new byte[1024];

	    in.read(bytes);
	    System.out.println(bytes);

	    FileOutputStream fos = new FileOutputStream("downloads/test.txt");
	    fos.write(bytes);
	}
	
	public static void main(String[] args)throws IOException {
		UploaderServer uServer = new UploaderServer();
		uServer.inputFile();
	}
}
