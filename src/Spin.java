
public class Spin extends RisicorijkeAttractie implements GokAttractie{
	String naam = "de spin";
	static double opbrengst;
	double belasting, prijs = 2.25;
	static int oppervlakte, kaartjes, sindsMonteur;
	@Override
	void draaien() {
		sindsMonteur++;
		System.out.println("Er is gekozen voor "+ naam); // + ", deze attractie draait nu.");
		try {
			opstellingCheck();
			opbrengst += prijs;
			kaartjes++;
			belasting += 0.3*prijs;
			System.out.println("De attractie draait nu.");
		} catch (Exception e){
			System.out.println("ROEP EEN MONTEUR om deze attractie weer te kunnen gebruiken, typ m");
		}
		
	}
	void opstellingCheck() throws Exception{
		System.out.println("De opstelling wordt gecheckt");
		if (sindsMonteur>5) throw new Exception("Onderhoudsbeurt nodig");
	}
	
	public double kansSpelBelastingBetalen() {
		double temp = belasting;
		opbrengst -= belasting;
		belasting = 0;
		return temp;
	}
}
