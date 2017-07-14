import java.awt.*;
import java.util.Random;
import java.util.ArrayList;
public class ZombieGenerator {

	public int x;
	public int y;
	public ArrayList<Zombie> zombies = new ArrayList<Zombie>();
	public int delay = 0;
	public int period = 50;
	
	public ZombieGenerator(int X, int Y) {
		x=X;y=Y;
	}
	public void generate()
	{
		
		Zombie z = new Zombie();
		z.x=-50;
		z.y = new Random().nextInt(200)+240;
		zombies.add(z);
		System.out.println("Zombie generated");
		
		
	}
	public void paint(Graphics g)
	{
		
		if(delay>0)
		{
			
			delay -= 1;
			System.out.println("Time till next generating: "+Integer.toString(delay));
			
		}
		else{generate();delay = period; period -= 1;System.out.println(Integer.toString(period));}
		for(Zombie serverant:zombies)
		{
			
			serverant.paint(g);
			
		}
		
	}

}
