package sample;

import javafx.scene.input.MouseEvent;

public class Controller {

    public void duplicatePlace(MouseEvent mouseEvent) {
        Place newPlace = new Place(0);
        canvas.getChildren().addAll(newPlace);
    }

    public void putNewPlace(MouseEvent mouseEvent) {
        Place newPlace = new Place(0, mouseEvent.getScreenX(), mouseEvent.getScreenY());
        double x = mouseEvent.getScreenX();
        double y = mouseEvent.getScreenY();
        newPlace.dragEnd(x, y);
    }

    public void runClicked(MouseEvent mouseEvent) {
        //placeholder test code
        System.out.println("Run Clicked");
    }

    public void delClicked(MouseEvent mouseEvent) {
        //placeholder test code
        System.out.println("Delete Clicked");
    }
}
