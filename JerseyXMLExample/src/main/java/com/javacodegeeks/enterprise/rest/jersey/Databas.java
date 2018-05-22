package com.javacodegeeks.enterprise.rest.jersey;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import com.javacodegeeks.enterprise.rest.jersey.*;
import java.sql.*;

public class Databas {
	
	public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver"); 
		ArrayList<Result> list = new ArrayList<Result>();
		Result d = new Result();
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","rootu","");  
		//here sonoo is database name, root is username and password
		System.out.println("working");
		Statement stmt=con.createStatement(); 
		PreparedStatement  pstmt =con.prepareStatement("select * from persons");
		ResultSet rs=stmt.executeQuery("select * from persons");  
		while(rs.next()) { 
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		d.setAdf(rs.getInt(1));
		d.setAddress(rs.getString(2));
		d.setCity(rs.getString(3));
		list.add(d);
		}
		con.close();  
		System.out.println(d.toString());
		
		


		}catch(Exception e){ System.out.println(e);}  
		
		}  

}
