package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Lines extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//created a group pane 
		Group gp = new Group();
		
		//used for loop to generate canvance
		for(int i =0; i<800; i+=10) 
		
		{
			//vertical  (startx, starty, endx, endy)
			
			Line line1 = new Line(i,0,i,800);
			
			//setStroke vertical lines black
			line1.setStroke(Color.BLACK);
			
			//horizontal - 
			Line line2 = new Line (0,i, 800,i); 
			
			// horizontal lines green
			line2.setStroke(Color.GREEN);
			
			// added the lines to group pane
			gp.getChildren().addAll(line1, line2);
			
		}
		

		//created rectangle with borderlines,inner fill color and thickness of width
		   Rectangle r1 = new Rectangle(250,325,100,140);
		   r1.setStroke(Color.BLACK);
		   r1.setFill(Color.YELLOW);
		   r1.setStrokeWidth(5);
		   gp.getChildren().add(r1);
		   
		 //created second rectangle 
		   Rectangle r2 = new Rectangle(50,100,200,100);
		   r2.setStroke(Color.BLACK);
		   r2.setFill(Color.VIOLET);
	       r2.setStrokeWidth(5);
		   r2.setArcWidth(25);
		   r2.setArcHeight(25);
		   gp.getChildren().addAll(r2);
		   
		 //created an elipse 
		   Ellipse e1 = new Ellipse(500, 250, 75, 40);
		   e1.setFill(Color.ORANGE);
		   e1.setStroke(Color.BLACK);
		   e1.setStrokeWidth(5);
		   gp.getChildren().addAll(e1);
		   
		 //created an arc - type open with no connection
		   // constructor (centerx, centery, radiusx, radiusy, startangle, length)
		   Arc ar1 = new Arc(200,550, 100, 100, 90, 90); 
		   ar1.setFill(null); 
		   ar1.setStroke(Color.BLACK); 
		   ar1.setType(ArcType.OPEN);
		   ar1.setStrokeWidth(10);
		   gp.getChildren().addAll(ar1);
		   
		 //arc - type cord 
		   Arc ar2 = new Arc(100, 450, 75, 200, 45, 75);
		   ar2.setFill(Color.BLUE);
		   ar2.setStroke(Color.BLACK);
		   ar2.setStrokeWidth(5);
		   ar2.setType(ArcType.CHORD);
		   gp.getChildren().addAll(ar2);
		   
		   //arc - type round
		   Arc ar3 = new Arc(500, 450, 100, 100, 45, 75);
		   ar3.setFill(Color.GREEN);
		   ar3.setStroke(Color.BLACK);
		   ar3.setStrokeWidth(5);
		   ar3.setType(ArcType.ROUND);
		   gp.getChildren().addAll(ar3);
		   
		   
		  //Instance of scene and added the group to the scene
	      Scene scene = new Scene(gp, 500, 500);
	      primaryStage.setTitle("COOL SHAPES! BY SK");
	      primaryStage.setScene(scene);
	      primaryStage.show();
	      

	}
	public static void main(String[] args) {
		launch(args);
	}
}
