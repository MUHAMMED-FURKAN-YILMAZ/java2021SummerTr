package day45_Interfaces;

public class C02_SahinRunner {

	public static void main(String[] args) {
		
		String music1=" ali";
		
		C02_Sahin s1=new C02_Sahin();
		s1.ayna();
		s1.ebat();
		s1.jant();
		s1.kapi();
		s1.kaporta();
		s1.koltuk();
		s1.motor();
		s1.yakit();
		System.out.println(C02_IcDonanim.music);//underground
		// s1.kumas="deri";// final variable assignment yapilamaz
		
		System.out.println(C02_IcDonanim.RENK);//ahsap
		System.out.println(C02_DisDonanim.RENK);//metalik
		System.out.println(C02_Lastik.RENK);//siyah beyaz yanakli
		
		System.out.println(s1.sisLambasi());// obj ile parent interface'den concrete method call edildi
		System.out.println(C02_DisDonanim.boya());// interface name ile interface'den concrete method call edildi
		
		
	}

}
