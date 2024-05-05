import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class clinet {

	public static void main(String[] args) {
		try {
			// create skt obje
			
			Socket ss = new Socket("localhost", 5000);
            System.out.println("Connected to server.");
			
			// bfr red.. use karu karan ke eni pase potnau che external buf.. 
			// read mor data also  line by line read 
		       BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
	           PrintWriter clntout = new PrintWriter(ss.getOutputStream(), true);
	           BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			// inputS sukam :- Soket acpt only Binary. ene convert buferR Character oriented data. 
			// mate InputStr use karu Automatic convert. br ma store hse line by line joavna pachi while thi.
			
			// read data form server
	           String data, send;
	           while (true) {
	        	   System.out.print("Client:- ");
	        	   send = in.readLine();
	        	   clntout.println(send);

	        	   data = br.readLine();
	        	   System.out.println("Server:- " + data);

	        	   if (send.equalsIgnoreCase("bye")) {
	        		   System.out.println("Exiting...!!");
	        		   break;
	        		   }
	           }
			 ss.close();
		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
