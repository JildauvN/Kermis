import java.util.ArrayList;

public class Kassa {
	double totaleOpbrengst = Botsauto.opbrengst + Spin.opbrengst + Spiegelpaleis.opbrengst +
			Spookhuis.opbrengst + Hawaii.opbrengst + LadderKlimmen.opbrengst;
	int totaalKaartjes = Botsauto.kaartjes + Spin.kaartjes + Spiegelpaleis.kaartjes + 
			Spookhuis.kaartjes + Hawaii.kaartjes + LadderKlimmen.kaartjes;
	static ArrayList<Double> belastingen = new ArrayList<>();
	static void afdrachten() {
		if (belastingen.size() == 0) {
			System.out.println("Er zijn nog geen belastingen afgedragen");
		} else {
			System.out.println("De afgedragen belastingen zijn: ");
			for(double a : belastingen) {
				System.out.println("€" + a);
			}
		}
	}
}
