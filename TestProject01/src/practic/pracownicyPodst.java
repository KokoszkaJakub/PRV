package practic;

public class pracownicyPodst {

	public static void main(String[] args) {

		Pracownik Magdalena = new Pracownik("Magdalena", "Koko", 10000.0);
		@SuppressWarnings("unused")
		Pracownik Jim = new Pracownik(null, null, 0);
		Magdalena.podajDane();
		System.out.println();
		PracownikMagazyn Marian = new PracownikMagazyn("Marian", "Wolny", 1150.50, 33);
		Marian.podajDane();
	}

}

/**
 * 
 * @author Kuba obiekt <code>Pracownik</code> clasa ta przedstawia pracownika i
 *         wymaga podanie imienie nazwiska i wynagrodzenia
 */
class Pracownik {
	String imie;
	String nazwisko;
	double wynagordzenie;

	Pracownik(String imie, String nazwisko, double wynagrodzenie) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wynagordzenie = wynagrodzenie;
	}

	void podajDane() {
		System.out.println("Mam na imie " + imie);
		System.out.println("Nazywam sie " + nazwisko);
		System.out.println("Moje wynagrodzenie to: " + wynagordzenie + "zł");

	}

}

/**
 * 
 * @author Kuba pracownik magazynu musi posiadac wiek
 */
class PracownikMagazyn extends Pracownik {
	int wiek;

	PracownikMagazyn(String imie, String nazwisko, double wynagrodzenie, int wiek) {
		super(imie, nazwisko, wynagrodzenie);
		this.wiek = wiek;

	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see Ziemia.Pracownik#podajDane()
	 */
	@Override
	void podajDane() {
		// TODO Auto-generated method stub
		super.podajDane();
		System.out.println("moj wiek to " + wiek);
	}

}