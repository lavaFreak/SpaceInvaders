public class Alien extends GameObject implements Shooter<Missile>{
    private int width;
    private int height;
    public Alien(int XCoord, int YCoord, int width, int height){
        super(XCoord, YCoord);
        this.width = width;
        this.height = height;
    }
    public String toString(){
        return "Alien at (" + getX() + ", " + getY() + ")";
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
    public Missile fire() {
        return new Missile(getX() + getWidth()/2 - 2,
                getY() + getHeight());
    }
}
