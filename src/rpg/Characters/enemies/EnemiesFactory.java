package rpg.characters.enemies;

import rpg.characters.Races;

public class EnemiesFactory {
	public static final Enemy returnNewEnemy(Races race) {
		Enemy returning = null;
		switch (race) {
		case GOBLIN:
			returning =  new Goblin();
			break;
		case HUMAN:
			returning =  new Human();
			break;
		case ELF:
			returning =  new Elf();
			break;
		case ORC:
			returning =  new Orc();
			break;
		default:
			System.out.println("Not a valid race!");
			break;
		}
		return returning;
	}
}
