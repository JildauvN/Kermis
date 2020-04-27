
public class BelastingInspecteur {

	static void bezoekje() {
		double dezeBelasting = 0;
		for(Attractie a : Kermis.alleAttracties) {
			if(a instanceof GokAttractie)
				dezeBelasting += ((GokAttractie) a).kansSpelBelastingBetalen();
		}
		Kassa.belastingen.add(dezeBelasting);
		System.out.println("De afgedragen belasting is: €" + dezeBelasting);
	}
}
