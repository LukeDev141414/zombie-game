import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.Rectangle2D;

public class Sprite extends JPanel {

	public int x;
	public int y;
	public int w;
	public int h;
	public Rectangle2D rect;
	public boolean dead;
	public ImageIcon img;
	public String[] images;
	public Image ii;
	public int dx;
	public int dy;

	public String id;

	public Sprite() {

	}
	
	public void Update(){}
	public void paintFixed(Graphics g){}
	public void paint(Graphics g) {
		Update();
		
		paintFixed(g);
		if (!dead) {

			x += dx;
			y += dy;
			for (int i = 0; i < images.length; i++) {

				img = new ImageIcon(images[i]);
				ii = img.getImage();

				g.drawImage(ii, x, y, null);

			}
			w = ii.getWidth(null);
			h = ii.getHeight(null);
			rect = new Rectangle2D.Double((double) x, (double) y, (double) w, (double) h);

		}
		else{w=0;h=0;}
	}
	public boolean collide2(Rectangle2D s2) {

		
		return rect.getBounds().intersects(s2.getBounds());

	}
	public boolean collide(Sprite s2) {

		Rectangle2D rect2 = new Rectangle2D.Double((double) s2.x, (double) s2.y, (double) s2.w, (double) s2.h);
		return rect.getBounds().intersects(rect2.getBounds());

	}

}
