package personnages;

public class Commercant extends Humain{
	
	public Commercant(String nom, int quantiteArgent) {
		super(nom, "thé", quantiteArgent);
	}
	
	public int seFaireExtroquer() {
		
		this.perdreArgent(quantiteArgent);
		System.out.println("J'ai tout perdu, le monde est injuste...");
		return quantiteArgent;
	}
	
	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		System.out.println(argent + " sous ! Je te remercie généreux donnateur!");
	}
	
}
