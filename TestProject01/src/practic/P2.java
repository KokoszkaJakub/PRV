package practic;

import javax.swing.JOptionPane;

public class P2 {
	static String dayName(int nr) {
		String day;
		switch (nr) {
		case 1:
			day = "poniedziałek";
			break;
		case 2:
			day = "wtorek";
			break;
		case 3:
			day = "środa";
			break;
		case 4:
			day = "czwartek";
			break;
		case 5:
			day = "piątek";
			break;
		case 6:
			day = "sobota";
			break;
		case 7:
			day = "niedziela";
			break;
		default:
			day = "Błędny nr dnia!";
		}
		return day;
	}

	public static void main(String[] args) {

		String nrTxt = JOptionPane.showInputDialog("Podaj numer dnia tygodnia (od 1 do 7):");
		int nr = Integer.parseInt(nrTxt);
		String day = dayName(nr);
		JOptionPane.showMessageDialog(null, day);
	}

}
