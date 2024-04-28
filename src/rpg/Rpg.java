package rpg;

import rpg.characters.Races;
import rpg.characters.enemies.EnemiesFactory;
import rpg.characters.enemies.Enemy;

public class Rpg {

	public static void main(String[] args) {
		Enemy npc = EnemiesFactory.returnNewEnemy(Races.GOBLIN);
	}
}
