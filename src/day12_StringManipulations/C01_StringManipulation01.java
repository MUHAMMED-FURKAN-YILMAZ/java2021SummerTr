package day12_StringManipulations;

public class C01_StringManipulation01 {

	public static void main(String[] args) {

		String str="Java candir";
		
		System.out.println(str.substring(5));// candir
		System.out.println(str.substring(10));//r
		System.out.println(str.substring(11));// =length ise hiclik yazdirir.
		System.out.println("-----"); // �stteki hicligi g�rmek icin. bir anlam� yok
		//System.out.println(str.substring(20));// hata verir cunku>lenght
		
		System.out.println(str.substring(5,8)); //can	
		System.out.println(str.substring(2,3));// v
		System.out.println(str.substring(5,5));// hiclik
		System.out.println("-----"); // �stteki hicligi g�rmek icin. bir anlam� yok
		System.out.println(str.substring(5, 11));// candir
		// System.out.println(str.substring(5, 1));// hata cunku java geri gitmez
	
		System.out.println(str.substring(3,4) + str.substring(8, 9));//ad
	}

}
