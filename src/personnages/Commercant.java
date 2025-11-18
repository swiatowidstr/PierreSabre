package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int quantiteArgent) {
		super(nom, "thé", quantiteArgent);
	}

	public int seFaireExtroquer() {
		
		int argentPerdu = getQuantiteArgent();
		perdreArgent(getQuantiteArgent());
		parler("J'ai tout perdu, le monde est injuste...");
		return argentPerdu;
	}

	public void recevoir(int argent) {
		this.gagnerArgent(argent);
		parler(argent + " sous ! Je te remercie généreux donnateur!");
	}

}
