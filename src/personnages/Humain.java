package personnages;

public class Humain {

	private String nom;
	private String BoissonFavorite;
	private int QuantiteArgent;

	public Humain(String nom, String BoissonFavorite, int QUantiteArgent) {
		this.nom = nom;
		this.BoissonFavorite = BoissonFavorite;
		this.QuantiteArgent = QUantiteArgent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonFavorite() {
		return BoissonFavorite;
	}

	public int getQuantiteArgent() {
		return QuantiteArgent;
	}

	private void parler(String texte) {

		System.out.println("\"" + texte + "\"");
	}

	public void direBonjour() {

		this.parler("Bonjour ! J m'appelle " + nom + " et j'aime boire du " + BoissonFavorite);
	}

	public void boire() {

		this.parler("Mmmm, un bon verre de " + BoissonFavorite + "! GLOUPS !");
	}

	public void acheter(String bien, int prix) {

		if (QuantiteArgent >= prix) {

			parler("Jai " + QuantiteArgent + " sous en poche. " + "Je vais m'acheter un/une " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {

			parler("Je n'ai plus que " + QuantiteArgent + " en poche." + "Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous");
		}
	}

	private void gagnerArgent(int gain) {

		QuantiteArgent += gain;
	}

	private void perdreArgent(int perte) {

		if (QuantiteArgent >= perte) {
			QuantiteArgent -= perte;
		}
	}
}
