package replit;

import java.util.Arrays;

public class TerstenYazdirilacakKelime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String kelime= "tersten Yazdýrýlacak Kelime";
				String tersYazdir[]= kelime.split("");// split methodu ile harfaler arasýný ayýrdýk
				
				System.out.println(Arrays.toString(tersYazdir));// harfler arasý ayrýlmýþ þekilde yazdýk.
				String teString[]=new String[tersYazdir.length];// yeni bir dizi tayin edip ters yazdýrýlacak
																	//kelimnin array halini attýk
				for (int i = 0; i < tersYazdir.length; i++) {
					
						teString[i]=tersYazdir[tersYazdir.length-1-i];   // Arrayi tayin ettik
						
							
				}for (int i = 0; i < teString.length; i++) {
																// Arrayi yazzdýrdýk
						System.out.print(teString[i]);
						

	}
	}
}
