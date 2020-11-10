package menu;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			
			Socket client = new Socket("LocalHost", 1122);
			System.out.println("Client da duoc tao");
			Scanner inFromServer = new Scanner(client.getInputStream());
			PrintStream outToServer = new PrintStream(client.getOutputStream());
			System.out.println("server: " + inFromServer.nextLine());
			for(int i =0; i<2; i++) {
				Scanner scan = new Scanner(System.in);
				String s=scan.nextLine();
				outToServer.println(s);
			}
			
			} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

	}

}
