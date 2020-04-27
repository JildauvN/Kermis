
public class LadderKlimmen extends Attractie implements GokAttractie{
	String naam = "ladder klimmen";
	static double opbrengst;
	double belasting, prijs = 5.0;
	static int oppervlakte, kaartjes;
	@Override
	void draaien() {
		System.out.println("Er is gekozen voor "+ naam + ", deze attractie draait nu.");
		opbrengst += prijs;
		kaartjes++;
		belasting += 0.3*prijs;
	}
	public double kansSpelBelastingBetalen() {
		double temp = belasting;
		opbrengst -= belasting;
		belasting = 0;
		return temp;
	}
}
