package practic;

public class Monitor {
	private String nazwa;
	private int szerokosc;
	private int wysokosc;
	private int wielkoscWCalach;
	private int waga;
	private int id;
	
	
	static int nastepneId = 0;

	public void wlacz() {
		System.out.println(nazwa + "TV został włączony");
	}

	public void wylacz() {
		System.out.println(nazwa + "TV został wylączony");
		System.out.println();
		;
	}

	public void podajDana() {
		System.out.println("ID: " + id);
		System.out.println("marka: " + nazwa);
		System.out.printf("DANE: " + "\n     szerokość: " + szerokosc + "cm" + "\n     wysokosc: " + wysokosc + "cm"
				+ "\n     ilosc cali: " + wielkoscWCalach + "cal" + "\n     waga: " + waga + "kg\n");
	}

	Monitor(String nazwa, int szerokosc, int wysokosc, int wielkoscWCalach, int waga) {
		this.nazwa = nazwa;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
		this.wielkoscWCalach = wielkoscWCalach;
		this.waga = waga;
		nastepneId++;
		id = nastepneId;

	}

	public static void main(String[] args) {

		/*
		 * Monitor Benq = new Monitor(); Monitor HTC = new Monitor(); Monitor DELL = new
		 * Monitor(); Monitor Sony = new Monitor();
		 * 
		 * 
		 * Sony.szerokosc = 125; Sony.wysokosc = 102; Sony.wielkoscWCalach = 32;
		 * Sony.waga = 12;
		 */
		Monitor Benq = new Monitor("Benq", 125, 142, 32, 15);
		Monitor Sony = new Monitor("Sony", 100, 100, 27, 13);
		Monitor DELL = new Monitor("DELL", 145, 111, 28, 25);
		Monitor XYZ = new Monitor("XYZ", 145, 123, 41, 18);
		Monitor Samsung = new Monitor("Samsung", 190, 155, 64, 36);

		
		
		Benq.wlacz();
		Benq.podajDana();
		Benq.wylacz();

		Sony.wlacz();
		Sony.podajDana();
		Sony.wylacz();
		
		DELL.wlacz();
		DELL.podajDana();
		DELL.wylacz();
		
		XYZ.wlacz();
		XYZ.podajDana();
		XYZ.wylacz();
		
		Samsung.wlacz();
		Samsung.podajDana();
		Samsung.wylacz();
	}
}
