package Practice10;

public class Runner03 {
/*
-Hayvanlar�n beslenme,barinma, boyut ve solunum ozellikleri  ile ilgili methodlar bar�n�ran Hayvan isminde bir class olustural�m

-Hayvan s�n�f�n�n SubClass� bir Kus Class� olu�tural�m ve bu class ucma ve bar�nma methodlar�n� i�ersin

-Hayvan s�n�f�n�n SubClass� bir Bal�k Class� olu�tural�m ve bu class yuzme ve Solunum methodlar�n� i�ersin

-kus s�n�f�n�n SubClass� bir Guvercin Class� olu�tural�m ve bu class beslenme ve boyut methodlar�n� i�ersin

-Bal�k s�n�f�n�n SubCLass� bir JaponBaligi class� olu�tural�m ve bu class solunum methodu i�ersin ve bu methodu Superclasstan als�n

--Runner class olu�tural�m ve olu�turdu�umuz metholar� �a��ral�m.
 */
	
	public static void main(String[] args) {
		
		Hayvanlar03 h = new Hayvanlar03();
		Kus03 k = new Kus03();
		Guvercin03 g = new Guvercin03();
		Balik03 b = new Balik03();
		JaponBaligi03 j = new JaponBaligi03();
		
		h.barinma();
		h.beslenme();
		h.boyut();
		h.solunum();
		
		k.ucma();
		k.barinma();
		
		g.beslenme();
		g.boyut();
		
		b.solunum();
		b.yuzme();
		
		j.solunum();
		
		
		
		

	}

}
