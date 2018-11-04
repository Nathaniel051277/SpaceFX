package sample;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;


// Base of Space! code
// Coded by Christian C.

public class Player implements EventHandler<KeyEvent> { // Location of an art on the screen

    private int x; // Position of player/image
    private int y;

    private int LimitX; // Limit of player movement
    private int LimitY;
    private int offSetX;
    private int offSetY;

    private ImageView images;
    private boolean keys = false; //  Key control

    Player(int x, int y, int LimitX, int LimitY, int offSetX, int offSetY, Scene panel, ImageView images) {
        this.x = x; // Position of player
        this.y = y;

        this.LimitX = LimitX; // Limit of player movement
        this.LimitY = LimitY;
        this.offSetX = offSetX;
        this.offSetY = offSetY;

        this.images = images;


        images.setX(x); // Set the position of image on screen
        images.setY(y);

        panel.setOnKeyPressed(this); // Tell the scene that it they's a key Event
        //G_panel.addKeyListener(this);
    }

    public void setLimit(int x, int y){ // Set the limited of the player movement
        this.LimitX = x;
        this.LimitY = y;
    }

    public void  handle(KeyEvent event){ // Key checker for the player, and move player
        //System.out.println(event.getCode().toString()); // THis is just to print out the user key input
        if(!keys) { // If keys is not turn player can move
            switch (event.getCode()) { // Switch statement for checking the player keys
                // All this switch statement is for moving the player in that position by 5 pixels
                case A: // If key is A
                    if(x > 0) { // Check to make sure the play does not go off screen
                        x -= 5;
                        images.setX(x);
                        //image.setRotate(image.getRotate() - 5);
                    }
                    break;
                case D:
                    if(x < (LimitX - offSetX)) {
                        x += 5;
                        images.setX(x);
                        //image.setRotate(image.getRotate() + 5);
                    }
                        break;
                case W:
                    if(y > 0) {
                        y -= 5;
                        images.setY(y);
                    }
                    break;
                case S:
                    if(y < (LimitY - offSetY)) {
                        y += 5;
                        images.setY(y);
                    }
                    break;
                default:
                    break;
            }
        }
    }

    void chnageKey(boolean key) {
        this.keys = key; // Change key to stop all movement of player
    }


    // Getter
    int getX() {
        return x;
    }
    int getY(){
        return y;
    }

}


