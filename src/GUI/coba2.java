package GUI;
import Animal.*;
import Aquarium.*;
import Animal.*;
import Coin.*;
import Food.*;
import GUI.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class coba2 extends JFrame{
	
	private JFrame frame = new JFrame("ArkavQuarium");
	private JButton buyGuppy;
	private JButton buyPiranha;
	private JButton buyEgg;
	
	private Icon background = new ImageIcon("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\aquarium1.jpg");;
	private Icon menubar = new ImageIcon("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\MenuBar.gif");;
	private Icon iconGuppy = new ImageIcon("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\Guppy1Swim.gif");
	private Icon iconPiranha = new ImageIcon(new ImageIcon("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\PiranhaSwim.gif").getImage().getScaledInstance(40,40,Image.SCALE_DEFAULT));
	private Icon iconSnail = new ImageIcon("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\SnailStop.gif");
	private Icon Egg1 = new ImageIcon("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\egg_1.png"); 
	private Icon Egg2 = new ImageIcon("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\egg_2.png"); 
	private Icon Egg3 = new ImageIcon("D:\\Informatics\\OOP\\Tubes-Java\\ArkavQuarium-2-master\\assets\\egg_3.png"); 
	
	private JLabel bg;
	private JLabel bar;
	
	
	public coba2() {
		buyGuppy = new JButton(iconGuppy);
		buyGuppy.setBounds(18,0,56,56);
		buyGuppy.setBorderPainted(false);
		buyGuppy.setBorder(null);
		//buyGuppy.setMargin(new Insets(0,0,0,0));
		buyGuppy.setContentAreaFilled(false);
		buyGuppy.setIcon(iconGuppy);
		buyGuppy.setPressedIcon(iconGuppy);
		buyGuppy.setDisabledIcon(iconGuppy);
		
		buyPiranha = new JButton(iconPiranha);
		buyPiranha.setBounds(90,0,56,56);
		buyPiranha.setBorderPainted(false);
		buyPiranha.setBorder(null);
		//buyPiranha.setMargin(new Insets(0,0,0,0));
		buyPiranha.setContentAreaFilled(false);
		buyPiranha.setIcon(iconPiranha);
		buyPiranha.setPressedIcon(iconPiranha);
		buyPiranha.setDisabledIcon(iconPiranha);
		
		buyEgg = new JButton(Egg1);
		buyEgg.setBounds(440,0,56,56);
		buyEgg.setBorderPainted(false);
		buyEgg.setBorder(null);
		//buyEgg.setMargin(new Insets(0,0,0,0));
		buyEgg.setContentAreaFilled(false);
		buyEgg.setIcon(Egg1);
		buyEgg.setPressedIcon(Egg1);
		buyEgg.setDisabledIcon(Egg1);
		
		bg = new JLabel(background);
		bg.setBounds(0, 0, 640, 480);
		bar = new JLabel(menubar);
		bar.setBounds(0, 0, 640, 72);
		
		frame.add(buyGuppy);
		frame.add(buyPiranha);
		frame.add(buyEgg);
		frame.add(bar);
		frame.add(bg);
		
		frame.setSize(640, 480);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		//frame.requestFocus();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new coba2();
		
		
	}
}
