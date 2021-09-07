package Practice10;

public class Runner03 {
/*
-Hayvanlarýn beslenme,barinma, boyut ve solunum ozellikleri  ile ilgili methodlar barýnýran Hayvan isminde bir class olusturalým

-Hayvan sýnýfýnýn SubClassý bir Kus Classý oluþturalým ve bu class ucma ve barýnma methodlarýný içersin

-Hayvan sýnýfýnýn SubClassý bir Balýk Classý oluþturalým ve bu class yuzme ve Solunum methodlarýný içersin

-kus sýnýfýnýn SubClassý bir Guvercin Classý oluþturalým ve bu class beslenme ve boyut methodlarýný içersin

-Balýk sýnýfýnýn SubCLassý bir JaponBaligi classý oluþturalým ve bu class solunum methodu içersin ve bu methodu Superclasstan alsýn

--Runner class oluþturalým ve oluþturduðumuz metholarý çaðýralým.
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
