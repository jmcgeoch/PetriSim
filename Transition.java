
/* IMPORTS */
import java.awt.*;

public class Transition
{
	private int currentX, currentY, dragX, dragY;
	private int identity;
	private int height = 60, width = 15;
	private Color rectColor = new Color (160, 200, 255);
	private Color bgColor = new Color (220,220,220);
	
	public Transition (int i, int x, int y)
    {
        identity = i;
        currentX = x;
        currentY = y;
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
		g.setColor(rectColor);
		g.drawRect(currentX, currentY, height, width);
	}
	
	public void remove(Graphics g)
	{
		g.setColor(bgColor);
	    g.fillRect(currentX, currentY, height, width);
	}
	
	public int getIdentity()
	{
		return identity;
	}
	
	public void outArc(Place place)
    {
        /* WIP */
	
    }

    public void inArc(Arc arc)
    {
        /* WIP */
    }

    public void removeOutArc(Place place)
    {
        /* WIP */
    }
    
    public void inArc(Arc arc)
    {
    	/* WIP */
    }
}
