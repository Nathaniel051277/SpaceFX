package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Coded by Christian C.

public class Controller {
    Timer MainTimer;
    Stage MainStage;
    Player player;
    Enemy enemy;

    Collision collision = new Collision();

    Controller(Stage Stage){

        this.MainStage = Stage;
       MainTimer = new Timer(500, new TimeHandler());
       MainTimer.start();

    }

    void BuildStage(int ScreenSizeX, int ScreenSizeY){ // Build The main Game Stage

        ImageView imagePlayer = new  ImageView("file:./src/art/shipP.png"); // Art of the game
        ImageView imageEnemy = new  ImageView("file:./src/art/shipE.png");

        ImageView BackGrown = new ImageView("file:./src/art/space.png");

        Group myGroup = new Group(BackGrown,imagePlayer, imageEnemy);

        Scene myScene = new Scene(myGroup, ScreenSizeX, ScreenSizeY, Color.BEIGE);

        // Make the object and set it on screen
        player = new Player(150, 150, ScreenSizeX, ScreenSizeY, 150,110, myScene, imagePlayer);
        enemy = new Enemy(700, 100, ScreenSizeX, ScreenSizeY, 150,110, imageEnemy);

        MainStage.setScene(myScene);
    }

    private  class TimeHandler implements ActionListener { // Timer Listener
        @Override
        public void actionPerformed(ActionEvent e) { // Timer for checking if the player has hit the Enemy or not
            if(collision.checkCollision(player.getX(), player.getX() + 150, player.getY(), player.getY() + 110,
                    enemy.getX(), enemy.getX() + 150, enemy.getY(), enemy.getY() + 110)){
                System.out.println("True");
                player.chnageKey(true);
            }
        }
    }



}
