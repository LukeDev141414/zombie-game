import java.awt.*;
import javax.swing.*;
public class Drawing extends JPanel{
	public StartCreen sc;
	public Player p = new Player();
	public Map m = new Map();
	
	public ZombieGenerator zg =  new ZombieGenerator(-50,0);
	Main M;
	public Drawing(Main m) {
		sc = new StartCreen();
		M = m;
		p.x = 0;
		p.y =  200;
		
	
		
		
	}
	public void paint(Graphics g)
	{
		
		
		g.fillRect(0, 0, Variables.width, Variables.height);
		g.drawImage(new ImageIcon("road.png").getImage(),0,250,null);
		g.drawImage(new ImageIcon("crashed_car.png").getImage(),0,300,null);
		
		sc.paint(g);
		
		
		
		if (sc.dead==true)
				{
					m.paint(g);
					p.paint(g);
					zg.paint(g);
					try{
					for(Bullet playerBullet : p.bullets)
					{
						
						for(Zombie z : zg.zombies)
						{
							
							if(playerBullet.collide(z))
							{
								
								z.life -= 4;
								playerBullet.x -= 1000;
								playerBullet.y -= 1000;
								
							}
							
							
							
						}
						
						
					}
					
					}catch(Exception e){}
					for(Sprite b:m.sprites)
					{
						if(b.id=="block"||b.id=="block2")
						{
							
							if(p.collide(b))
							{
								p.x -= p.dx;
								p.y -= p.dy;
								
							}
							
						}
						if(b.id=="ak-47 icon")
						{
							
							if(b.collide(p))
							{
								
								p.currentWeapon = "AK-47";
								
								b.x -= 1090;
								b.y -= 10000;
								
							}
							
						}
						if(b.id=="m-16 icon")
						{
							
							if(b.collide(p))
							{
								
								p.currentWeapon = "M-16";
						
								b.x-=1999;
								b.y -= 16789;
								
							}
							
						}
				
						try{	
						for(Bullet B:p.bullets)
						{
							
							if(B.collide(b))
							{
								
								B.dead=true; 
								if(b.id=="block2")
								{
									
									b.dead=true; 
									
								}
								
							}
							
						}
						}catch(Exception e){}
						
						
					}
					
					
					
				}
		
		for(Bullet b : p.bullets)
		{
			
			b.paint(g);
			
		}
		
		
		
	}

}
