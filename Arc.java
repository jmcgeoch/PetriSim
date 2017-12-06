import java.awt.*;

public class Arc
{
	/* arcIntoPlace - the direction of the arc: true =  place -> transition, false = transition -> place */
	private boolean placeToTrans;

    /* source and destination states of the transition */
    private Place           toPlace;
    private Transition      toTransition;

	/* arc from PLACE -> TRANSITION */
	public Arc (Place p, Transition t)
    {
		placeToTrans = true;
        toPlace	= p;
        toTransition = t;
    } 
	
	/* arc from TRANSITION -> PLACE*/
    public Arc (Transition t, Place p)
    {
		placeToTrans = false;
		toPlace	= p;
        toTransition = t;
    }
    
    /* NEED TO CHECK IF PLACE AND TRANSITION IS VALID */
    
    /* DRAW LINES */
    public void paint(Graphics g)
    {
    	
    }
    
    /* REMOVE LINES */
    public void remove(Graphics g)
    {
    	
    }
    
    public boolean toPlace()
    {
        return placeToTrans;

    }
    
    public Place place ()
    {
        return toPlace;

    }

    public Transition transition ()
    {
        return toTransition;

    }
}