package menu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(1122);
			System.out.println("Server da duoc tao");
			Socket socket =server.accept();
			System.out.println("Client da ket noi den server");

			DataOutputStream out = new DataOutputStream(socket.getOutputStream());

			Scanner in = new Scanner(socket.getInputStream());
			PrintStream outToClient = new PrintStream(socket.getOutputStream());
			outToClient.println("nhap chuoi: ");
			Scanner input = new Scanner(System.in);

			String str=null;
			for(int i=0; i<=2;i++)
			{
				if(i==0)
				{
					outToClient.println("nhap chuoi: ");
				}
				else
				if(i==1)
				{
						str=in.nextLine();
						outToClient.println("nhap lua chon:/n 1.xuat chuoi nguoc/n2.in hoa chuoi ");
				}
					else
					{
						String a= in.nextLine();
						if(a.equals("1"))
						{
							char[] inin= str.toCharArray();
						    int begin=0;
						    int end=inin.length-1;
						    char temp;
						    while(end>begin){
						        temp = inin[begin];
						        inin[begin]=inin[end];
						        inin[end] = temp;
						        end--;
						        begin++;
						    }
						    outToClient.println(inin);
						}
						else
						if(a.equals("2"))
						{
						    outToClient.println(str.toUpperCase());
						}
					}
			}
			input.close();
			in.close();
			out.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			System.out.println("Cuoc tro chuyen ket thuc");
		}

	}
}
