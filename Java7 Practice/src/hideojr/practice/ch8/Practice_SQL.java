package hideojr.practice.ch8;

import java.sql.*;

public class Practice_SQL {

	public static void main(String[] args) {
		//CONNECT DERBY DB
		String dbPath = "jdbc:derby:D:/Data Area/William/Projects/DB/testdb;create=true";
		try {
			Class.forName("org.apache.derby.jdbc.AutoloadedDriver"); //jdbc 4.0後可以不用寫
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
			stmt.addBatch("Insert Into EMPLOYEE Values(2,'M','張','逸如')");
			stmt.addBatch("Insert Into EMPLOYEE Values(3,'M','何','奕睿')");
			stmt.addBatch("Insert Into EMPLOYEE Values(4,'M','何','沛謙')");
			int[] totalcounts = stmt.executeBatch();
			System.out.printf("新增 %2$d 筆; 共有 %1$d 筆資料 %n", counts,totalcounts.length);
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
