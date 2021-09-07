package day28_StaticBlock_PassByValue;

public class C01_StaticBlocks {

	static int sayi=10;
	
	static {
		System.out.println("static block calisti");
		sayi=20;
	}
	static {
		System.out.println("2.static block calisti");
		sayi=30;
	}
	
	static {
		System.out.println("3.static block calisti");
		sayi=45;
	}
	
	public static void main(String[] args) {

	System.out.println("main method'un ilk satirinda sayi : "+ sayi); // normalde 10 derdik ..AMA..
			//  BU classta static block var. MA�N METHODDAN B�LE ONCE CAL�S�R.
			// kullanilan classlarin %90'�nda static block yoktur
			// static block yukaridan asagi calisir
	}
	
	static {
		System.out.println("Main method'dan sonraki static block calisti");
		sayi=100;
	}
	
	
}
