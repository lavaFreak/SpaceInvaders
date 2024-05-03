import java.awt.*;
import java.awt.geom.*;

public class ShipGraphic extends GraphicObject{
    private Polygon shipBody;
    public ShipGraphic(Ship ship){
        super(ship);
        System.out.println(getWidth());
        System.out.println(getHeight());
        int radius = (getWidth()>getHeight() ? getWidth():getHeight())/3;
        System.out.println(radius);
        shipBody =
                new Polygon(Helper.getPolyPoints('x',5,radius),
                Helper.getPolyPoints('y',5,radius),5);
        setBackground(Color.BLUE);
        add(new Button("test"));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(getX(),getY(),
                getWidth()/5,getHeight());
        g.fillRect(getX() + getWidth()-(getWidth()/5),
                getY(),getWidth()/5,getHeight());
        g.setColor(Color.BLUE);
        g.fillPolygon(shipBody);

    }
}
