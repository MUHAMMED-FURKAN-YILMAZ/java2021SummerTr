package day28_StaticBlock_PassByValue;

public class C03_PassByValue {

	public static void main(String[] args) {

		// JAVA PASS BY VALUE'DUR
		
		double fiyat=100;
		
		// fiyatta %10 indirim yapacam ve yeni fiyati dondurecem
		
		System.out.println("method call ile yazdirilan indirimli fiyat "+indirimYap(fiyat));//90.0
		
		System.out.println("method calistiktan sonra fiyat : "+fiyat);//100.0 atama yapmadigim sadece ustte yazdirdigim icin hala fiyat=100
		
		// variable'in sadece ismine degil scopa'a da bakmaliyim..
		// bu ornekte ustte de altta da fiyat variable'i var. ama scope'lar farkli oldugu icin aslinda farkli variable
		
		int zamyuzdesi=15;
		zamYap(zamyuzdesi);
	}

	private static void zamYap(int zamyuzdesi) {
		// Javaya bir method olusturdugumuzda java bizim main method'da kullandigimiz
		// variable isminde clone/kopya bir variable olusturur
		// bunun amaci kod takibini kolaylastirmaktir
		// bu degiskenin ismini degistirsek de kodumuz problemsiz calisir
		
	}

	private static double indirimYap(double fiyat) {

		fiyat=fiyat*90/100;
		System.out.println("method'daki indirimli fiyat : "+fiyat);//90.0
		
		return fiyat;
	}

}
