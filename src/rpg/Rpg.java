package rpg;

import rpg.Characters.Monster;
import rpg.Characters.Player;
import rpg.Characters.Races;

public class Rpg {

	public static void main(String[] args) {
		Player jogador01 = new Player();
		jogador01.getName("Guts");
		jogador01.printName();
		jogador01.useMagic();

		Monster monstro01 = new Monster(Races.GOBLIN);
		monstro01.getName("Goblin");
		monstro01.printName();
	}
}
