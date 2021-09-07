package day36_Inheritance;

public class Memur extends Muhasebe {

	public static void main(String[] args) {

		Memur m1 = new Memur();

		Memur m2 = new Memur();

		m1.isim = "Cumali";
		m1.soyisim = "korkmaz";
		m1.adres = "falan fesmekan";
		m1.saatUcreti = 20;
		m1.statu = "chef";
		m1.tel = "0123456789";
		m1.id = m1.idAta();
		m1.maas = m1.maasHesapla();

		System.out.println(m1.isim + "\n" + m1.soyisim+  "\n" +m1.tel+ "\n" + m1.adres + "\n" + m1.saatUcreti + "\n" +m1.id + "\n" + m1.maas);
		

	}

}
