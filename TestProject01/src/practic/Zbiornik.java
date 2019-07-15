package practic;

public class Zbiornik {
	double pojemnosc;
	double ileLitrow;
	final double minPojemnosc = 0;
	int id;

	static int nastepneId = 0;

	void wylej(double ilosc) {
		if ((this.ileLitrow - ilosc) >= minPojemnosc) {
			this.ileLitrow = this.ileLitrow - ilosc;
		} else {
			System.out.println("brak wystarczającej iloci płynu w zbiotniku nr: " + id + " wewnątrz znajduję się "
					+ ileLitrow + " zadana ilość: " + ilosc);
			System.out.println("operacja nie została wykonana");

		}

	}

	void wlej(double ilosc) {
		if ((this.ileLitrow + ilosc) <= pojemnosc) {
			this.ileLitrow = this.ileLitrow + ilosc;
		} else {
			System.out.println("brak wystarczającej iloci miejsca w zbiotniku nr: " + id + " maksymalna pojemność"
					+ " zbiornika to: " + pojemnosc + " zadana ilosc to: " + (this.ileLitrow + ilosc));
			System.out.println("operacja nie została wykonana");
		}
	}
	void przelej() {
		
	}

	Zbiornik(double ileLitrow, double pojemnosc) {
		this.ileLitrow = ileLitrow;
		this.pojemnosc = pojemnosc;
		nastepneId++;
		id = nastepneId;

	}

	void podajDane() {
		System.out.println(
				"Zbiornik nr " + id + " pojemnosc: " + pojemnosc + " obecnie znajduję się w nim: " + ileLitrow);
	}

	public static void main(String[] args) {
		Zbiornik jedenZ = new Zbiornik(5, 10);
		Zbiornik dwaZ = new Zbiornik(7, 10);
		Zbiornik trzyZ = new Zbiornik(5, 10);
		Zbiornik czteryZ = new Zbiornik(5, 10);

		dwaZ.wlej(6);

	}
}
