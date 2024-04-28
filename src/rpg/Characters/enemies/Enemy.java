package rpg.characters.enemies;

import rpg.characters.Character;
import rpg.characters.ICharacterActions;
import rpg.characters.Races;

public abstract class Enemy extends Character {

	private int experience;
	// TODO Loot list

	public Enemy() {

	}

	public Enemy(Races race) {
		switch (race) {
			case GOBLIN:
				System.out.println("Race: Goblin");
				break;
			case HUMAN:
				System.out.println("Race: Human");
				break;
			case ELF:
				System.out.println("Race: Elf");
					break;
			case ORC:
				System.out.println("Race: Orc");
				break;
			default:
				System.out.println("Not a valid race!");
				break;
		}	

	}
	
	@Override
	public void attack() {
		
	}
	
	@Override
	public void defend() {
		
	}
	
	@Override
	public void useMagic() {
		
	}

}
