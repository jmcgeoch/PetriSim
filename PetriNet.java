import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PetriNet extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		//create the scene and place two buttons in the scene
		HBox pane = new HBox(10);
		pane.setAlignment(Pos.CENTER);
		
		Button runButton = new Button("Run");
		Button delButton = new Button("Delete");
		
		RunHandlerClass handler1 = new RunHandlerClass();
		runButton.setOnAction((EventHandler<ActionEvent>) handler1);
		
		DelHandlerClass handler2 = new DelHandlerClass();
		delButton.setOnAction(handler2);
		
		pane.getChildren().addAll(runButton, delButton);
		
		//define scene params
		Scene scene = new Scene(pane, 400, 300);
		primaryStage.setTitle("Petri Net Simulation");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	 
	class RunHandlerClass implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			System.out.println("Run Clicked");
		}
	}
	
	class DelHandlerClass implements EventHandler<ActionEvent> {
		public void handle(ActionEvent e) {
			System.out.println("Delete Clicked");
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
