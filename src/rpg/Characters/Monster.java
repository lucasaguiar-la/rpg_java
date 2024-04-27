package rpg.Characters;

public class Monster {
	
	String monsterName;
	int healthPoints;
	int strength, dexterity, defense, magic;
	int level, experience;
	//TODO Loot list
	
	void attack() {
		System.out.println("Attacked!");
	}
	
	void defend() {
		System.out.println("Defended!");
	}
	
	void useMagic() {
		System.out.println("Plift Ploft PUF!");
	}
	
}
