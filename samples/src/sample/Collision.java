package sample;

// Used by Christian C.
// Base of Lab 7 pdf

public class Collision { // Simple collision detection code
    public boolean checkCollision(int r1TopLeftX, int r1BottomRightX,int r1TopLeftY, int r1BottomRightY,
                                     int r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int r2BottomRightY)
    {
        //System.out.println("Testing");
        return r1TopLeftX < r2BottomRightX && r1BottomRightX >
                r2TopLeftX && r1TopLeftY < r2BottomRightY && r1BottomRightY >
                r2TopLeftY;

    }
}
