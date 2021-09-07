package day13_MethodCreation;

public class C1_MethodCreation01 {

	public static void main(String[] args) {
		
// bir method'u olusturmak o methodu calistirmak icin yeterli degildir!
// eger bir methodu calistirmak isterseniz
// Method Call ( o methodu cagirirsiniz )

// method call yapmak icin method'un adi ve parametreleri yazdirilmalidir.
		toplama(20,40);
// sadece method call yaptigimizda method calisir	
// eger methodun icinde bir sey yazdiriyorsak consol'da o yaziyi goruruz	
	
// ancak methodumuz return type'a sahipse bize bir sonuc return edecektir
//bu sonucu ya direkt yazdiririz 	
		
	System.out.println(toplama(15,20));			
		
//	ya da donen sonucu bir variable'a atayabiliriz
		
	int sonuc=toplama(10,15);	
	System.out.println(sonuc);	
		
	}

	public static int toplama(int sayi1, int sayi2) {
	
		System.out.println("method calisti");
		
	return sayi1+sayi2;
	
	}
}
