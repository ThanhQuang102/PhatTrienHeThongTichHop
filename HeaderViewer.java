package IPAddress;
import java.net.*; 
import java.io.*; 
import java.util.*; 
public class HeaderViewer { 
	public static void main(String args[]) { 
			try { URL u = new URL("http://iuh.edu.vn"); 
			URLConnection uc = u.openConnection( );
			System.out.println("Content-type: " + uc.getContentType( ));
			System.out.println("Content-encoding: " + uc.getContentEncoding( )); 
			System.out.println("Date: " + new Date(uc.getDate( ))); 
			System.out.println("Last modified: " + new Date(uc.getLastModified( ))); 
			System.out.println("Expiration date: " + new Date(uc.getExpiration( ))); 
			System.out.println("Content-length: " + uc.getContentLength( ));
			} catch (MalformedURLException ex) 
			{
				System.err.println("http://iuh.edu.vn" + " is not a URL I understand"); 
				
			} catch (IOException ex) 
			{ 
				System.err.println(ex); 
			} 
			System.out.println( ); } 

	}