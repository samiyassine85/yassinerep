package authentification;

import java.awt.Color;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import Entities.Etudiant;

public class Interroger implements ActionListener  {
// on a crer cet objet pour appler la methode ajouter de la classe ajout
	
	Interrogerforms i;

	public Interroger(Interrogerforms e) {
		
		i=e;
	}

	
	public void actionPerformed(ActionEvent arg0) {
		Etudiant ee = new Etudiant();
		Ajout aj= new Ajout();
		System.out.println("start..........................");
		if (i.j1.getText().length()==0 || i.j2.getText().length()==0 || i.j3.getText().length()==0 || i.j4.getText().length()==0) {
		i.msg.setText("entrer les infos de l'etudiant");
		i.msg.setForeground(Color.RED);
		}
		else {
		ee.cne =Integer.parseInt(i.j1.getText());
		ee.nom =i.j2.getText();
		ee.prenom= i.j3.getText();
		ee.note=Double.parseDouble(i.j4.getText());
		
		aj.ajouter(ee);// appel de la methode ajouter
        i.msg.setText("ajout avec succes");
        i.j1.setText("");
        i.j2.setText("");
        i.j3.setText("");
        i.j4.setText("");
	}
		}
	

}
