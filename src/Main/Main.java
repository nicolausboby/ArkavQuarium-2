package Main;

import Animal.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javax.swing.JApplet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main extends JApplet {
    
    public static int JFXPANEL_WIDTH_INT = 800;
    public static int JFXPANEL_HEIGHT_INT = 600;
    private static JFXPanel fxContainer;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
                }
                
                JFrame frame = new JFrame("ArkavQuarium Java Version");
                ImageIcon background;
                background = new ImageIcon("D:\\Tugas\\Java ArkavQuarium\\ArkavQuarium-2\\assets\\backgrounds\\aquarium1.jpg");
                JLabel label = new JLabel(background);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JApplet applet = new Main();
                applet.init();
                frame.setContentPane(applet.getContentPane());            
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true); 
                frame.add(label);
                applet.start();
            }
        });
    }
    
    @Override
    public void init() {
        fxContainer = new JFXPanel();
        fxContainer.setPreferredSize(new Dimension(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT));
        add(fxContainer, BorderLayout.CENTER);
    }     
}
