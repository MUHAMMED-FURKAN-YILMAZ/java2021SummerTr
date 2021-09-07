package kendiCalismam;

import java.util.Arrays;

public class IkiArraydeOrtakElemanlar {

	public static void main(String[] args) {
		
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };

		String ortak="";
		
		for (int i = 0; i < names1.length; i++) {
	
			for (String w : names2) {
			if (w.equals(names1[i])) {
				ortak+=w+" ";
			}
		}
		
		}
		System.out.println(ortak);
	}

}
