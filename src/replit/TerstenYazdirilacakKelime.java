package replit;

import java.util.Arrays;

public class TerstenYazdirilacakKelime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String kelime= "tersten Yazd�r�lacak Kelime";
				String tersYazdir[]= kelime.split("");// split methodu ile harfaler aras�n� ay�rd�k
				
				System.out.println(Arrays.toString(tersYazdir));// harfler aras� ayr�lm�� �ekilde yazd�k.
				String teString[]=new String[tersYazdir.length];// yeni bir dizi tayin edip ters yazd�r�lacak
																	//kelimnin array halini att�k
				for (int i = 0; i < tersYazdir.length; i++) {
					
						teString[i]=tersYazdir[tersYazdir.length-1-i];   // Arrayi tayin ettik
						
							
				}for (int i = 0; i < teString.length; i++) {
																// Arrayi yazzd�rd�k
						System.out.print(teString[i]);
						

	}
	}
}
