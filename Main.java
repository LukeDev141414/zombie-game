import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Main extends JFrame{
	public static Drawing dr;
	public KeyControl kc = new KeyControl(this);
	public Action act = new Action(this);
	public Main() {
		
		init();
	}
	public void init()
	{
		
		setSize(Variables.width,Variables.height);
		setTitle(Variables.title);
		setVisible(Variables.visible);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cp = getContentPane();
		requestFocus();
		addKeyListener(kc);
		ActionListener updateTask = new ActionListener()
				{
			
			public void actionPerformed(ActionEvent arg0) {
				repaint();
				
				
			}
			
				};
				new Timer(50,updateTask).start();
		dr = new Drawing(this);
	    
		cp.add(dr);
		
		
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable()
		{
			@Override
			public void run(){
				
				
				new Main();
				
			}
			
			
		});
		
	}

}
