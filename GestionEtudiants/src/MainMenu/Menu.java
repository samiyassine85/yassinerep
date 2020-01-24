package MainMenu;

import java.sql.ResultSet;
import java.util.Scanner;

import Traitement.GestionEtudiant;
import connecion.EtudiantDao;

public class Menu {
	boolean fin =true;
	 public void Mainmenu() {
		 while(fin) {
			 System.out.println("choisir l'operation : \n 1: pour ajouter \n 2: pour modifier \n 3: pour afficher \n 4: supprimer \n 5 : quiter") ;
			 Scanner c= new Scanner(System.in);
			 int i=c.nextInt();
			 switch (i) {
				 
				 case 1: {
					 GestionEtudiant ges1=new GestionEtudiant();
					 ges1.ajouterEtudiant();break;
			     }
				 
			     case 2: {
			    	 EtudiantDao ges2 = new EtudiantDao();
			    	 ges2.modifieretudiant();  break; 
					 
			      }
			     case 3 :
			    	 EtudiantDao aff = new EtudiantDao();
			    	 aff.affichage();break;
			    	 
			     case 4 :
			    	 EtudiantDao supp = new EtudiantDao();
			    	 supp.supprimer();break;
			     case 5 : {
			    	 fin=false;
			    	 System.out.println("bye");
			    //break;
			    	  
			      }
			 
		 }//fin switch
			
		
	 }		 
}
	 
		 
	
	 
	 
}
