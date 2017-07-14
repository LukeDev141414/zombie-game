
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Player extends Sprite{
	public ArrayList <Bullet> bullets = new ArrayList<Bullet>();
	public int l=0,r=0,u=0,d=0;
	public int glockDelay2 = 15;
	public int glockDelay = glockDelay2;
	public String currentWeapon = "Glock";
	public static int X,H;
	public static int Y,W;
	public static int life = 100;
	public int damage = 4;
	public Player() {
		images = new String[]{"player_left.png"};
	}
	
	public void Update()
	{
		
		if(glockDelay > 0)
		{
			
			glockDelay --;
		
			
		}
		X=x;
		Y=y;
		
		
		
		
	}
	public void paintFixed(Graphics g)
	{
		g.setColor(Color.CYAN);
	
		g.drawString("Current weapon: "+currentWeapon,0,400);
		g.setColor(new Color(220,220,220));
		g.fillRect(0,420,life,20);
		g.setColor(Color.white);
		g.drawString("Life: "+Integer.toString(Player.life),0,435);
		Player.W=w;
		Player.H=h;
		if(life <= 0)
		{
			
			dead = true;
			
		}
		if(currentWeapon=="AK-47")
		{
			
			glockDelay2 = 3;
			damage = 10;
			
		}
		if(currentWeapon=="M-16")
		{
			
			glockDelay2 = 0;
			damage = 5;
			
			
		}
		
	}
	public void shot()
	{
		
		
	Bullet b = new Bullet()	;
	b.x = x;
	b.y = y;
	if(Variables.playerWeapon=="glock")
	{
		if(glockDelay == 0)
		{
			if(l==1)
			{b.dx=-30;b.images = new String[]{Resources.glockBulletImageLeft};}
			else if(r==1)
			{b.dx=30;b.images = new String[]{Resources.glockBulletImageRight};}
			else if(u==1)
			{b.dy=-30;b.images = new String[]{Resources.glockBulletImageDown};}
			else if(d==1)
			{b.dy=30;b.images = new String[]{Resources.glockBulletImageDown};}
			bullets.add(b);
			glockDelay = glockDelay2;
		}
	}
		
	}

}
