package coucheControler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 

public class DataBaseConnection {
	
	private static Connection connection ;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection
		   ("jdbc:mysql://localhost:3306/School_Project", "root", "root224");
			System.out.println("Hello World !!! la Connextion est etablie !!!");
		
		//	Statement stat = connection.createStatement();
			
			//ResultSet result = stat.executeQuery("select *from Categorie");
			 
			//System.out.println("\n---------Manipulaption de la tables Categorie ---------\n");
			/*
			while(result.next()) {
				System.out.println("Le num categorie :  "+result.getString("ID_Categorie") 
				+"  Le nom Categorie : " + result.getString("Nom_Categorie"));
			}
			
 */
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}
	public static void setConnection(Connection connection) {
		DataBaseConnection.connection = connection;
	}
	


}
