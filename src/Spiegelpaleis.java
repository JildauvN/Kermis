
public class Spiegelpaleis extends Attractie{
	String naam = "het spiegelpaleis";
	static double prijs = 2.75, opbrengst;
	static int oppervlakte, kaartjes;
	@Override
	void draaien() {
		System.out.println("Er is gekozen voor "+ naam + ", deze attractie draait nu.");
		opbrengst += prijs;
		kaartjes++;
	}
}
