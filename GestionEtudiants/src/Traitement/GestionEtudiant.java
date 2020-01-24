package Traitement;

import java.util.Scanner;
import java.util.Vector;
import Entities.*;
import connecion.EtudiantDao;
public class GestionEtudiant {
Scanner sc = new Scanner(System.in);
	public Vector v = new Vector<>();
	
	
public 	Vector ajouterEtudiant()
	{
	while(true)
	{
		Etudiant e = new Etudiant();
		System.out.println("veuillez saisir le nom");
		 e.nom =sc.next();
		 System.out.println("veuillez ajouter le prenom");
		 e.prenom=sc.next();
		System.out.println("veuillez saisir la  note");
		 e.note= sc.nextDouble();
			
				EtudiantDao dao= new EtudiantDao();// on cree un objet de la classe EtudiantDao qui va executer la methode ajoutetudiant 
				dao.AjoutEtudiant(e);
				v.add(e);
						
				System.out.println("Etudaint ajouté avec succes");
				System.out.println("Quitter O/N");
				if(sc.next().equalsIgnoreCase("O"))
					break;
for (int i = 0; i < v.size(); i++) {
		Etudiant r = new Etudiant();
		r = (Etudiant)v.get(i);
		
		System.out.println(r.nom + "=====>" + r.note);
	}
	
	}
		
		return v;
	}


	
}
