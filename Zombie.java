
import java.awt.geom.Rectangle2D;



import java.util.Random;

public class Zombie extends Sprite {
	public int delay = 200, delay2 = 0;
	public int dx2 = 0, dy2 = 0;
	public int stopDelay = 0;
	public int life = 10;
	public int speed = Variables.zombieSpeed*new Random().nextInt(4)+1;
	public int dmg = 3+new Random().nextInt(2);

	public Zombie() {

		images = new String[] { "zombie_left.png" };
		id = "zombie";
		System.out.println(speed);

	}

	public void Update() {

		if (x < Player.X) {

			dx = Variables.zombieSpeed;
			dy = 0;

		}
		if (x > Player.X) {

			dx = -Variables.zombieSpeed;
			dy = 0;

		}
		if (y > Player.Y) {

			dx = 0;
			dy = -Variables.zombieSpeed;

		}
		if (y < Player.Y) {

			dy = Variables.zombieSpeed;
			dx = 0;

		}
		
		if(life <= 0)
		{
			x-= 1000;
			y -= 10000;
			
			
		}
		if (dx > 0) {

			images = new String[] { "zombie_left.png" };

		}
		if (dx < 0) {

			images = new String[] { "zombie_right.png" };

		}
		if (dy > 0) {

			images = new String[] { "zombie_down.png" };

		}
		if (dy < 0) {

			images = new String[] { "zombie_up.png" };

		}
		if (x < Player.X) {
			dx = Variables.zombieSpeed;

		} else {
			dx2 = 0;
		}
		if (x > Player.X) {
			dx = -Variables.zombieSpeed;

		} else {
			dx2 = 0;
		}
		x += dx2;
		y += dy2;
		if (delay2 > 0) {

			delay2 -= 1;
		} else {

			dx2 = 0;
			dy2 = 0;

		}
		try{
		if(collide(Main.dr.p))
		{
			Main.dr.p.life -= dmg;
			
		}}catch(Exception e){}
		if (delay > 0) {

			delay -= 1;
			/// System.out.println(delay);

		} else {
			separate();
			delay = new Random().nextInt(150);
			delay2 = 55;
		}
		/*
		 * if(collide2(new Rectangle2D.Float(Player.X,Player.Y,
		 * Player.W,Player.H)))
		 * 
		 * { dx=0; dy=0; dx2=0; dy2=0; Player.life -= 3;
		 * 
		 * }
		 */
		if(Player.life <= 0 )
		{
			
			x -= dx;
			y -= dy;
			
		}

	}

	public void separate() {

		dx2 = new Random().nextInt(2);
		dy2 = new Random().nextInt(2);
		// System.out.println(dx2+"____"+dy2);
	}
	public void separate2() {

		dx2 = new Random().nextInt(3);
		dy2 = new Random().nextInt(3);
		// System.out.println(dx2+"____"+dy2);
	}

}
