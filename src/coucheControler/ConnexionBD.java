/**
 * 
 */
package coucheControler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 * @author Mamadou bobo
 *
 */
public final class ConnexionBD {
	
	private static Connection connection ;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DriverManager.getConnection
		   ("jdbc:mysql://localhost:3306/school_project1.0", "root", "Barry");
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
		ConnexionBD.connection = connection;
	}
	
	/*private Connection con;
	private static Connection connect;
	private void ConnexionBD() {
		String url=null;
		try {
			Class.forName("com.mysql.jdbc.Drive");
			System.out.println("Chargement du Driver ok");
			
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
		url="jdbc:mysql://localhost:3306/school_project";
		try {
			connect=DriverManager.getConnection(url , "root" , "Barry");
			System.out.println("Connexion bdd ok!!");
			
		}catch(SQLException ex) {
			System.out.println(ex.toString());
		}
	}
	
	public Connection getcon() {
		return con;
	}
	public static Connection getConnexion() {
		if(connect==null) {
			new ConnexionBD();
			System.out.println("Connexion bdd ok!!");
		}
			
		return connect;
	}*/

}
