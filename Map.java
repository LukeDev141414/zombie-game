import java.util.*;
import java.awt.*;
public class Map {
	public ArrayList<Sprite> sprites = new ArrayList<Sprite>();
	public ArrayList<Zombie> zombies = new ArrayList<Zombie>();
	public int[] level1 = {
			1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
			1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
			1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
			0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
			0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,1,0,0,0,6,0,0,0,6,0,0,0,0,0,6,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,0,0,0,0,0,
			0,0,0,0,5,0,0,0,4,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,
			0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,6,0,0,0,
			0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,
			1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,
			1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,
			1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
			
			
			
			
			
	};
	
	public Map() {
		int x = -40;
		int y = -40;
		
		for(int i:level1)
		{
			x += 40;
			
			
			if(x==800)
			{
			x=0;
			y+=40;
				
			}
			
			if(i==1)
			{
				
				Tree b = new Tree();
						b.x = x;
						b.y = y;
				sprites.add(b);
				
			}
			if(i==2)
			{
				
				Box b2 = new Box();
						b2.x = x;
						b2.y = y;
				sprites.add(b2);
				
			}
			if(i==3)
			{
				
				Block b3 = new Block();
						b3.x = x;
						b3.y = y;
				sprites.add(b3);
				
			}
			if(i==4)
			{
				
				AKIcon b3 = new AKIcon();
						b3.x = x;
						b3.y = y;
				sprites.add(b3);
				
			}
			if(i==5)
			{
				
				M16Icon b3 = new M16Icon();
						b3.x = x;
						b3.y = y;
				sprites.add(b3);
				
			}
			if(i==6)
			{
				
				Zombie b3 = new Zombie();
						b3.x = x;
						b3.y = y;
				zombies.add(b3);
				
			}
			
		}
	}
	public void generate()
	{
		
		
		
	}
	public void paint(Graphics g)
	{
		try{
		for(Sprite s:sprites)
		{s.paint(g);}}catch(Exception e){}
		try{
			for(Zombie s:zombies)
			{
				
				
				s.paint(g);
				if(s.collide(Main.dr.p))
				{
					Player.life -= 3;
					s.dx=0;
					s.dy=0;
					s.dx2=0;
					s.dy2 = 0;
					s.x -= s.dx;
					s.y -= s.dy;
					s.x -= s.dx2;
					s.y -= s.dy2;
					s.stopDelay = 15;
					
				}
				for(Bullet b:Main.dr.p.bullets)
				{
					
					if(s.collide(b))
					{
						
						s.life -= 4;
						b.dead=true;
						b.x-=1000;
						b.y -= 1000;
						
					}
					
				}
			
			
			}}catch(Exception e){}
		
	}

}
