package kendiCalimam_Anlamadiklarim;

import java.util.Iterator;

public class YildizlarlaDikUcgen_Anlamadim {

	public static void main(String[] args) {
	
//      *
//     **
//    * *
//   *  *
//  *****
	
		for (int satir = 1; satir <= 5; satir++) {
            // bosluk icin
            for (int bosluk = 1; bosluk <= 5 - satir; bosluk++)//sola dayalý olmasý için bu for yoruma alýnmalý
                System.out.print(" ");

            // '*' icin
            for (int yildiz = 1; yildiz <= satir; yildiz++) {
                // kenarlarda "*" yazmak icin
                if (satir == 5 || yildiz == 1 || yildiz == satir)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
		
		
	}

}
