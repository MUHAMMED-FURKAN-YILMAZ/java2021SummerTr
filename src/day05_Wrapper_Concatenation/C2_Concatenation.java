package day05_Wrapper_Concatenation;

public class C2_Concatenation {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="World";
		int sayi1=3;
		int sayi2=4;
		
		
		//***** kesinlikle sayi ve harf yazmadan sadece variable isimlerini kullanarak***
		
		// Hello1 yazdirin
		System.out.println(str1+(sayi2-sayi1));
		
		// Hello 5 World yazdir
		
		System.out.println(str1+" "+ ++sayi2+" "+str2);
		
		// Hello 34
		System.out.println(str1+" "+sayi1+--sayi2);// sayi2 20. sýrada 5 oldugu icin azalttik
		
		// 7Wold
		
		System.out.println(sayi1+sayi2+str2);
		
		// 34
		
		System.out.println(sayi1+sayi2);//7
		System.out.println(sayi1+""+sayi2);// 34.. araya "" koyarak intlerin arasina string koymuþ oluyoruz. böylece toplama yapmadýk
		
		// int'i String'e cevirmek icin methoda ihtiyac yok, ama istersek kullanabiliriz
		
		String intdanCevrilen=""+sayi1;// eger sayi1 int olsa bu esitliðe izÝn vermezdi. "" ile sayiyi string'e cevirmis olduk
										// bu yontem method kullanmadan int'i String'e cevirir.
		
		
	}

}
