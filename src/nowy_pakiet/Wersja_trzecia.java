package nowy_pakiet;

public class Wersja_trzecia {
	private String imie, nazwisko;

	@Override
	public String toString() {
		return "Wersja_trzecia [imie=" + imie + ", nazwisko=" + nazwisko + ", getImie()=" + getImie()
				+ ", getNazwisko()=" + getNazwisko() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Wersja_trzecia(String imie, String nazwisko) {
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

}
