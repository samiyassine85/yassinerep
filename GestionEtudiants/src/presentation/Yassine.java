package presentation;

import java.awt.MenuBar;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Yassine extends JFrame {
	public JTextField login;
	public JTextField pw;
	//JPanel p;
	public JLabel msg= new JLabel();
	
public Yassine() {//creation de febetre(objet fenetre)
	setVisible(true);
	setTitle("Bonjour");
	
	//setAlwaysOnTop(true);//fenêtre au premier plan
	//setBounds(0, 0, 500, 400);//(x,y sont lq position par rapport a lecran) (z,h weight et height) de la fenntere appelee yassine
	
	//// ImageIcon okimg =new ImageIcon("C:\button.jpeg");
	
	JButton ok =new JButton("ok");
	//ok.addActionListener(new Adil());//on ajoute au boutton ok actionlistner qui est une methode(clique)de l'interface ActionListener 
	JButton annuler =new JButton("Annuler");
	JLabel lab1 =new JLabel("Login :");
	JLabel lab2 = new JLabel("mot de passe :");
    login = new JTextField();
	 pw = new JTextField();
	setBounds(400,100, 500, 400);

	msg.setBounds(80, 80, 100, 50);
	
	ok.addActionListener(new Adil(this));//on envoie l objet courant -fenetre- au clqsse Adil
		
	//	p=(JPanel) getContentPane();
	

//	JPanel p = new JPanel();
//	JPanel p=getContentPane();
	
	lab1.setBounds(90, 60, 100, 50);
	login.setBounds(250, 70, 100, 30);
	
	
	
	lab2.setBounds(90, 120, 100, 50);
	pw.setBounds(250, 120, 100, 30);
	
	 JLabel label3 = new JLabel("Genre :");
	 label3.setBounds(90, 180, 100, 50);
	 getContentPane().add(label3);
	
	ok.setBounds(90, 250, 100, 40);
	annuler.setBounds(250, 250, 100, 40);
	
	getContentPane().setLayout(null);// fenetre personalise
	getContentPane().add(lab1);// ajouter les objet crees boutton label... au container principale de la fenetre
	getContentPane().add(login);
	getContentPane().add(lab2);
	getContentPane().add(pw);
	getContentPane().add(ok);
	getContentPane().add(annuler);
	getContentPane().add(msg);
	
	
	//setVisible(true);
	//getContentPane().add(p);
	
	 JMenuBar menubar= new JMenuBar(); 
	 
	 JMenu m1 = new JMenu("Fichier");
	 JMenu m2 = new JMenu("Edition");
	 JMenu m3 = new JMenu("Help");
	 
	 //fichier
	 JMenuItem item1 = new JMenuItem("nouveau");
	 JMenuItem item2 = new JMenuItem("ouvrir");
	 JMenuItem item3 = new JMenuItem("importer");
	 
	 //Edition
	 JMenuItem item4 = new JMenuItem("Copier");
	 JMenuItem item5 = new JMenuItem("Coller");
	 //help
	 JMenuItem item6 = new JMenuItem("online help");
	 //menu Fichier	 
   m1.add(item1);
   m1.add(item2);
   m1.add(item3); 
   // menu Edition
   m2.add(item4);
   m2.add(item5);
   
   //menu help
   m3.add(item6);
   
   menubar.add(m1);
   menubar.add(m2);
   menubar.add(m3);
   
   getContentPane().add(menubar);//ajouter au contenair
  menubar.setBounds(0, 0, 500, 20);
  // setVisible(true);
 setResizable(false);//fenetre inmodifiqble
 
 JRadioButton h= new JRadioButton("Homme");
 JRadioButton f= new JRadioButton("Femme");
 ButtonGroup g1= new ButtonGroup();
 g1.add(f);g1.add(h);

 


 

 f.setBounds(250, 190, 150, 20);
 h.setBounds(250, 210, 150, 20);
 getContentPane().add(f);
 getContentPane().add(h);
 
}

	
}

