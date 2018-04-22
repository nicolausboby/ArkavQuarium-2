/*
 * ArkavQuarium
 * 
 */
package Main;

/**
 *
 * @author asus
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class BackgroundImage extends JFrame{
    public BackgroundImage(String title, int h, int w, String bgImage){
        setTitle(title);
        setSize(w,h);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("..\\..\\assets\\backgrounds\\" + bgImage));
        add(background);
        background.setLayout(new FlowLayout());
    }
}
