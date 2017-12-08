package sample;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Place {

    private double currentX, currentY, dragX, dragY;
    private int tokenCount;
    private int identity;
    private int SIZE = 30;

    public Place(int i, double x, double y)
    {
        identity = i;
        currentX = x;
        currentY = y;

        tokenCount = 0;

        paintPlace();
    }

    public Place(int i) {

        identity = i;

        tokenCount = 0;

        paintPlace();
    }

    public void dragStart(double x, double y)
    {
        dragX = x;
        dragY = y;
    }

    public void dragEnd(double x, double y)
    {
        drag(currentX + (x - dragX), currentY + (y = dragY));
        dragX = x;
        dragY = y;
    }

    public void drag(double x, double y)
    {
        currentX = x;
        currentY = y;
    }

    public void paintPlace() {
        Circle circle = new Circle(SIZE);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        //canvas.getChildren().addAll(circle);
    }

    public int getIdentity()
    {
        return identity;
    }

//    public void outArc(Transition t)
//    {
//		/* Arc arc = new Arc(this, t);
//		t.addInArc(arc); */
//    }
//
//    public void removeOutArc(Transition t)
//    {
//        /* WIP */
//    }

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
