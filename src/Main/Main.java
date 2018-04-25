package Main;

import Animal.*;
import Aquarium.*;
import Coin.*;
import Food.*;
import Player.*;
import LinkedList.*;
import GUI.*;

import javax.swing.*;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener{
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int JFXPANEL_WIDTH_INT = 640;
    public static final int JFXPANEL_HEIGHT_INT = 480;
    public static final int INTERVAL_TIME_DIRECTION = 2000;
    public static final int PRC_GUPPY = 100;
	public static final int PRC_PIRANHA = 1000;
	public static final int PRC_EGG1 = 3000;
	public static final int PRC_EGG2 = 4000;
	public static final int PRC_EGG3 = 5000;
	public static final int PRC_FOOD = 5;
	public static final int GOLD = 55;
	public static final int SILVER = 35;
	public static final int DIAMOND = 200;
    public static final int INIT_MONEY = 200;
    public static final int SPEED_FISH = 87;
    public static final int SPEED_COIN_FOOD = 85;
    public static final int SPEED_SNAIL = 87;
    
    private JButton play = new JButton("Play");
	private JButton exit = new JButton("Exit");
	private JButton mainMenu = new JButton("Main Menu");
	private JButton buyGuppy = new JButton("Guppy : " + PRC_GUPPY);
	private JButton buyPiranha = new JButton("Piranha : " + PRC_PIRANHA);
	private JButton buyEgg = new JButton("Egg : " + PRC_EGG1);
	private JLabel displayMoney = new JLabel("Money : " + Player.getMoney());
	private JLabel displayEgg = new JLabel("Egg(s) : " + Player.getEggLevel());
    
    public static Aquarium A;
	public static Snail S;
	private GUI gui = new GUI();
	private CardLayout layout = new CardLayout();
	private JPanel panel = new JPanel();
	private JLabel menu = new JLabel(new ImageIcon(new ImageIcon("MainMenu.png").getImage().getScaledInstance(JFXPANEL_WIDTH_INT, JFXPANEL_HEIGHT_INT, Image.SCALE_DEFAULT)));
	
	private class MyMouseListener extends MouseAdapter
	  {
	    @Override
	    public void mousePressed(MouseEvent e)
	    {
	    	int Xrange, Yrange;
	    	int Xicon = GUI.silverCoin.getWidth(null)/2;
	    	int Yicon = GUI.silverCoin.getHeight(null)/2;
	    	boolean temp = false;
	    	Node<Coin> nodecoin = A.getCoins().getHead();
	    	Coin c = new Coin(1, e.getX(), e.getY());
	    	while(nodecoin != null) {
	    		Xrange = Math.abs(c.getX() - nodecoin.getValue().getX());
	    		Yrange = Math.abs(c.getY() - nodecoin.getValue().getY());
	    		if(nodecoin.getValue() instanceof Coin && Xrange <= Xicon && Yrange <= Yicon) {
	    			A.getCoins().remove(A.getCoins().find(nodecoin));
	    			//delete item belum benar
	    			Coin Cc = (Coin) nodecoin.getValue();
	    			Player.setMoney(Player.getMoney() + Cc.getValue());
	    			temp = true;
	    			break;
	    		}
	    		nodecoin = nodecoin.getNext();
	    	}
	    	if(Player.getMoney() >= PRC_FOOD && !temp){
	    		Player.setMoney(Player.getMoney() - PRC_FOOD);
	    		Food f = new Food(e.getX(), e.getY());
	    		A.getFood().add(f);
	    		
	    	}
	    	displayMoney.setText("Money : " + Player.getMoney());
	    }
	  }
	
	
	private void addButtons() {
		gui.setName("Game");
		menu.setName("Menu");
		play.addActionListener(this);
		exit.addActionListener(this);
		mainMenu.addActionListener(this);
		buyGuppy.addActionListener(this);
		buyPiranha.addActionListener(this);
		buyEgg.addActionListener(this);
		//menu buttons
		menu.setLayout(new FlowLayout());
		menu.add(play);
		menu.add(exit);
		gui.addMouseListener(new MyMouseListener());
		gui.setLayout(new FlowLayout());
		
		//game buttons
		gui.add(mainMenu);
		gui.add(buyGuppy);
		gui.add(buyPiranha);
		gui.add(buyEgg);
		gui.add(displayEgg);
		gui.add(displayMoney);

		//adding children to parent Panel
		panel.add(menu,"Menu");
		panel.add(gui,"Game");
		add(panel);
		layout.show(panel,"Menu");
	}
	
	public void reset(){
		A = new Aquarium(JFXPANEL_WIDTH_INT,JFXPANEL_HEIGHT_INT);
		S = new Snail(72,72);
		Player.setEggLevel(0);
		Player.setMoney(INIT_MONEY);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		if (source == exit) {
			int n = JOptionPane.showConfirmDialog(this,"Do you want to quit the game?","WARNING",JOptionPane.YES_NO_OPTION);
			if(n == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		} 
		else if (source == play) {
			layout.show(panel, "Game");
		} 
		else if (source == mainMenu){
			int n = JOptionPane.showConfirmDialog(
				    this,
				    "You're about to quit current game. Proceed?",
				    "WARNING",
				    JOptionPane.YES_NO_OPTION);
			if(n == JOptionPane.YES_OPTION) {
				//reset();
				layout.show(panel, "Menu");
			}
		}
		else if (source == buyGuppy) {
			if(Player.getMoney() >= PRC_GUPPY) {
				Player.setMoney(Player.getMoney()-PRC_GUPPY);
				Guppy G = new Guppy();
				A.getFishes().add(G);
				displayMoney.setText("Money : " + Player.getMoney());
			}
			else {
				JOptionPane.showMessageDialog(this,
					    "Not Enough Money!",
					    "ERROR",
					    JOptionPane.WARNING_MESSAGE);
			}
		}
		else if (source == buyPiranha) {
			if(Player.getMoney()>= PRC_PIRANHA) {
				Player.setMoney(Player.getMoney()-PRC_PIRANHA);
				Piranha P = new Piranha();
				A.getFishes().add(P);
				displayMoney.setText("Money : " + Player.getMoney());
			}
			else {
				JOptionPane.showMessageDialog(this,
					    "Not Enough Money!",
					    "ERROR",
					    JOptionPane.WARNING_MESSAGE);
			}
		}
		
		else if (source == buyEgg) {
			int PRC_EGG;
			if(Player.getEggLevel() == 1) {
				PRC_EGG = PRC_EGG1;
			}
			else if(Player.getEggLevel() == 2) {
				PRC_EGG = PRC_EGG2;
			}
			else {
				PRC_EGG = PRC_EGG3;
			}
			if(Player.getMoney() >= PRC_EGG) {
				Player.setMoney(Player.getMoney() - PRC_EGG);
				Player.setEggLevel(Player.getEggLevel() + 1);
				displayMoney.setText("Money : " + Player.getMoney());
				displayEgg.setText("Egg(s) : " + Player.getEggLevel());
			}
			else {
				JOptionPane.showMessageDialog(this,
					    "Not Enough Money!",
					    "ERROR",
					    JOptionPane.WARNING_MESSAGE);
			}
		}
	}
    
public Main(int width, int height) {
		
		panel.setLayout(layout);     
		addButtons();
		setSize(width, height);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		setTitle("ArkavQuarium");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		requestFocus();
		
		reset();
		
		Timer timer = new Timer(20, new ActionListener() {
		      @Override
		      public void actionPerformed(ActionEvent e) {
				int piranhaCount = 0;
				int guppyCount = 0;
				int coinCount = 0;
				Component current = null;
		        for (Component comp : panel.getComponents()) {
					if (comp.isVisible() == true) {
						current = comp;
					}
				}
		        if(current.getName().equals("Game")){
					 Node<Fish> nodefish = A.getFishes().getHead();
					while(nodefish != null){
						if(nodefish.getValue() instanceof Guppy){
							guppyCount++;
						}
						else if(nodefish.getValue() instanceof Piranha){
							piranhaCount++;
						}
						
						//nodefish.getValue().Move();
						//nodefish.getValue().Eat();
						nodefish = nodefish.getNext();
					}
					Node<Coin> Pi = A.getCoins().getHead();
					while(Pi != null) {
						if(Pi.getValue() instanceof Coin){
							coinCount++;
						}
						//Pi.getData().move(A);
						Pi = Pi.getNext();
					}
					displayEgg.setText("Egg(s) : " + Player.getEggLevel());
					displayMoney.setText("Money : " + Player.getMoney());
					if(Player.getEggLevel() == 3){
						JOptionPane.showMessageDialog(null, 
								 "You Won!", 
								 "Congratulation!", 
								 JOptionPane.INFORMATION_MESSAGE, 
								 new ImageIcon("Win.gif"));
						 reset();
						 layout.show(panel,"Menu");
					}
					else{
						if(coinCount == 0 && guppyCount == 0 && 
						piranhaCount == 0 && Player.getMoney() < PRC_GUPPY){
							JOptionPane.showMessageDialog(null, 
									 "You Lost!", 
									 "Game Over!", 
									 JOptionPane.INFORMATION_MESSAGE, 
									 new ImageIcon("Lose.gif"));
							 reset();
							 layout.show(panel,"Menu");
						}
					}
					gui.repaint();
				}
		      }
		    });
		    timer.start();
	}
    
        
}
