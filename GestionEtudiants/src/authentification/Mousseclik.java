package authentification;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mousseclik implements MouseListener {

	
	
	Interrogerforms i;
	
	public Mousseclik(Interrogerforms e) {
		i=e;
		
	}
	
	public void mouseClicked(MouseEvent arg0) {
		
		if(i.j1.getText().equals("tap here your CNE"))
		i.j1.setText(null);	
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
