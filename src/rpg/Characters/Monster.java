package rpg.Characters;

public class Monster extends Character{
	
	int experience;
	//TODO Loot list
	
	@Override
	public void printName() {
		System.out.println("Monster " + this.returnName() + " appeared!");
	}
	
}
