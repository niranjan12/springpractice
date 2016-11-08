package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcConnectionTest {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost/myapp";
		Connection con=DriverManager.getConnection(url, "root", "tiger");
		System.out.println(con);
		

	}

}
