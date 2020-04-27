import java.util.Scanner;

public class Monteur {
	static void bezoekje() {
		System.out.println("Voor welke attractie heeft u een monteur geroepen? typ 1 voor Spin of 2 voor Hawaii");
		switch (new Scanner(System.in).nextInt()) {
			case 1: 
				Spin.sindsMonteur = 0;
				System.out.println("De spin heeft een onderhoudsbeurt gehad.");
				break;
			case 2:
				Hawaii.sindsMonteur = 0;
				System.out.println("Hawaii heeft een onderhoudsbeurt gehad.");
				break;
			default:
				System.out.println("Verkeerde invoer, er is geen monteur geweest.");
		} 
	}
}
