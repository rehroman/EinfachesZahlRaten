import java.util.Scanner;

//Ein Zahlenratespiel: Zufallszahl wird erstellt und der User soll diese Zahl erraten.

public class ZahlRaten {

	public static void main(String[] args) {
		int gesuchtMin = 0;
		int gesuchtMax = 100;
		ZahlRaten spiel = new ZahlRaten();
		int gesuchtZahl = spiel.zahlWuerfeln(gesuchtMin, gesuchtMax);

		int eingabeZahl;
		Scanner eingabe = new Scanner(System.in);
		int zaehler = 0;
		
		do {
			zaehler++;
			System.out.println("\nVersuch " + Integer.toString(zaehler) + "\nGib eine Zahl zwischen " + gesuchtMin
					+ " und " + gesuchtMax + " ein:");

			eingabeZahl = eingabe.nextInt();

			if (eingabeZahl == gesuchtZahl) {
				System.out.println("Korrekt! Die gesuchte Zahl ist: " + Integer.toString(gesuchtZahl)
						+ "\nDu hast Versuch " + Integer.toString(zaehler) + " zur Lösung benötigt.");
			} else if (eingabeZahl < gesuchtZahl) {
				System.out.println("Falsch! Die gesuchte Zahl ist größer!");
			} else {
				System.out.println("Falsch! Die gesuchte Zahl ist niedriger!");
			}

		} while (eingabeZahl != gesuchtZahl);
		eingabe.close();
	}

	int zahlWuerfeln(int min, int max) {
		int bereich = (max - min) + 1;
		return (int) (min + (Math.random() * bereich));
	}

}