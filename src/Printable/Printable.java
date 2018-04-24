/*
 * ArkavQuarium
 * 
 */
package Printable;

import java.net.MalformedURLException;
import javax.swing.JLabel;

/**
 *
 * @author Uslaconi
 */
public interface Printable {
    public JLabel print(String img) throws MalformedURLException;
}
