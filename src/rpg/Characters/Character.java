package rpg.Characters;

public class Character {

	private Races race;
	private String name;
	private int heathPoint, manaPoints;
	private int strength, dexterity, defense, magic;
	private int level;

	public Character() {

	}

	public Character(String name) {
		this.name = name;
	}

	public void attack() {
		System.out.println("Attacked!");
	}

	public void defend() {
		System.out.println("Defended!");
	}

	public void useMagic() {
		System.out.println("Plift Ploft PUF!");
	}

	public void useItem() {
		System.out.println("Item used!");
	}

	public void getName(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("Name: " + this.name);
	}

	protected String returnName() {
		return this.name;
	}
}
