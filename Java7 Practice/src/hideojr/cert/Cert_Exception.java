package hideojr.cert;

import java.io.IOException;
import java.sql.SQLException;

public class Cert_Exception {

	public static void main(String[] args) {
		try {
			//printData();
			showData();
			printData();
		} 
		catch (Exception e) {
			System.out.println("The Exception Caught :"+e);
			e.printStackTrace();
		}
		System.out.println("end");
	}

	public static void showData() throws Exception {
		throw new Error("Error occurs");
	}
	
	public static void printData() throws Exception {
		throw new RuntimeException("RuntimeException occurs");
	}
	
	public static void dealData() throws Exception { //throws SQLException , IOException {
		dealFileData();
		dealDBData();
	}
	
	public static void dealFileData() throws IOException {
		
	}
	
public static void dealDBData() throws SQLException {
		
	}
}
