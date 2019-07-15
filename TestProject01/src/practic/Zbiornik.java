package practic;

public class Zbiornik {
	private double pojemnosc;
	private double ileLitrow;
	final private double minPojemnosc = 0;
	int id;

	static int nastepneId = 0;

	/**
	 * @return the pojemnosc
	 */
	public double getPojemnosc() {
		return pojemnosc;
	}

	/**
	 * @param pojemnosc the pojemnosc to set
	 */
	public void setPojemnosc(double pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	/**
	 * @return the ileLitrow
	 */
	public double getIleLitrow() {
		return ileLitrow;
	}

	/**
	 * @param ileLitrow the ileLitrow to set
	 */
	public void setIleLitrow(double ileLitrow) {
		this.ileLitrow = ileLitrow;
	}

	/**
	 * @return the minPojemnosc
	 */
	public double getMinPojemnosc() {
		return minPojemnosc;
	}

	void wylej(double ilosc) {
		this.ileLitrow -= ilosc;
	}
	void wlej(double ilosc) {
		this.ileLitrow += ilosc;
	}

	Zbiornik(double ileLitrow, double pojemnosc) {
		this.ileLitrow = ileLitrow;
		this.pojemnosc = pojemnosc;
		nastepneId++;
		id = nastepneId;

	}

	void podajDane() {
		System.out.println("Zbiornik nr " + id + " pojemnosc: " + getPojemnosc() + " obecnie znajduję się w nim: "
				+ getIleLitrow());
	}

	public static void main(String[] args) {
		Zbiornik jedenZ = new Zbiornik(5, 10);
		Zbiornik dwaZ = new Zbiornik(5, 10);
		Zbiornik trzyZ = new Zbiornik(5, 10);
		Zbiornik czteryZ = new Zbiornik(5, 10);

		jedenZ.wylej(0);
		jedenZ.wlej(0);
		jedenZ.podajDane();
		dwaZ.podajDane();
		trzyZ.podajDane();
		czteryZ.podajDane();
	}
}
