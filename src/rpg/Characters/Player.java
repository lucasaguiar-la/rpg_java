package rpg.Characters;

public class Player extends Character{

	int manaPoints;
	int currentExperience, nextLevelExperience;
	
	@Override
	public void printName() {
		System.out.println("Character " + this.returnName());
	}
	
	
}
