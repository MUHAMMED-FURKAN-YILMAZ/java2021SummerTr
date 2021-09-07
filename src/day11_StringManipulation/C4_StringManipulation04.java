package day11_StringManipulation;

public class C4_StringManipulation04 {

	public static void main(String[] args) {

		String kkNo = "Java 123 @#";

		System.out.println(kkNo.replace(" ", ""));

		System.out.println(kkNo); 

		// replaceAll()

		System.out.println(kkNo.replaceAll("\\s", "")); // s sadece space
		System.out.println(kkNo.replaceAll("\\s", "*")); // s sadece space
		System.out.println(kkNo.replaceAll("\\S", "*")); // S space olmayan hersey
		System.out.println(kkNo.replaceAll("\\w", "-")); // harf veya rakamlarin hepsi
		System.out.println(kkNo.replaceAll("\\W", "#")); // harf veya rakamlarin disindaki hersey
		System.out.println(kkNo.replaceAll("\\d", "0")); // digit(rakamlar)in hepsi
		System.out.println(kkNo.replaceAll("\\D", "a")); // digit(rakamlar)in disindaki hersey
		// syso icinde yapilan manipulation'lar asil String'i degistirmez
		System.out.println(kkNo);

		kkNo = "1234 5698 1278 5687"; // atama yapinca kalici olarak degistirmis oluruz
		System.out.println(kkNo);

	}

}
