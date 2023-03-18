package model.characters;
import java.awt.Point;

// TODO
public abstract class Character {
	private String name;
    private Point Location;
    private int maxHp;
    private int currentHp;
    private int attackDmg;
    private Character target;
    
    
    
	public String getName() {
		return name;
	}
	
	public Point getLocation() {
		return Location;
	}
	public void setLocation(Point location) {
		Location = location;
	}
	
	public int getMaxHp() {
		return maxHp;
	}

	public int getCurrentHp() {
		return currentHp;
	}
	public void setCurrentHp(int currentHp) {
		this.currentHp = currentHp;
	}

	public int getAttackDmg() {
		return attackDmg;
	}

	public Character getTarget() {
		return target;
	}
	public void setTarget(Character target) {
		this.target = target;
	}
	
	public Character(String name, int maxHp, int attackDmg){
		this.name=name;
		this.maxHp=maxHp;
		this.attackDmg=attackDmg;
	}


    

}
