package rpg.Characters;

public class Monster extends Character implements ICharacterActions {

	private int experience;
	// TODO Loot list

	public Monster() {

	}

	public Monster(Races race) {
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
		
	};
	
	@Override
	public void defend() {
		
	};
	
	@Override
	public void useMagic() {
		
	};

	@Override
	public void printName() {
		System.out.println("Monster " + this.returnName() + " appeared!");
		// super.printName();
	}

}
