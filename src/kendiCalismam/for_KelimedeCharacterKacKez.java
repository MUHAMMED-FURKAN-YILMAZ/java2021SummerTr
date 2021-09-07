package kendiCalismam;

import java.util.Scanner;

public class for_KelimedeCharacterKacKez {

	public static void main(String[] args) {
		/* Kullanicidan bir kelime ve bir karakter girmesini isteyin, 
		 * sonra isimde karakterin kaç kez tekrarlandýðýný kontrol edin 
		 * ornegin : 
		 * char ch1= 'a';
		 * String name =“John came late" => a karakteri = 2
		 */
		
		 Scanner scan = new Scanner(System.in);
	        System.out.println("lutfen bir kelime giriniz");
			String str = scan.nextLine();
		    
			System.out.println("tekrarini ogrenmek istediginiz karakteri giriniz  ");
			char chr=scan.next().charAt(0);
			
			int count=0;
			
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i)==chr) {
					count++;
				}
			}
	System.out.println("Girdiginiz  karakter cumlede " +count+" kere gecmektedir");
	
	}

}
