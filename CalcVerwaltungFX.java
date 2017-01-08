package verwaltungFX;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class CalcVerwaltungFX {
	static ResultSet rs;
	
	public static Vector getData() throws ClassNotFoundException, SQLException{
		Connection conn =connect();
		
		Vector rueck = new Vector();
		while(rs.next()){
			rueck.add(rs.getString("Titel"));
		}
		
		
		conn.close();
		
		
		return rueck;		
	}
	
	
	
	
	public static Connection connect() throws ClassNotFoundException{
		// load the sqlite-JDBC driver using the current class loader
	    
		Class.forName("org.sqlite.JDBC");
	    Connection connection = null;
	        
	      // create a database connection
	      try {
			connection = DriverManager.getConnection("jdbc:sqlite:MovieDB.db");
			Statement statement = connection.createStatement();
		      statement.setQueryTimeout(30);  // set timeout to 30 sec.
		      rs = statement.executeQuery("select * from film");
		      
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	  return connection; 
	   
	}
	
	public static String[] getEintragData(int id){
		
		String rueck = "";
		
		String[] rueckArray = new String[5];		
		try {
			Connection conn =connect();
			Statement statement = conn.createStatement();
			rs = statement.executeQuery("Select * from film where id =" + Integer.toString(id));
			rueckArray[0] = rs.getString("Titel");
			rueckArray[1] = rs.getString("StoryLine");
			rueckArray[2] =  rs.getString("ReleaseDate"); 
			rueckArray[3] =  rs.getString("RunTime");
			rueckArray[4] =  rs.getString("Country");			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rueckArray;
	}

}
