package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {

		for (int n = 0; n < 10; n++) {

			String poeng = showInputDialog("Gi antall poeng");

			int x = parseInt(poeng);

			if (x < 0 || x > 100) {
				String p = showInputDialog("Ugyldig antall poeng. Gi nytt antall ");
				x = parseInt(p);
			}
			if (x >= 90 && x <= 100) {
				System.out.println("Karakter A");
			}
			if (x >= 80 && x <= 89) {
				System.out.println("Karakter B");
			}
			if (x >= 60 && x <= 79) {
				System.out.println("Karakter C");
			}
			if (x >= 50 && x <= 59) {
				System.out.println("Karakter D");
			}
			if (x >= 40 && x <= 49) {
				System.out.println("Karakter E");
			}
			if (x >= 0 && x <= 39) {
				System.out.println("Karakter F");
			}

		}

	}
}