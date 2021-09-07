package day43_Exceptions_Throws_Throw_Finally_CCCE;

public class C08_Soru {
	
	/*
	'ortalama' isminde bir method oluþturun ve int v  - int f  isminde 2 adet parametresi olsun.
	int v = vize
	int f = final
	Eðer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
	Sistem ArithmeticException hatasý versin ve "Notlar 0-100 arasýnda olmalý" mesajýný döndürsün.
	Diðer durumlarda ise,
	vizenin yüzde 40 ýný, finalin yüzde 60 ýný alsýn ve toplasýn.(ortalama =)
	vizeye 120, finale 80 girin.
	Programýn çalýþmasýný saðlayýn. (handle edin)
	 */
	

	// *********** BIR YOL *********** --> *********** IKINCI YOL "//" kismi acildiginda *************
	//--> 1. yolda trow yaptik hatayi gorup kodu kirdik, 
	//--> 2. yolda ise try-catch'de exception'i handle ettik kodu kirmadik
	
	public static void main(String[] args) {
	//	try {
			ortalama(120,80);
	//	} catch (Exception e) {
	//	System.out.println(e);
	//	}
		

	
	}
	
	public static void ortalama(int v, int f) {
		if (v>100 || v<0 || f>100 || f<0) {
			throw new ArithmeticException("Notlar 0-100 arasýnda olmalý");
		}else {
			System.out.println("ortalama : "+((v*4)/10)+((f*6)/10));
		}

	}

}
