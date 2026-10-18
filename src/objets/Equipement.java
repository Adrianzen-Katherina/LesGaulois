package objets;

public enum Equipement {
	CASQUE("casque"), BOUCILIER("boucilier");
	private String nom;
	private Equipement(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return nom;
	}

}
