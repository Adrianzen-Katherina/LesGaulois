package personnages;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public boolean resterPotion() {
		return quantitePotion>0;
	}

	public void remplirChaudron(int quantite, int forcePotion) {
		this.quantitePotion= quantite;
		this.forcePotion= forcePotion;
	}
	
	public int prendreLouche() {
		quantitePotion=quantitePotion-1;
		if(quantitePotion ==0) {
			int force = forcePotion;
			forcePotion=0;
			return force;
		}
		return forcePotion;
	}
	
}
