package GUI;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

import Animal.*;
import Coin.*;
import Food.*;
import LinkedList.*;
import LinkedList.Node;
import Aquarium.*;
import Main.*;


public class GUI extends JPanel {
		
	public static Image background;
	public static Image guppy1;
	public static Image guppy2;
	public static Image guppy3;
	public static Image guppy1h;
	public static Image guppy2h;
	public static Image guppy3h;
	public static Image piranha;
	public static Image piranhah;
	public static Image food;
	public static Image goldCoin;
	public static Image silverCoin;
	public static Image diamond;
	public static Image snailstop;
	public static Image snailmove;
	public static Image menuBar;
	
	
	public GUI(){
		background = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\aquarium3.jpg");
		guppy1 = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy1Swim.gif");
		guppy2 = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy2Swim.gif");
		guppy3 = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy3Swim.gif");
		guppy1h = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy1HungrySwim.gif");
		guppy2h = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy2HungrySwim.gif");
		guppy3h = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy3HungrySwim.gif");
		piranha = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\PiranhaSwim.gif");
		piranhah = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\PiranhaHungrySwim.gif");
		food = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Food.gif");
		goldCoin = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\GoldCoin.gif");
		silverCoin = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\SilverCoin.gif");
		diamond = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Diamond.gif");
		snailstop = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\SnailStop.gif");
		snailmove = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\SnailMove.gif");
		menuBar = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\menuBar.gif");
		
		/*frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.requestFocus();*/				
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		int x,y;
	    int offsetX, offsetY;
	    Image I = null;
	    BufferedImage img;
	    Node<Fish> nodefish = Main.A.getFishes().getHead(); 
	    Node<Coin> nodecoin = Main.A.getCoins().getHead();  
	    Node<Food> nodefood = Main.A.getFood().getHead();
	    Snail snail = Main.A.getSnail();
	    
	    super.paintComponent(g);
	    g.drawImage(background, 0, 0, getWidth(), getHeight(), this);
		
		while (nodefish != null) {
			// jika node ikan adalah Guppy
			if(nodefish.getValue() instanceof Guppy){
				Guppy G = (Guppy) nodefish.getValue();
				if(G.getHungerTime() > 500) {
					if(G.getGrowLevel() == 1) {
						I = guppy1h;
					}
					else if(G.getGrowLevel() == 2) {
						I = guppy2h;
					}
					else {
						I = guppy3h;
					}
				}
				else {
					if(G.getGrowLevel() == 1) {
						I = guppy1;
					}
					else if(G.getGrowLevel() == 2) {
						I = guppy2;
					}
					else {
						I = guppy3;
					}
				}
			}
			
			// Jika node ikan adalah Piranha
			else if(nodefish.getValue() instanceof Piranha) {
				Piranha P = (Piranha) nodefish.getValue();
				if(P.getHungerTime() > 500) {
					I = piranha;
				}
				else {
					I = piranhah;
				}
			}
			x = nodefish.getValue().getX();
			y = nodefish.getValue().getY();
			img = toBufferedImage(I);
			offsetX = img.getWidth(null)/2;
			offsetY = img.getHeight(null)/2;
			if(nodefish.getValue().getDirection() == 1) {
				BufferedImage BFlipped = horizontalFlip(img);
				offsetX = img.getWidth(null)/2;
				offsetY = img.getHeight(null)/2;
				Graphics2D g2d1 = (Graphics2D) g.create();
				g2d1.drawImage(BFlipped, Math.abs(x - offsetX), Math.abs(y - offsetY), this);
				g2d1.dispose();
			 
			}
			else {
				Graphics2D g2d1 = (Graphics2D) g.create();
				g2d1.drawImage(img, Math.abs(x - offsetX), Math.abs(y - offsetY), this);
				g2d1.dispose();
			}
			
			nodefish = nodefish.getNext();
		} // nodefish berakhir
		
		while(nodecoin != null) {
			Coin C = (Coin) nodecoin.getValue();
    		if(C.getValue() == Coin.GOLD) {
    			I = goldCoin;
    		}
    		else if(C.getValue() == Coin.SILVER) {
    			I = silverCoin;
    		}
    		else {
    			I = diamond;
    		}
    		x = nodecoin.getValue().getX();
    		y = nodecoin.getValue().getY();
    		offsetX = I.getWidth(null)/2;
    		offsetY = I.getHeight(null)/2;
    		img = toBufferedImage(I);
    		Graphics2D g2d1 = (Graphics2D) g.create();
    		g2d1.drawImage(img, Math.abs(x - offsetX), Math.abs(x - offsetY), this);
    		g2d1.dispose();
    		nodecoin = nodecoin.getNext();
		} // proses nodecoin berakhir
		
		while(nodefood != null) {
			I = food;
			x = nodefood.getValue().getX();
    		y = nodefood.getValue().getY();
    		offsetX = I.getWidth(null)/2;
    		offsetY = I.getHeight(null)/2;
    		img = toBufferedImage(I);
    		Graphics2D g2d1 = (Graphics2D) g.create();
    		g2d1.drawImage(img, Math.abs(x - offsetX), Math.abs(x - offsetY), this);
    		g2d1.dispose();
    		nodecoin = nodecoin.getNext();
		}// nodecoin berakhir
		
		// Snail
		if(snail.getDirectionTo() == 90 || snail.getDirectionTo() == 270) {
			I = snailstop;
		}
		else {
			I = snailmove;
		}
		x = snail.getX();
		y = snail.getY();
		offsetX = I.getWidth(null)/2;
		offsetY = I.getHeight(null)/2;
		img = toBufferedImage(I);
		Graphics2D g2d1 = (Graphics2D) g.create();
		g2d1.drawImage(img, Math.abs(x - offsetX), Math.abs(x - offsetY), this);
		g2d1.dispose();
		
		
	}
	
	public static BufferedImage horizontalFlip(BufferedImage img) {
        int w = img.getWidth();
        int h = img.getHeight();
        BufferedImage flippedImage = new BufferedImage(w, h, img.getType());
        Graphics2D g = flippedImage.createGraphics();
        g.drawImage(img, 0, 0, w, h, w, 0, 0, h, null);
        g.dispose();
        return flippedImage;
    }
	
	public static BufferedImage toBufferedImage(Image img)
	{
	    if (img instanceof BufferedImage)
	    {
	        return (BufferedImage) img;
	    }
	    BufferedImage bimage = new BufferedImage(Math.abs(img.getWidth(null)), Math.abs(img.getHeight(null)), BufferedImage.TYPE_INT_ARGB);
	    Graphics2D bGr = bimage.createGraphics();
	    bGr.drawImage(img, 0, 0, null);
	    bGr.dispose();
	    return bimage;
	}
	
	/*private void main(String[] args) {
		new GUI();
	}*/
}
