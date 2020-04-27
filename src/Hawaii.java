
public class Hawaii extends RisicorijkeAttractie {
	String naam = "Hawaii";
	static double prijs = 2.9, opbrengst;
	static int oppervlakte, kaartjes, sindsMonteur;
	@Override
	void draaien(){
		sindsMonteur++;
		System.out.println("Er is gekozen voor "+ naam);
		try {
			opstellingCheck();
			opbrengst += prijs;
			kaartjes++;
			System.out.println("De attractie draait nu.");
		} catch (Exception e) {
			System.out.println("ROEP EEN MONTEUR om deze attractie weer te kunnen gebruiken, typ m");
		}
		
		
	}
	void opstellingCheck() throws Exception{
		System.out.println("De opstelling wordt gecheckt");
		if (sindsMonteur>10) throw new Exception("Onderhoudsbeurt nodig");
	}
}
