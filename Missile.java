public class Missile extends GameObject{
    public Missile(int XCoord, int YCoord){
        super(XCoord, YCoord);
    }
    public String toString(){
        return "Missile at (" + getX() + ", " + getY() + ")";
    }
    /**
     * @return object width.
     */
    @Override
    public int getWidth() {
        return GameData.MISSILE_WIDTH;
    }

    /**
     * @return object height.
     */
    @Override
    public int getHeight() {
        return GameData.MISSILE_HEIGHT;
    }
}
