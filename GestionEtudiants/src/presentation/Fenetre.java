package presentation;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Fenetre extends JFrame {
	public Fenetre() {
		getContentPane().setLayout(null);
		setVisible(true);
		setTitle("Bonsoir");
		setBounds(50, 50, 400, 300);
		
		JLabel lab1 = new JLabel("cocher les bonne reponses :");
		lab1.setBounds(10, 20, 200, 30);
		getContentPane().add(lab1);
		
		JCheckBox j1= new JCheckBox("A");
		JCheckBox j2= new JCheckBox("B");
		JCheckBox j3= new JCheckBox("C");
		
		
		j1.setBounds(180, 30, 100, 20);
		j2.setBounds(180, 50, 150, 20);
		j3.setBounds(180,70, 150, 20);
		getContentPane().add(j1);
		getContentPane().add(j2);
		getContentPane().add(j3);
		j1.setSelected(false);
		j2.setSelected(false);
		j3.setSelected(false);
}
}