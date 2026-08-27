package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestExDemo13 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

//		1) Step1 : Loading Driver class 
//		Unhandled exception type ClassNotFoundException
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class Successfully loaded !!");

//		2) Establish he Connection 
//		The basic service for managing a set of JDBC drivers.
//		Attempts to establish a connection to the given database URL.
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sbdata", "root", "root");

//		

//		3) Create Statement Object 
//		Connection : A connection (session) with a specific database. 
//		SQL statements are executed and results are returned 
//		within the context of a connection.

//		createStatement() --> Creates a Statement object for sending SQL statements to the database.
		Statement st = con.createStatement();

//		Statement : The object used for executing a static SQL statement and returning the results it produces.
//		By default, only one ResultSet object per Statement object can be open at the same time. 

//		4) Create a ResultSet Object 
		String sql = "select * from employee";
		ResultSet rs = st.executeQuery(sql);//
//		Executes the given SQL statement, which returns a single ResultSet object.

//		5) Represent the ResultSet 

		while (rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
			System.out.println("*******************************");
		}

//		6) Close the Connection s

		rs.close();
		st.close();
		con.close();

	}
}
