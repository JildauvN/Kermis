
import java.util.Scanner;

public class Kermis {
	static Botsauto botsauto = new Botsauto();
	static Spin spin = new Spin();
	static Spiegelpaleis spiegelpaleis = new Spiegelpaleis();
	static Spookhuis spookhuis = new Spookhuis();
	static Hawaii hawaii = new Hawaii();
	static LadderKlimmen ladderklimmen = new LadderKlimmen();
	static Attractie[] alleAttracties = {botsauto, spin, spiegelpaleis, spookhuis, hawaii, ladderklimmen};
	static Attractie attractie;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welkom op de kermis!");
		System.out.println("Maak een keuze uit een van de volgende acties:");
		System.out.println("1 voor een ritje in de botsauto's\n2 voor een ritje in de spin\n3 voor "
				+ "een ritje in het spiegelpaleis\n4 voor een ritje in het spookhuis\n5 voor een ritje "
				+ "in hawaii\n6 voor het gokspel ladderklimmen\no voor de huidige omzet\nk voor het "
				+ "huidig aantal verkochte kaartjes\nm om een monteur te roepen\nb voor een bezoek van "
				+ "de belastinginspecteur\na om de belastingafdrachten te laten zien\nq om af te sluiten");
		boolean opnieuw = true;
		while (opnieuw) {
			switch (input.nextLine()) {
				case "1":
					attractie = botsauto;
					attractie.draaien();
					break;
				case "2":
					attractie = spin;
					attractie.draaien();
					break;
				case "3":
					attractie = spiegelpaleis;
					attractie.draaien();
					break;
				case "4":
					attractie = spookhuis;
					attractie.draaien();
					break;
				case "5":
					attractie = hawaii;
					attractie.draaien();
					break;
				case "6":
					attractie = ladderklimmen;
					attractie.draaien();
					break;
				case "q":
					opnieuw = false;
					break;
				case "o":
					System.out.println("De totale omzet is nu: €" + new Kassa().totaleOpbrengst);
					break;
				case "k":
					System.out.println("Het totale aantal kaartjes is nu: " + new Kassa().totaalKaartjes);
					break;
				case "m":
					Monteur.bezoekje();
					break;
				case "b":
					BelastingInspecteur.bezoekje();
					break;
				case "a":
					/*if (Kassa.belastingen.size() == 0) {
						System.out.println("Er zijn nog geen belastingen afgedragen");
					} else {
						System.out.println("De afgedragen belastingen zijn: ");
						for(double a : Kassa.belastingen) {
							System.out.println("€" + a);
						}
					}*/
					Kassa.afdrachten();
					break;
				default: 
					System.out.println("Verkeerde invoer");
					
			}
			if(opnieuw)System.out.println("\nMaak een nieuwe keuze:");
		}
	}

}
