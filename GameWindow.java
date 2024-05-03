import javax.swing.*;
import java.awt.*;

public class GameWindow extends JPanel {
    //private final Image background;
    private final int windowWidth = GameData.GAME_BOARD_WIDTH;
    private final int windowHeight = GameData.GAME_BOARD_HEIGHT;
    public GameWindow(){
        setPreferredSize(new Dimension(windowWidth,windowHeight));
        setBackground(Color.BLACK);
        setLayout(null);
        //background = new ImageIcon("alien.jpg").getImage();
        //add(new Button("test"));
        Ship ship = new Ship(240,460,20,30);
        ShipGraphic shipGraphic = new ShipGraphic(ship);
        add(shipGraphic);
        setVisible(true);
    }
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//        Graphics2D g2d = (Graphics2D) g;
////        System.out.println(background.getHeight(null));
////        g2d.drawImage(background,0,0,
////                windowWidth,windowHeight,null);
//    }
}
