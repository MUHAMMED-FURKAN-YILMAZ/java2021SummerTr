package day05_Wrapper_Concatenation;

public class C3_Concatenation02 {

	public static void main(String[] args) {
		
		int sayi=7;
		char ilkHarf='a';
		String str="Java";
		
		
		System.out.println(sayi+str+ilkHarf);// 7Javaa
		System.out.println(sayi+ilkHarf+str);//104Java..7+ASCII(97)+Java=104Java
		// char matematiksel islemde kullanlýrsa ASCII Table degerini alir.
		
		//7a yazdirin.
		System.out.println(""+sayi+ilkHarf);
	
	}

}
