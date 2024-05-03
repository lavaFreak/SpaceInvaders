import javax.swing.*;
import java.awt.*;

public class GraphicObject extends JLabel {
    private int xCoord;
    private int yCoord;
    private int width;
    private int height;
    public GraphicObject(GameObject content){
        xCoord = content.getX();
        yCoord = content.getY();
        width = content.getWidth();
        height = content.getHeight();
        setPreferredSize(new Dimension(width,height));
        System.out.println(getPreferredSize());
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public int getX() {
        return xCoord;
    }
    public int getY() {
        return yCoord;
    }
}
