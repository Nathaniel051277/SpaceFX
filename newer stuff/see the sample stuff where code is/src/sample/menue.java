package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.Controller;
 
public class menue extends Application {
   
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Start the game!");
        Text Discrpt= new Text(300, 300, "Discription");
        Label space= new Label("\nWelcome to the space game!\n Your goal is to grab heart and exel though our \'challenging game\'.\nAvoid "
        		+ "being touched by the enemy. \n"
        		+ "To movie use the standard W,A,S,D to go to up, left,down and right.\n"
        		+ "You can press R to reset the game. \n"
        		+ "Good luck!\n\n");
        Button btn = new Button();
        btn.setText("Start the game");
        
        Media pick = new Media("file:./src/art/MM.mp3"); //throws here
        MediaPlayer player = new MediaPlayer(pick);
        player.setAutoPlay(true);
        MediaView mediaView = new MediaView(player);
       
     
        
        VBox vbox = new VBox();
        
        vbox.getChildren().addAll(Discrpt,space, btn,mediaView);
    
        
       
        Scene Scene1 = new Scene(vbox, 400, 400, Color.ALICEBLUE);
//        root.getChildren().addAll(Discrpt,btn);
        primaryStage.setScene(Scene1);
		primaryStage.show();
        
        
       
        btn.setOnAction(e->{
        	
        	
        	 Controller control = new Controller(primaryStage);

             // Screen size
              int screenSizeX = 1280;
              int screenSizeY = 720;

              control.BuildStage(screenSizeX, screenSizeY);
              primaryStage.show();
        	
        });
    }
        
        public static void main(String[] args) {
        	
             
        	launch(args);
            
           
        }
        
  
 
        
     
        
        

        // Screen size
        
    
}
