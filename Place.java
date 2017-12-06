
/* IMPORTS */
import java.awt.*;

public class Place
{
	private int currentX, currentY, dragX, dragY;
	private int tokenCount;
	private int identity;
	private int SIZE = 60;
	private Color ovalColor = new Color (160, 200, 255);
	private Color bgColor = new Color (220,220,220);
	
	public Place(int i, int x, int y)
	{
		identity = i;
		currentX = x;
		currentY = y;
		
		tokenCount = 0;
	}
	
	public void dragStart(int x, int y)
	{
		dragX = x;
		dragY = y;
	}
	
	public void dragEnd(int x, int y)
	{
		drag(currentX + (x - dragX), currentY + (y = dragY));
		dragX = x;
		dragY = y;	
	}
	
	public void drag(int x, int y)
	{
		currentX = x;
		currentY = y;
	}
	
	public void paint(Graphics g) 
	{
		/* removes the previous place - if there is any */
		remove(g);
		
		/* draw shape and set color of the oval */
		g.setColor(ovalColor);
		g.drawOval(currentX, currentY, SIZE, SIZE);
		
		/* draws the token and if place has more than 1 token, write the number of tokens */
		if (tokenCount > 0)
		{
		    g.drawOval(currentX + SIZE/2, currentY + SIZE/2, 10, 10);
		    if (tokenCount > 1)
		    {
		    	g.drawString((new Integer(tokenCount)).toString(), currentX + SIZE/2, currentY + SIZE/2);
		    }
		}
	}
	
	public void remove(Graphics g)
	{
		g.setColor(bgColor);
	    g.fillRect(currentX, currentY, SIZE, SIZE);
	}
	
	public int getIdentity()
	{
		return identity;
	}
	
	public void outArc(Transition t)
	{
		/* Arc arc = new Arc(this, t);
		t.addInArc(arc); */
	}
	
	public void removeOutArc(Transition t)
	{
		/* WIP */
	}
	
	public void addToken()
	{
		tokenCount++;
	}
	
	public boolean removeToken() 
	{
		if (tokenCount > 0) 
		{
			tokenCount--;
			return true;
		}
		else return false;
	}
	
	public int getTokenCount() 
	{
		return tokenCount;
	}

}
