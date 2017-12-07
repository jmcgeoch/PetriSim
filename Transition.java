
/* IMPORTS */
import java.awt.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Transition extends Pane
{
	private int currentX, currentY, dragX, dragY;
	private int identity;
	private double height = 60.0, width = 35.0;
	//private Color rectColor = new Color (160, 200, 255);
	//private Color bgColor = new Color (220,220,220);
	
	/* CONSTRUCTOR */
	public Transition (int i, int x, int y)
    {
        identity = i;
        currentX = x;
        currentY = y;
        
        paintTransition();
    }
	
	/* METHODS */
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
	
	public void paintTransition() {
		Rectangle rect = new Rectangle(width, height);
		rect.setStroke(Color.BLACK);
		rect.setFill(Color.WHITE);
		
		getChildren().addAll(rect);
	}
	
//	public void paint(Graphics g) 
//	{
//		/* removes the previous place - if there is any */
//		remove(g);
//		
//		/* draw shape and set color of the oval */
//		g.setColor(rectColor);
//		g.drawRect(currentX, currentY, height, width);
//	}
//	
//	public void remove(Graphics g)
//	{
//		g.setColor(bgColor);
//	    g.fillRect(currentX, currentY, height, width);
//	}
	
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
