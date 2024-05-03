import javax.swing.*;
import java.awt.*;

public abstract class GameObject implements Object2D {
    private int XCoord;
    private int YCoord;
    public GameObject(int XCoord, int YCoord){
        this.XCoord = XCoord;
        this.YCoord = YCoord;
    }

    /**
     * @return x coordinate of upper left corner of object.
     */
    @Override
    public int getX() {
        return XCoord;
    }

    /**
     * @return y coordinate of upper left corner of object.
     */
    @Override
    public int getY() {
        return YCoord;
    }

    /**
     * set upper left corner of object x component
     * @param x
     */
    public void setX(int x){
        XCoord = x;
    }
    /**
     * set upper left corner of object y component
     * @param y
     */
    public void setY(int y){
        YCoord = y;
    }

    /**
     * Get the bounding rectangle for the object.
     *
     * @return Bounding rectangle.
     */
    @Override
    public Rectangle getBoundingRectangle() {
        Point p = new Point(getX(),getY());
        Dimension d = new Dimension(getWidth(),getHeight());
        return new Rectangle(p,d);
    }

    /**
     * Does this object intersect another? (Checking if the bounding
     * rectangles intersect will generally suffice.)
     *
     * @param other The other object to check.
     * @return True if objects intersect.
     */
    @Override
    public boolean intersects(Object2D other) {
        Rectangle otherRect = other.getBoundingRectangle();
        Rectangle thisRect = getBoundingRectangle();
        return thisRect.intersects(otherRect);
    }

    /**
     * Is any part of the object outside of the game board?
     *
     * @return True if part of object is out of bounds.
     */
    @Override
    public boolean isOutOfBounds() {
        if (getX() < 0 || getY() < 0){
            return true;
        }
        if ((getX() + getWidth()) > GameData.GAME_BOARD_WIDTH ||
                (getY() + getHeight()) > GameData.GAME_BOARD_HEIGHT){
            return true;
        }
        return false;
    }
}
