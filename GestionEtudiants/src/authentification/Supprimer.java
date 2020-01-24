package authentification;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import Entities.Etudiant;

public class Supprimer implements ActionListener{
	Interrogerforms s;
	
	public Supprimer(Interrogerforms e) {
		s=e;
		
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Suppdao p =new Suppdao();
		Etudiant zz= new Etudiant();
	//zz.cne=Integer.parseInt(s.j1.getText());
      p.delete(zz.cne);
      System.out.println("etudiant " + zz.cne + " est supprimé");

	}   

}
