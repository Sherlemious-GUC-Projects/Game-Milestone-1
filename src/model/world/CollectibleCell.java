package model.world;
import model.collectibles.*;

public class CollectibleCell extends Cell {
	private Collectible collectible;

	public Collectible getCollectible() {
		return collectible;
	}
	public CollectibleCell(Collectible collectible){
		super();
		this.collectible=collectible;
	}

	

}
