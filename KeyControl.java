import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
public class KeyControl implements KeyListener{
	public Main m;
	public KeyControl(Main M) {
		// TODO Auto-generated constructor stub
		m=M;

	}
	Player p;
	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode()==KeyEvent.VK_G)
		{
			
			Main.dr.sc.dead=true;
			
		}
		if(arg0.getKeyCode()==KeyEvent.VK_LEFT&&Main.dr.sc.dead)
		{
			
			Main.dr.p.dx=-Variables.pSpeed;
			Main.dr.p.dy=0;
			Main.dr.p.images = new String[]{Resources.playerLeft};
			Main.dr.p.l=1;
			Main.dr.p.r=0;
			Main.dr.p.u=0;
			Main.dr.p.d=0;
			
			
		}
		if(arg0.getKeyCode()==KeyEvent.VK_RIGHT&&Main.dr.sc.dead)
		{
			
			Main.dr.p.dx=Variables.pSpeed;
			Main.dr.p.dy=0;
			Main.dr.p.images = new String[]{Resources.playerRight};
			Main.dr.p.l=0;
			Main.dr.p.r=1;
			Main.dr.p.u=0;
			Main.dr.p.d=0;
			
		}
		if(arg0.getKeyCode()==KeyEvent.VK_UP&&Main.dr.sc.dead)
		{
			
			Main.dr.p.dy=-Variables.pSpeed;
			Main.dr.p.dx=0;
			Main.dr.p.images = new String[]{Resources.playerUp};
			Main.dr.p.l=0;
			Main.dr.p.r=0;
			Main.dr.p.u=1;
			Main.dr.p.d=0;
		}
		if(arg0.getKeyCode()==KeyEvent.VK_DOWN&&Main.dr.sc.dead)
		{
			
			Main.dr.p.dy=Variables.pSpeed;
			Main.dr.p.dx=0;
			Main.dr.p.images = new String[]{Resources.playerDown};
			Main.dr.p.l=0;
			Main.dr.p.r=0;
			Main.dr.p.u=0;
			Main.dr.p.d=1;

		}
		if(arg0.getKeyCode()==KeyEvent.VK_SPACE)
		{
			
			Main.dr.p.shot();
			
		}
		
		
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
	
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
