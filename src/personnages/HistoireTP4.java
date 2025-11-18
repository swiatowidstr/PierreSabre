package personnages;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
		
		Humain prof = new Humain("Prof", "Kombucha", 54);
		
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		System.out.println("\n");
		
		Commercant marco = new Commercant( "Marco", 50);
		marco.direBonjour();
		marco.seFaireExtroquer();
		marco.recevoir(15);
		marco.boire();
		System.out.println("\n");
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.extroquer(marco);
		System.out.println("\n");
		
		Ronin roro = new Ronin("Roro", "shoshu", 60);
		roro.direBonjour();
		roro.donner(marco);
		System.out.println("\n");
		
		roro.provoquer(yaku);

	}
	
}
