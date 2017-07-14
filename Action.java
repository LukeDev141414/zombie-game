import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Action implements ActionListener{
	Main M;

	public Action(Main m) {
		// TODO Auto-generated constructor stub
		M = m;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		M.repaint();
		
	}

}
