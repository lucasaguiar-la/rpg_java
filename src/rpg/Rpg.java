package rpg;

import rpg.Characters.Monster;
import rpg.Characters.Player;

public class Rpg {
	
	public static void main(String[] args) {
		Player jogador01 = new Player();
		Monster monstro01 = new Monster();
		
		jogador01.getName("Lucas");
		jogador01.printName();
		monstro01.getName("Goblin");
		monstro01.printName();
	}
}
