package rpg.Characters;

public class Player extends Character implements ICharacterActions {

	int manaPoints;
	int currentExperience, nextLevelExperience;

	@Override
	public void printName() {
		System.out.println("Character " + this.returnName());
		// super.printName();
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

}
