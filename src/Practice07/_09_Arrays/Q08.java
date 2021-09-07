package Practice07._09_Arrays;

public class Q08 {

	public static void main(String[] args) {
		
		/*   $ ve  £  isareti olanlarin toplamlarini ayri ayri bulun

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
		
		
		String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		
		String arr[]=str.split(" ");//[$1, $23, $134, $2, $7, $24, £32, £40, £2, £65, £4]
		
		int topDolar=0;
		int topEuro=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains("$")) {
				topDolar+=Integer.parseInt(arr[i].replace("$", ""));
			}else if (arr[i].contains("£")) {
				topEuro+=Integer.parseInt(arr[i].replace("£",""));
			}
		}
		
		System.out.println("Dizideki \"$\" toplami : "+topDolar+"\nDizideki \"£\" toplami : "+topEuro);
		
		
		}

	}


