package practice04;

public class regex {

	public static void main(String[] args) {

		String b = "Haluk 1453 ?!@$_";

		System.out.println("orjinal metin ---> " + b);

		System.out.println();

		// \\d ifadesi tum rakamlari(digit) temsil eder.
		System.out.println("Tüm rakamlarýn * hali ---> " + b.replaceAll("\\d", "*"));
		// ===> \\D rakamlar disindaki hersey
		System.out.println("Tüm rakam hariclerin * hali ---> " + b.replaceAll("\\D", "*"));

		System.out.println();

		// ==> \\S space disindaki hersey
		System.out.println("Tüm space hariclerin * hali ---> " + b.replaceAll("\\S", "*"));

		// ==> \\s space ifadesidir.
		System.out.println("Tüm space'nin * hali ---> " + b.replaceAll("\\s", "*"));

		// replace ile yapma
		System.out.println("replace ile Tüm space'nin * hali ---> " + b.replace(" ", "*"));

		System.out.println();

		// ==> \\w ifadesi (word->kelime ve hadf) a-z A-Z 0-9 _ bunlari kapsar
		System.out.println("Tüm harf ve rakamlarýn * hali ---> " + b.replaceAll("\\w", "*"));

		// ==> \\W ifadesi a-z A-Z 0-9 ve _ disindakileri kapsar

		System.out.println("Tüm harf ve rakam  hariclerin * hali ---> " + b.replaceAll("\\W", "*"));
	}

}
