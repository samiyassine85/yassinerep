package presentation;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class Adil implements ActionListener{

	//Yassine s= new Yassine();
		// TODO Auto-generated constructor stub
	

	Yassine s;
	public Adil(Yassine e) { // le constructeur de recopie  recopiera les valeurs de tous les membres de l'objet donné vers l'objet courant.
		s=e;
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("merci said");
	
		if(s.login.getText().equals("yassine"))
		{
			s.msg.setText("success");
		s.msg.setForeground(Color.green);
		
		}else {
			s.msg.setText("failed");
			s.msg.setForeground(Color.red);
		}
		
		}
		
			}
	


