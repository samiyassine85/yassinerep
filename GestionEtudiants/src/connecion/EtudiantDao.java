package connecion;
    import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
	import com.mysql.jdbc.Statement;
	import Entities.Etudiant;

public class EtudiantDao {
	Scanner clavier= new Scanner(System.in);
		
		// crée une connection (lien)vers nue base de données
	 Connection cnx;
		//pour envoyer est exécuter des reqûete sql
	 Statement st;
	    //récuperation des resultats 
	ResultSet rst;
	public EtudiantDao() {// CONSTRUCTEUR CONNECTION
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
				System.out.println("cnx avec sucés");
			} catch (SQLException e1) {
				System.out.println("probléme de cnx ");
				e1.printStackTrace();
			}////catch2
		
	}
	
	public  void AjoutEtudiant(Etudiant e) {//ajoutEtudiant
	

		
		try {st = (Statement) cnx.createStatement();
			int i = st.executeUpdate("insert into etudiant(cne,nom,prenom,note,notemoyenne) values("+e.cne+",'"+e.nom+"','"+e.prenom+"',"+e.note+","+e.notemoyenne+")");
			System.out.println("Enregistrement avec succée : "+i);
		} catch (SQLException e1) {
		System.out.println("prb d'enregistrement ");
			e1.printStackTrace();
		}
		
	}
		 public void modifieretudiant() { //modificationEtudiant
			
			 int code;
			double  nnote;
			
			System.out.println("saisir le code etudiant que vous voulez modifier sa note");
			code=clavier.nextInt();
			System.out.println("saisir  la nouvelle note");
			nnote=clavier.nextDouble();
			 
				 try {
					st=(Statement) cnx.createStatement();
					 int s = st.executeUpdate("update etudiant set note =  "+nnote+" where cne = "+code);
					 System.out.println("modification avec succes" +s);
				} catch (SQLException e) {
					System.out.println("probleme de modification");
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			 
		 }
		 
		 public void  affichage() {
			// ResultSet rst;
			 try {
				st=(Statement) cnx.createStatement();
				 rst=st.executeQuery("select * from etudiant");
				 while(rst.next()) {
					 System.out.println(rst.getInt(1)+" "+ rst.getString(2)+" "+ rst.getString(3));
					 
				 } 
			 }
				 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			 
		 }
		 public void supprimer() {
			 int num;
			 System.out.println("entrer le code d'etudiant a supprimer");
			 num = clavier.nextInt();
			 
			 try {
				 st=(Statement) cnx.createStatement();
				int s=st.executeUpdate("delete from etudiant where cne = " +num);
				System.out.println("suppression avec succes"  +s);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 
			 
		 
	
		
/*	public void modifiernote() {
		int code;
		double notej;
		
		try {
			st=(Statement) cnx.createStatement();
			int m=st.executeUpdate("update etudiant(note) whe)
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 */
		
	
	
}