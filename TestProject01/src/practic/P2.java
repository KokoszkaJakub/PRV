package practic;

import javax.swing.JOptionPane;

public class P2 {
	static String dayName(int nr) {
		switch (nr) {
		case 1:
			return "poniedziałek";
		case 2:
			return "wtorek";
		case 3:
			return "środa";
		case 4:
			return "czwartek";
		case 5:
			return "piątek";
		case 6:
			return "sobota";
		case 7:
			return "niedziela";
		default:
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		try {
			String nrTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia (od 1 do 7):");
			int nr = Integer.parseInt(nrTxt);
			String day = dayName(nr);
			JOptionPane.showMessageDialog(null, day);
		} catch (IllegalArgumentException e) {
			JOptionPane.showMessageDialog(null, "Podałeś błędny numer dnia!!", "Błąd",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}
