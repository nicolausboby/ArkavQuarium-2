package Player;
import Main.*;

public class Player {
	private static long money = Main.INIT_MONEY;
	private static int eggLevel;
	
	public static long getMoney() {
		return money;
	}
	public static void setMoney(long l) {
		money = l;
	}
	public static int getEggLevel() {
		return eggLevel;
	}
	public static void setEggLevel(int level) {
		eggLevel = level;
	}
	public static void printMoney() {
		
	}
}
