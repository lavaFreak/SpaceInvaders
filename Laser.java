public class Laser extends GameObject{
    public Laser(int XCoord, int YCoord){
        super(XCoord, YCoord);
    }
    public String toString(){
        return "Laser at (" + getX() + ", " + getY() + ")";
    }
    /**
     * @return object width.
     */
    @Override
    public int getWidth() {
        return GameData.LASER_WIDTH;
    }

    /**
     * @return object height.
     */
    @Override
    public int getHeight() {
        return GameData.LASER_HEIGHT;
    }
}
