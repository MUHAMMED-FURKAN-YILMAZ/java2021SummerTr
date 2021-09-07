package replit;

import java.util.Arrays;
import java.util.List;

public class list01 {

	public static void main(String[] args) {
		
		//VErilen cumledeki en cok tekrar eden harfi ve sayisini yazdir
		
		String str="Learning java is easy ";
		List<String>list=Arrays.asList(str.split(""));
		
		String enCokTekrarEdenHarf="";
		int harfTekrari=0;
		
		for (int i = 0; i < list.size(); i++) {
			int count=0;
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					count++;
				}
				if (count>harfTekrari) {
					harfTekrari=count;
					enCokTekrarEdenHarf=list.get(i);
				}
			}
		}
		System.out.println("Verilen kelimede/cumlede en cok tekrar eden harf : "+enCokTekrarEdenHarf);
		System.out.println("Verilen kelimede/cumlede en cok tekrar eden harf sayisi: "+harfTekrari);
		
	}

}
