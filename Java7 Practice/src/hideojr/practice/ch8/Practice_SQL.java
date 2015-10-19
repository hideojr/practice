package hideojr.practice.ch8;

import java.sql.*;

public class Practice_SQL {

	public static void main(String[] args) {
		//CONNECT DERBY DB
		String dbPath = "jdbc:derby:D:/Data Area/William/Projects/DB/testdb;create=true";
		try {
			Class.forName("org.apache.derby.jdbc.AutoloadedDriver"); //jdbc 4.0��i�H���μg
			Connection con= DriverManager.getConnection(dbPath,"","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * From EMPLOYEE");
			int counts = 0;
			while (rs.next()) {
				System.out.print("ID: " + rs.getString("ID") + "\t");
				System.out.print(" first name: " + rs.getString("FNAME") + "\t");
				System.out.println(" last name: " + rs.getString("LNAME") + "\t");
				counts++;
			}
			int count = stmt.executeUpdate("Delete From EMPLOYEE Where ID > 1");
			//batch
			stmt.addBatch("Insert Into EMPLOYEE Values(2,'M','�i','�h�p')");
			stmt.addBatch("Insert Into EMPLOYEE Values(3,'M','��','����')");
			stmt.addBatch("Insert Into EMPLOYEE Values(4,'M','��','�K��')");
			int[] totalcounts = stmt.executeBatch();
			System.out.printf("�s�W %2$d ��; �@�� %1$d ����� %n", counts,totalcounts.length);
			rs = stmt.executeQuery("Select * From EMPLOYEE");
			while (rs.next()) {
				System.out.print("ID: " + rs.getString("ID") + "\t");
				System.out.print(" first name: " + rs.getString("FNAME") + "\t");
				System.out.println(" last name: " + rs.getString("LNAME") + "\t");
			}
			con.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		///*
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//*/

	}

}
