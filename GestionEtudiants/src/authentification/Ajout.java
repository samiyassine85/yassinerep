package authentification;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

import Entities.Etudiant;

public class Ajout {
	Connection cnx;
	ResultSet rs;
	Statement st;
	public Ajout()
	{
		String chaine ="jdbc:mysql://localhost:3306/gestionetudiant";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("chargemment avec succés");
		} catch (ClassNotFoundException e1) {
			System.out.println("probléme driver");
			e1.printStackTrace();
		}///catch1
			
		try {
		
			cnx = (Connection) DriverManager.getConnection(chaine, "root", "");
			System.out.println("succes");
		
		
		}
		
		 catch (SQLException e1) {
			
			 System.out.println("prb de connection");

	}
		
		
	}
	
	 public void ajouter(Etudiant a) {
		 try {
			st = (Statement)cnx.createStatement();
			 System.out.println("statement ok");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			 System.out.println("problem statement ");
			e.printStackTrace();
		}
		try {
			int i =st.executeUpdate("INSERT INTO etudiant(cne,nom, prenom, note) VALUES ("+a.cne+",'"+a.nom +"','"+a.prenom+"',"+a.note+")");
	        System.out.println("......................  " + i);
	
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("prb de requete");
			e.printStackTrace();
		}
		 
	 }
	
	
}
