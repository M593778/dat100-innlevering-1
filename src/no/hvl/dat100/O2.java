package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O2 {

	public static void main(String[] args) {

		String p = showInputDialog("Bruttoinntekt for 2024");

		int x = parseInt(p);

		double t = 0;

		// Ingen trinnskatt
		if (x >= 0 && x <= 208050) {
			t = 0;
		}
		// Trinn 1
		else if (x >= 208051 && x <= 292850) {
			t = ((x - 208050) * 0.017);
		}
		// Trinn 2
		else if (x >= 292851 && x <= 670000) {
			t = (((292850 - 208051) * 0.017) + ((x - 292851) * 0.04));
		}
		// Trinn 3
		else if (x >= 670001 && x <= 937900) {
			t = (((292850 - 208051) * 0.017) + ((670000 - 292851) * 0.04) + ((x - 670001) * 0.136));
		}
		// Trinn 4
		else if (x >= 937901 && x <= 1350000) {
			t = (((292850 - 208051) * 0.017) + ((670000 - 292851) * 0.04) + ((937900 - 670000) * 0.136)
					+ ((x - 937901) * 0.166));
		}
		// Trinn 5
		else if (x >= 1350001)
			t = (((292850 - 208051) * 0.017) + ((670000 - 292851) * 0.04) + ((937900 - 670000) * 0.136)
					+ ((1350000 - 937901) * 0.166) + (x - 1350001) * 0.176);
		System.out.println("Trinnskatt på" + " " + t);
	}
}
