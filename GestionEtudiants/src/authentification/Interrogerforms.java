package authentification;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.im.InputContext;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;

import Entities.Etudiant;

public class Interrogerforms extends JFrame{
	public JTextField j1;
	public   JTextField j2;
	public JTextField j3;
	public  JTextField j4;
	public JLabel msg;
	public JLabel msg2;
	public Interrogerforms() {
		
		JPanel pan1 = new JPanel();
		
		setVisible(true);
		setTitle("Gestion Etudiant");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// termine le proccessus lorsque on clique sur le croix roouge
		setLocationRelativeTo(null);
		pan1.setBackground((Color.CYAN));
		setContentPane(pan1);
		setBounds(400,100, 500, 600);
		JLabel l1= new JLabel("Cne   :");
		
		JLabel l2= new JLabel("Nom   :");
		 
		 JLabel l3= new JLabel("Prenom   :");
		 JLabel l4= new JLabel("Note   :");
		 
		  msg = new JLabel("");
		 msg2 = new JLabel("");
		// JLabel l5= new JLabel("Note Moyenne   :");
		 
		// l1.setBounds(90, 40,  100, 50);
		  l1.setBounds(90, 40, 100, 50);
		  l2.setBounds(90, 90,  100, 50);
		  l3.setBounds(90, 140, 100, 50);
		  l4.setBounds(90, 190, 100, 50);
		 msg.setBounds(90, 30, 250, 50);
		 msg2.setBounds(120, 30, 250, 50);
		// l5.setBounds(90, 240, 100, 50);
		//j1.addMouseListener(new MouseListener() {
			
			
				
		
		 //});
         j1= new JTextField();
          j2= new JTextField();
          j3= new JTextField();
          j4= new JTextField();
       //  JTextField j5= new JTextField();
         
       //  j1.setBounds(240,50, 150, 30);
        
          j1.setBounds(240, 50, 150, 30);
          j2.setBounds(240,100, 150, 30);
         j3.setBounds(240,150, 150, 30);
         j4.setBounds(240,200, 150, 30);
      //   j5.setBounds(240,250, 150, 30);
         
         
        ImageIcon okimg =new ImageIcon("ajouter.png");
         
        JButton b1 = new JButton(okimg);
       
         JButton b2 = new JButton("Chercher");
         JButton b3 = new JButton("Supprimer");
         JButton b4 = new JButton("Modifier");
         JButton b5 = new JButton("Annuler");
        // b3.addActionListener(new Actionsupp(this));
         
         b3.addActionListener(new Supprimer(this));
         
         
         b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
         });
         b1.setBackground(Color.yellow);
         b2.setBackground(Color.yellow);
         b3.setBackground(Color.yellow);
         b4.setBackground(Color.yellow); 
         b5.setBackground(Color.yellow);
         
         b1.addActionListener(new Interroger(this));
         
         
         b2.addActionListener(new ActionListener() {
			
			Statement st;
			ResultSet rs;
			Connection cnx;
public void chercher() {
				Etudiant eee= new Etudiant();
				 if  (j1.getText().length()==0)   {
						msg.setText("Entrer un cne ");
						msg.show();
					}
				 else {
				eee.cne=Integer.parseInt(j1.getText());
				//eee.nom = j2.getText();
				
				String requete=("select * from etudiant where cne = '"+eee.cne+"'");
				try {
					st=(Statement)cnx.createStatement();
					rs = st.executeQuery(requete);
				
					
					
					
					  if (rs.next())
         {
				   msg.hide();	
				   
				    j1.setText(rs.getString(1));
					j2.setText(rs.getString(2));
					j3.setText(rs.getString(3));
					j4.setText(rs.getString(4));
					msg2.hide();
					 
         }
				
					
					else {
						msg2.show();
						System.out.println("......................hh........");
						msg2.setText("Etudiant n'exciste pas!");
						j1.setText(null);
						j2.setText(null);
						j3.setText(null);
						j4.setText(null);
					}
					
				
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				System.out.println("statment ok");
			
				
				
				
				
			
				 }
			
			}
			public void actionPerformed(ActionEvent arg0) {
				
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
				
				 catch (SQLException e1){
					
					 System.out.println("prb de connection");

				 }
				chercher();
				
				
			
			
			}
         });
         
        
         
         
         b1.setBounds(90, 350, 90, 40);
         b2.setBounds(90, 400, 90, 40);
         b3.setBounds(180, 350, 100, 40);
         b4.setBounds(180, 400, 100, 40);
         b5.setBounds(280, 375, 90, 40);
        
        // pan1.setLayout(new FlowLayout());
         
         getContentPane().setLayout(null);
        
		// getContentPane().add(l1);
		pan1.add(b1);
		pan1.add(b2);
		pan1.add(b3);
		pan1.add(b4);
		pan1.add(b5);
		pan1.add(l1);
		pan1.add(j1);
		pan1.add(l2);
		pan1.add(l3);
		pan1.add(l4);
		pan1.add(j2);
		pan1.add(j3);
		pan1.add(j4);
      pan1.add(msg);
      pan1.add(msg2);
      msg.setForeground(Color.blue);
      msg2.setForeground(Color.green);
         /*getContentPane().add(l2);
		 getContentPane().add(l3);
		 getContentPane().add(l4);
		// getContentPane().add(l5);
		 
		// getContentPane().add(j1);
		 getContentPane().add(j2);
		 getContentPane().add(j3);
		 getContentPane().add(j4);
		// getContentPane().add(j5);
		// getContentPane().add(b1);
		 getContentPane().add(b2);
		 getContentPane().add(b3);
		 getContentPane().add(b4);
		 getContentPane().add(b5);*/
		 
		
		
	}

}
