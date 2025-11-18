package personnages;

public class Ronin extends Humain {
	private int honneur = 1;

	public Ronin(String nom, String boissonFavorite, int quantiteArgent) {
		super(nom, boissonFavorite, quantiteArgent);
	}

	public void donner(Commercant beneficiaire) {
		int argentDonne = getQuantiteArgent() / 10;
		parler(beneficiaire.getNom() + " prend ces " + argentDonne + " sous");
		beneficiaire.recevoir(argentDonne);
		perdreArgent(argentDonne);
	}

	public void provoquer(Yakuza adversaire) {

		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = honneur * 2;
		if (force >= adversaire.getReputaion()) {
			int argentGagne = adversaire.getQuantiteArgent();
			gagnerArgent(argentGagne);
			parler("Je t'ai eu petit yakuza!");
			adversaire.perdre();
		} else {
			honneur--;
			adversaire.gagner(getQuantiteArgent());
			perdreArgent(getQuantiteArgent());
		}
	}
}
