package rpg.characters;

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

	public int getHeathPoint() {
		return heathPoint;
	}

	public void setHeathPoint(int heathPoint) {
		this.heathPoint = heathPoint;
	}

	public int getManaPoints() {
		return manaPoints;
	}

	public void setManaPoints(int manaPoints) {
		this.manaPoints = manaPoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getMagic() {
		return magic;
	}

	public void setMagic(int magic) {
		this.magic = magic;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
}
