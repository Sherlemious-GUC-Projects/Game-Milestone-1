package model.characters;
import java.awt.Point;

import static java.lang.Math.min;

public abstract class Character {
	private String name;
    private Point location;
    private int maxHp;
    private int currentHp;
    private int attackDmg;
    private Character target;
    
    
    
	public String getName() {
		return name;
	}
	
	public Point getLocation() {
		return location;
	}
	public void setLocation(Point location) {
		this.location = location;
	}
	
	public int getMaxHp() {
		return maxHp;
	}

	public int getCurrentHp() {
		return currentHp;
	}
	public void setCurrentHp(int CurrentHp) {
		this.currentHp = min(CurrentHp, maxHp);
		if(this.currentHp<=0){
			this.currentHp=0;
		}
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
		this.currentHp=maxHp;
	}


    

}
