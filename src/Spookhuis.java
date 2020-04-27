
public class Spookhuis extends Attractie{
	String naam = "het spookhuis";
	static double prijs = 3.2, opbrengst;
	static int oppervlakte, kaartjes;
	@Override
	void draaien() {
		System.out.println("Er is gekozen voor "+ naam + ", deze attractie draait nu.");
		opbrengst += prijs;
		kaartjes++;
	}
}
