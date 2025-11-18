package personnages;

public class Humain {

	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire;

	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
		this.memoire = new Humain[3];
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonFavorite() {
		return boissonFavorite;
	}

	public int getQuantiteArgent() {
		return quantiteArgent;
	}

	protected void parler(String texte) {

		System.out.println("(" + getNom() + ") -" + texte);
	}

	public void direBonjour() {

		this.parler("Bonjour ! J m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	}

	public void boire() {

		this.parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {

		if (quantiteArgent >= prix) {

			parler("Jai " + quantiteArgent + " sous en poche. " + "Je vais m'acheter un/une " + bien + " à " + prix
					+ " sous");
			perdreArgent(prix);

		} else {

			parler("Je n'ai plus que " + quantiteArgent + " en poche." + "Je ne peux même pas m'offrir un " + bien
					+ " à " + prix + " sous");
		}
	}

	protected void gagnerArgent(int gain) {

		quantiteArgent += gain;
	}

	protected void perdreArgent(int perte) {

		if (quantiteArgent >= perte) {
			quantiteArgent -= perte;
		} else {
			quantiteArgent = 0;
		}
	}

	public void faireConnaissanceAvec(Humain autreHumain) {

		direBonjour();
		repondre(autreHumain);
		memoriser(autreHumain);
		autreHumain.memoriser(this);
	}

	private void memoriser(Humain humain) {
		if (nbConnaissance < memoire.length) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		} else {
			nbConnaissance = 0;
		}
	}

	private void repondre(Humain humain) {

		humain.direBonjour();
	}

	public void listerConnaissance() {
		
		parler("Je connais beacoup de monde dont : ");
		for (int i = 0; i < nbConnaissance; i++) {
			System.out.println(memoire[i].getNom());
		}
	}
}
