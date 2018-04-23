package Main;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Main extends JApplet {
    
    public static int JFXPANEL_WIDTH_INT = 800;
    public static int JFXPANEL_HEIGHT_INT = 600;
    private static JFXPanel fxContainer;
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BackgroundImage frame = new BackgroundImage("Arkavquarium", JFXPANEL_HEIGHT_INT, JFXPANEL_WIDTH_INT, "aquarium1.jpg");
            
            JApplet applet = new Main();
            applet.init();
            
            frame.setContentPane(applet.getContentPane());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            
            applet.start();
        });
    }
    
    @Override
    public void init() {

    }
    
    private void createScene() {
    }
}
