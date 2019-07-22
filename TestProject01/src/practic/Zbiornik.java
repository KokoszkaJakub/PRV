package practic;

import java.util.Random;

public class Zbiornik {
	private double pojemnosc;
	private double ileLitrow;
	final private double minPojemnosc = 0;
	private int id;

	static int nastepneId = 0;
	static Random gen = new Random();

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

	void przelej(double ile, Zbiornik gdziePrzelac) {
		wylej(ile);
		gdziePrzelac.wlej(ile);

	}

	Zbiornik(double ileLitrow, double pojemnosc) {
		this.ileLitrow = ileLitrow;
		this.pojemnosc = pojemnosc;
		nastepneId++;
		id = nastepneId;

	}

	void podajDane() {
		
		System.out.println("Zbiornik nr " + id + " pojemnosc: " + pojemnosc + "L" + " obecnie znajduję się w nim: "
				+ ileLitrow + "L" );
	}

	void ileDoPelna() {
		double idp = pojemnosc - ileLitrow;
		System.out.println(idp);
	}

	public static void main(String[] args) {

		Zbiornik[] zbiorniki = new Zbiornik[50];
		for (int a = 0; a < zbiorniki.length; a++) {
			zbiorniki[a] = new Zbiornik(gen.nextInt(10), gen.nextInt(10));
		}
		zbiorniki[0].ileDoPelna();
		zbiorniki[0].podajDane();
		zbiorniki[7].podajDane();
		zbiorniki[10].podajDane();

	}
}
