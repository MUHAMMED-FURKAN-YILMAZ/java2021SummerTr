package OgrenciPractice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C02_ATM_Project {

	static double bakiye;
	static String kartNo = "";
	static int sifrem = 1234;

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// kartsiz islem gibi. hesap no'su ile islem yapacagiz

		System.out.println("JAVA BANK'A HOS GELDINIZ !\n\n");

		int sifre;

		do {

			System.out.print("Lutfen kart numaranizi giriniz-->");
			kartNo = scan.nextLine();

			System.out.print("Lutfen sifrenizi giriniz");
			sifre = scan.nextInt();
			scan.nextLine();// dummy

			if (sifre != sifrem) {
				System.out.println("Hatali tuslama yaptiniz.\nLutfen tekrar deneyiniz");
				System.out.println("******************************************************\n");
			}

		} while (sifre != sifrem || kartNo.replace(" ", "").length() != 16);

		atmPanel();

	}

	private static void atmPanel() {
		System.out.println("Bilgileriniz kotrol ediliyor...");
		System.out.println("********************************");
		System.out.println("Sifreniz onaylandi!");

		char islem = ' ';
		do {
			System.out.println(
					"Lutfen yapmak istediginiz islemi giriniz...\nA-Para yatirma\nB-Para cekme\nC-Para gonderme\nD-Sifre degistirme"
							+ "\nE-Bakiye sorgula\nF-Cikis");
			islem = scan.next().toUpperCase().charAt(0);

			switch (islem) {
			case 'A':
				paraYatir();
				break;
			case 'B':
				paraCek();
				break;
			case 'C':
				paraGonder();
				break;
			case 'D':
				sifreDegistir();
				break;
			case 'E':
				bakiyeSorgula();
				break;
			case 'F':
				System.out.println("Fatura ister misiniz...\nEvet icin 'E' - dogayi korumak icin 'H'");
				char islem2 = scan.next().toUpperCase().charAt(0);
				if (islem2 == 'E') {
					fatura();
				} else {
					System.out.println("Tebrikler dogayi korudugunuz icin tesekkur ediyoruz");
				}
				break;
			default:
				System.out.println("Lutfen gecerli bir islem seciniz...\n");
				break;
			}

		} while (islem != 'F');

	}

	private static void fatura() {

		LocalDateTime ldt=LocalDateTime.now();
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MMM/yy"+" "+"HH:mm");
		System.out.println("+-------------------+\r\n"
						 + "|"+ldt.format(dtf)+"    |\r\n"
						 + "|                   |\r\n"
						 + "|      JAVA BANK    |\r\n"
						 + "|                   |\r\n"
						 + "|  Bakiyeniz "+bakiye+"    |\r\n"
						 + "|                   |\r\n"
						 + "|                   |\r\n"
						 + "|                   |\r\n"
						 + "|                   |\r\n"
						 + "|                   |\r\n"
						 + "|     TESEKKURLER   |\r\n"
						 + "+-------------------+\r\n"
						 + "");
		
		
		
		
	}

	private static void bakiyeSorgula() {
		System.out.println("Bakiyeniz ==>$" + bakiye);
		System.out.println("********************\n");
	}

	private static void sifreDegistir() {

		System.out.println("Lutfen sifrenizi dogrulayiniz...");
		int yeniSifre = scan.nextInt();
		if (sifrem == yeniSifre) {
			System.out.println("Sifreniz dogrulandi\nLutfen yeni sifrenizi giriniz...");
			sifrem = scan.nextInt();
		} else {
			System.out.println("Sifreniz eselesmedi !");
			System.out.println("************************");
		}

	}

	private static void paraGonder() {

		System.out.println("Lutfen gondereceginiz kisinin IBAN'ini giriniz...");
		scan.nextLine();// dummy
		String IBAN = scan.nextLine();

		if (IBAN.startsWith("TR") && IBAN.replaceAll("\\s", "").length() == 26) {
			System.out.println("IBAN bilgileri kotrol ediliyor...\nIBAN dogrulandi");
			double havaleTutari = scan.nextDouble();

			if (bakiye >= havaleTutari) {
				bakiye -= havaleTutari;
				System.out.println("Islem tamamlandi !");
				System.out.println("********************\n\n");
			} else {
				System.out.println("Yetersiz bakiye !");
				System.out.println("********************\n\n");
			}
		} else {
			System.out.println("********************\n\n");
			System.out.println("Gecersiz IBAN");
		}

	}

	private static void paraCek() {
		System.out.println("Lutfen cekmek istediginiz tutari giriniz...");
		double cekilenPara = scan.nextDouble();
		if (bakiye >= cekilenPara) {
			bakiye -= cekilenPara;
			System.out.println("Islem tamamlandi !");
			System.out.println("********************\n\n");
		} else {
			System.out.println("Yetersiz bakiye !");
			System.out.println("********************\n\n");
		}

	}

	private static void paraYatir() {

		System.out.println("Lutfen yatirmak istediginiz tutari giriniz...");
		double yatirilanPara = scan.nextDouble();
		bakiye += yatirilanPara;
		System.out.println("Islem tamamlandi !");
		System.out.println("********************\n\n");
	}

}
