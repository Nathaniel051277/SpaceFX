package sample;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;


// Base of Space! code
// Coded by Christian C.

public class Enemy{ // Location of an art on the screen

    private int x; // Position of player/image
    private int y;

    private int LimitX; // Limit of player movement
    private int LimitY;
    private int offSetX;
    private int offSetY;

    private ImageView images;
    private boolean keys = false; //  Key control

    Enemy(int x, int y, int LimitX, int LimitY, int offSetX, int offSetY, ImageView images) {
        this.x = x; // Position of player
        this.y = y;

        this.LimitX = LimitX; // Limit of player movement
        this.LimitY = LimitY;
        this.offSetX = offSetX;
        this.offSetY = offSetY;

        this.images = images;


        images.setX(x); // Set the position of image on screen
        images.setY(y);

        //G_panel.addKeyListener(this);
    }

    public void setLimit(int x, int y){ // Set the limited of the player movement
        this.LimitX = x;
        this.LimitY = y;
    }

    // Getter
    public int getX() {
        return x;
    }
    public int getY(){
        return y;
    }

}


