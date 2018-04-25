package GUI;
import javax.swing.*;



import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;

import Animal.*;
import Coin.*;
import Food.*;
import LinkedList.*;
import Aquarium.*;



public class GUI extends JPanel {
	 
	public static Image background;
	public static Image guppy1;
	public static Image guppy2;
	public static Image guppy3;
	public static Image piranha;
	public static Image food;
	public static Image goldCoin;
	public static Image silverCoin;
	public static Image diamond;
	public static Image snail;
	public static Image menuBar;
	
	GUI(){
		JFrame frame = new JFrame("ArkavQuarium");
		background = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\aquarium3.jpg");
		guppy1 = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy1.gif");
		guppy2 = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy2.gif");
		guppy3 = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy3.gif");
		piranha = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Piranha.gif");
		food = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Food.gif");
		goldCoin = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\GoldCoin.gif");
		silverCoin = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\SilverCoin.gif");
		diamond = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Diamond.gif");
		snail = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Snail.gif");
		menuBar = Toolkit.getDefaultToolkit().createImage("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\menuBar.gif");	 
	}
	
	void UpdateAll(double now, double deltatime, boolean unlockFish[], int x[], int j, Aquarium aquarium) {
		
		/* Draw aquarium & menu_bar to screen*/
		  //draw_image(DIR_ICONS + "aquarium2.jpg", SCREEN_WIDTH / 2, SCREEN_HEIGHT / 2);
		  //draw_image(DIR_ICONS + "menubar.gif" , SCREEN_WIDTH / 2, 75 / 2);
		
	}
	
	public static void main(String args[]) {
		new GUI();
		
		Aquarium aquarium;
	}

}
