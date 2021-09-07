package day36_Inheritance;

public class Personel {

	public int id;

	public static int sayac = 1000;

	public String isim;

	public String soyisim;

	public String adres;

	public String tel;

	
	public int idAta() {
		this.id = sayac++;
		return id;
		// return this.id=sayac++; da olur
	}

}
