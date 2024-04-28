package rpg;

import rpg.Characters.NPC;
import rpg.Characters.Player;
import rpg.Characters.Races;

public class Rpg {

	public static void main(String[] args) {
		Player jogador01 = new Player();
		jogador01.useMagic();

		NPC monstro01 = new NPC(Races.GOBLIN);
	}
}
