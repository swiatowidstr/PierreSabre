package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonFavorite, int quantiteArgent, String clan) {
		super(nom, boissonFavorite, quantiteArgent);
		this.clan = clan;
	}
	
	public int getReputaion() {
		
		return reputation;
	}
	
	public void extroquer(Commercant victime) {

		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens a la vie donne moi ta bourse !");
		int argentGagne = victime.seFaireExtroquer();
		gagnerArgent(argentGagne);
		parler("J'ai piqué les " + argentGagne + " sous de " + victime.getNom() + ", ce qui me fait "
				+ getQuantiteArgent() + " sous dans ma poche. Hi ! Hi!");

	}
	
	public void perdre() {
		parler("J'ai perdu mon duel et mes " + getQuantiteArgent() + " sous, snif... j'ai déshonoré le clan de " + clan);
		perdreArgent(getQuantiteArgent());
		reputation --;
	}
	
	public void gagner(int gain) {
		parler(" Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? "+ "Je l'ai dépouillé de ses " + gain + " sous");
		gagnerArgent(gain);
		reputation++;
	}
}
