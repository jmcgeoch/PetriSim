import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PetriNet extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		//create the scene
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		//creates window padding
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		//creates padding between rows and columns
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		//create run button and set properties
		Button runButton = new Button("Run");
		pane.add(runButton, 4, 1);
		
		//create delete button and set properties
		Button delButton = new Button("Delete");
		pane.add(delButton, 5, 1);
		
		//create place button and set properties
		Place placeButton = new Place(0, 0, 0);
		pane.add(placeButton, 1, 2);
		
		//create transition button and set properties
		Transition transButton = new Transition(0, 0, 0);
		pane.add(transButton, 2, 2);
		
		//drag test
		
		
		
		//create handlers for the buttons
		RunHandlerClass handler1 = new RunHandlerClass();
		runButton.setOnAction((EventHandler<ActionEvent>) handler1);
		
		DelHandlerClass handler2 = new DelHandlerClass();
		delButton.setOnAction(handler2);
		
		PlaceHandlerClass handler3 = new PlaceHandlerClass();
		placeButton.setOnAction((EventHandler<ActionEvent>) handler3);
		
		TransitionHandlerClass handler4 = new TransitionHandlerClass();
		transButton.setOnAction((EventHandler<ActionEvent>) handler4);
		
		//define scene params
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("Petri Net Simulation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	 
	class RunHandlerClass implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			//this is just temp code
			System.out.println("Run Clicked");
		}
	}
	
	class DelHandlerClass implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			//this is just temp code
			System.out.println("Delete Clicked");
		}
	}
	
	//currently broken
	class PlaceHandlerClass implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			//this is just temp code
			System.out.println("Place Clicked");
		}
	}
	
	//currently broken
	class TransitionHandlerClass implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			//this is just temp code
			System.out.println("Transition Clicked");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
