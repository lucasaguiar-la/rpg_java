package rpg.Characters;

public class Character {

	String characterName;
	int heathPoint, manaPoints;
	int strength, dexterity, defense, magic;
	int level, currentExperience, nextLevelExperience;
	
	void attack() {
		System.out.println("Attacked!");
	}
	
	void defend() {
		System.out.println("Defended!");
	}
	
	void useMagic() {
		System.out.println("Plift Ploft PUF!");
	}
	
	
	void useItem() {
		System.out.println("Item used!");
	}
}
