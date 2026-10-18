package village_gaulois;
import personnages.Gaulois;

public class Village {
	private String nom;
	private int nbVillageois=0;
	private Gaulois chef;
	private Gaulois[] villageois;
	
	public Village(String nom, Gaulois chef, int nbVillageoisMax) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[nbVillageoisMax];
		chef.setVillage(this);
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois]= gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}
	
	public Gaulois trouverVillageois(int numVillageois) {
		if(numVillageois >= 1 && numVillageois <= nbVillageois) {
			return villageois[numVillageois -1];
		}else {
			System.out.println("Il n'y a pas autant d'habitants dans notre village.");
			return null;
		}
	}

	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom + "\" du chef"+ chef.getNom());
		System.out.println("vivent les legendaires gaulois: ");
		
		for(int i=0; i<nbVillageois; i++) {
			System.out.println("- "+ villageois[i].getNom());
		}
	
	}
	
	public static void main(String[] args) {
		Gaulois abraracourcix= new Gaulois("Abraracourcix", 6);
		
		Village village = new Village("Village des Irreducibles", abraracourcix, 30);
		village.trouverVillageois(30);
		
		Gaulois asterix= new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);
		
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
		village.afficherVillageois();
		
		Gaulois obelix=new Gaulois("Obelix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillageois();
		Gaulois doublePolemix=new Gaulois("Doublepolemix",4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublePolemix.sePresenter();
		
	}
	

}
