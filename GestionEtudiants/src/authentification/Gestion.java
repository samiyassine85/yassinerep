package authentification;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JLabel;

import com.mysql.jdbc.Connection;
 
public class Gestion implements ActionListener{


Acces a;
Methode met= new Methode();

	public Gestion(Acces e) {
		a=e;

	}
	
	public void actionPerformed(ActionEvent arg0) {
		 Methode met= new Methode();
       if  (met.verification(a.login.getText(),a.pw.getText())){
		  a.verif.setText("authentification reussite");
		  Interrogerforms in= new Interrogerforms(); 
	
		  a.hide();
		  }
      
		  else {
			  a.verif.setText("mot de passe incorrecte");}
    	   
       }
         

		
	/*	String chaine ="jdbc:mysql://localhost:3306/gestionetudiant";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("chargemment avec succés");
		} catch (ClassNotFoundException e1) {
			System.out.println("probléme driver");
			e1.printStackTrace();
		}///catch1
			
		try {
		
			cnx = (Connection) DriverManager.getConnection(chaine, "root", "");
			a.message.setText("connection avec sucés");
		
			st= (Statement)cnx.createStatement();
			rs=st.executeQuery("select login, password from user");
			while(rs.next()) {
			
			    String logrecup = rs.getString("login");
				String log= a.login.getText();
				String pwrecup= rs.getString("password");
				String pw =a.pw.getText();
			
			if(logrecup.equals(log) & pwrecup.equals(pw)) {
				a.verif.setText(" authentification reussite");
				a.verif.setForeground(Color.GREEN); // break;
			}
				else	{
					
				a.verif.setText("login ou mot de passe incorrecte ");
				a.verif.setForeground(Color.RED);}
				
			}}
		
		 catch (SQLException e1) {
			a.message.setText("probléme de cnx ");
			//e1.printStackTrace();
		}////catch2
	//	
		
	
	
	*/
		
		
		
	}
	
		
		
	
	
			 // a.login.getText().equals(a.login.getText());
	

		
		
		
	
	


