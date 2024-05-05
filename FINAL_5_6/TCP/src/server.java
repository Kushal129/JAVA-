import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {

	public static void main(String[] args) {
		try {
			//1:- create a sokt
			ServerSocket ss = new ServerSocket(5000);
			System.out.println("Waiting for client.");
			
			// create soket server side
			Socket cs = ss.accept();
			System.out.println("Client connected.");
			
			
			// data transfer sever to client 
			BufferedReader clntinput = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter sout = new PrintWriter(cs.getOutputStream(), true);
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

			Scanner sc = new Scanner(System.in);
			String data, send;
			
			while (true) {
				data = clntinput.readLine();
	            System.out.println("Client: " + data);
	            
	            if (data.equalsIgnoreCase("bye")) {
                    System.out.println("Client disconect. Server close");
                    break;
                }
	            System.out.print("Server: ");
	            send = sin.readLine();
	            sout.println(send);
				
			}
			// write data kare soket ma ne clear the buffer
			sout.flush();
			cs.close();
            ss.close();
            sc.close();
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
