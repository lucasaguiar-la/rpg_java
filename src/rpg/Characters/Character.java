package rpg.Characters;

public abstract class Character {

	private Races race;
	private String name;
	private int heathPoint, manaPoints;
	private int strength, dexterity, defense, magic;
	private int level;
	
	public Character() {
		
	}
	
	public abstract void attack();
	public abstract void defend();
	public abstract void useMagic();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Races getRace() {
		return race;
	}

	public void setRace(Races race) {
		this.race = race;
	}
}
