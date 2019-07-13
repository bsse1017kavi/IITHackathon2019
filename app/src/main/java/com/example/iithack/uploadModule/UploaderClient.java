package uploadModule;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.Socket;


public class UploaderClient
{
	public void upload() throws IOException
	{
		Socket socket = null;
	    DataOutputStream out = null;
	    DataInputStream in = null;
	    String host = "127.0.0.1";   

	    socket = new Socket(host, 4444);
	    out = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
	    in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

	    File file = new File("uploads/test.txt");
	    //InputStream is = new FileInputStream(file);
	    // Get the size of the file
	    long length = file.length();
	    if (length > Integer.MAX_VALUE) {
	        System.out.println("File is too large.");
	    }
	    byte[] bytes = new byte[(int) length];

	    //out.write(bytes);
	    System.out.println(bytes);

	    out.close();
	    in.close();
	    socket.close();
	}
	
	public static void main(String[] args)throws IOException {
		UploaderClient client = new UploaderClient();
		client.upload();
	}
}
