package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		String heltall = showInputDialog("Skriv inn et heltall");
		int n = parseInt(heltall);
		
		if(n<=0) {
			
			System.out.println("n må være større enn 0");
		}
		else {
			
			int fakultet = 1;
			for (int i = 1; i <= n; i++) {
				fakultet *= i;
			}
		System.out.println(n + "! = " + fakultet);	
		}
		

	}

}
