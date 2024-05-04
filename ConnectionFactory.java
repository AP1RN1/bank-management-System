package bank;

import java.sql.*;

public class ConnectionFactory {
	//Instance Variable
	Connection con;
	Statement stmt;

	public  ConnectionFactory() {
		try {
			//Loading the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//established the connection with database
			   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","root");
			stmt=con.createStatement();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
