import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.*;

public class SpaceInvadersGUI extends JFrame {
    private Ship ship;
    private GameWindow gameWindow;
    public SpaceInvadersGUI(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Space Invaders");

        gameWindow = new GameWindow();
        add(gameWindow);
        pack();
        setVisible(true);
    }
}
