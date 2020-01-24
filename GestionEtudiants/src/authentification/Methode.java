package authentification;

import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Methode {
	
	Connection cnx;
	ResultSet rs;
	Statement st;
	
	public Methode() {
	
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
		//a.message.setText("connection avec sucés");
	
	}
	
	 catch (SQLException e1) {
		//a.message.setText("probléme de cnx ");
		 System.out.println("");

}}

	public boolean verification(String ch1 , String ch2)  {
		
		
			try {
				st= (Statement)cnx.createStatement();
				System.out.println("statement ok ");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		try {
			rs=st.executeQuery("select password from user where login ='" +ch1 + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("prbleme de requete");
		}
		
		try {
			while(rs.next()) {
	
			    String pwrecup = rs.getString("password");
				
			
			if(pwrecup.equals(ch2)) {
				return true;
			}
				else	{
					
					return false;
					
				
			}
			
                            }
		} catch (SQLException e) {
			
			System.out.println("prb");
		}
	
	    return false;}

	
}