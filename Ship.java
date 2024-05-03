import javax.swing.*;
import java.awt.*;

public class Ship extends GameObject implements Shooter<Laser>{
    private int width;
    private int height;



    public Ship(int xCoord, int yCoord, int width, int height){
        super(xCoord,yCoord);
        this.width = width;
        this.height = height;
    }

    public String toString(){
        return "Ship at (" + getX() +", " + getY() + ")";
    }

    /**
     * @return object width.
     */
    @Override
    public int getWidth() {
        return width;
    }

    /**
     * @return object height.
     */
    @Override
    public int getHeight() {
        return height;
    }

    /**
     * Create a new "bullet" and return it.
     *
     * @return Fired object.
     */
    @Override
    public Laser fire() {
        return new Laser(getX() + getWidth()/2 - 1,
                getY() - 15);
    }
}
