package rpg.Characters;

public class Character {

	String name;
	int heathPoint, manaPoints;
	int strength, dexterity, defense, magic;
	int level;
	
	public void attack() {
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
