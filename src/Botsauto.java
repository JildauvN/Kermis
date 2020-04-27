
public class Botsauto extends Attractie{
	String naam = "de botsauto's";
	static double prijs = 2.5, opbrengst;
	static int oppervlakte, kaartjes;
	@Override
	void draaien() {
		System.out.println("Er is gekozen voor "+ naam + ", deze attractie draait nu.");
		opbrengst += prijs;
		kaartjes++;
	}
}
