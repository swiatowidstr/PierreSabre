package personnages;

public class Humain {

	private String nom;
	private String boissonFavorite;
	protected int quantiteArgent;

	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
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

		System.out.println("\"" + texte + "\"");
	}

	public void direBonjour() {

		this.parler("Bonjour ! J m'appelle " + nom + " et j'aime boire du " + boissonFavorite);
	}

	public void boire() {

		this.parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {

		if (quantiteArgent >= prix) {

			parler("Jai " + quantiteArgent + " sous en poche. " + "Je vais m'acheter un/une " + bien + " à " + prix + " sous");
			perdreArgent(prix);

		} else {

			parler("Je n'ai plus que " + quantiteArgent + " en poche." + "Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous");
		}
	}

	protected void gagnerArgent(int gain) {

		quantiteArgent += gain;
	}

	protected void perdreArgent(int perte) {

		if (quantiteArgent >= perte) {
			quantiteArgent -= perte;
		}
	}
}
