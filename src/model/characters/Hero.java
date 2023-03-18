package model.characters;
import model.collectibles.*;


public class Hero extends Character {
    private int actionsAvailable;
    private int maxActions;
    private boolean specialAction;
    private Vaccine[] vaccineInventory;
    private Supply[] supplyInventory;
    
	public Hero(String name, int maxHp, int attackDmg, int maxActions) {
		super(name, maxHp, attackDmg);
		this.maxActions = maxActions;
		setActionsAvailable(maxActions);
	}
	public int getActionsAvailable() {
		return actionsAvailable;
	}
	public void setActionsAvailable(int actionsAvailable) {
		this.actionsAvailable = actionsAvailable;
	}
	
	public int getMaxActions() {
		return maxActions;
	}
	
	public boolean isSpecialAction() {
		return specialAction;
	}
	public void setSpecialAction(boolean specialAction) {
		this.specialAction = specialAction;
	}
	
	public Vaccine[] getVaccineInventory() {
		return vaccineInventory;
	}
	
	public Supply[] getSupplyInventory() {
		return supplyInventory;
	}
	
}
