package com.tcs.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
	 public static void main( String args[] )
	 {
	  try
	     {
	      // Load the database driver
//	      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	      Class.forName("oracle.jdbc.driver.OracleDriver");
	      
	      // Get a connection to the database
	      Connection conn = DriverManager.getConnection(
	    		  "jdbc:oracle:thin:@172.18.65.7:1521:tcsghy", "pj16", "tcsghy");

	      // Get a statement from the connection
	      Statement stmt = conn.createStatement() ;

	      // Execute the query
	      ResultSet rs = stmt.executeQuery("SELECT * FROM emp");
	      
//	      PreparedStatement ps =
//	    	    conn.prepareStatement( "SELECT ename from emp e WHERE e.emp_no = 7 AND e.sal = 8000" );
//
//	      ps.setString(1, "7");
//	      ps.setInt(2, 8000);
//
//	      ResultSet rs = ps.executeQuery();

	      // Loop through the result set
	      while( rs.next() ){
	         System.out.print( rs.getInt(1) ) ;
	         System.out.print("\t");
	         System.out.print( rs.getString("ename") ) ;
	         System.out.print("\t");
	         System.out.print( rs.getString(3) ) ;
	         System.out.println("\n");
	      }

	      // Close the result set, statement and the connection
	      rs.close() ;
	      stmt.close() ;
	      conn.close() ;
	     }
	  catch( SQLException se )
	     {
		  se.printStackTrace();
	      System.out.println( "SQL Exception:" ) ;
	     }
	  catch( Exception e )
	     {
	      System.out.println( e ) ;
	     }
	 }
}