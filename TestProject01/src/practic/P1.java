package practic;

import javax.swing.JOptionPane;

public class P1 {
	public static void main(String[] args) {
		String aTxt = JOptionPane.showInputDialog("podaj liczbę numer jeden");

		int a = Integer.parseInt(aTxt);

		String btxt = JOptionPane.showInputDialog("podaj drugą liczbę");

		int b = Integer.parseInt(btxt);
		int wynikDodawanie = a + b;
		int wynikOdejmowanie = a - b;
		int wynikMnozenie = a * b;
		System.out.println(" wynik dodawania " + a + " + " + b + " = " + wynikDodawanie);
		System.out.println(" wynik dodawania " + a + " - " + b + " = " + wynikOdejmowanie);
		System.out.println(" wynik mnożenia " + a + " * " + b + " = " + wynikMnozenie);

	}

}
