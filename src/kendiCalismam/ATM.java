package kendiCalismam;

import java.util.Iterator;
import java.util.Scanner;

public class ATM {

	String name="Muhammed Furkan YILMAZ";
	private String password="1234";
	private double bakiye=100100.50;
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	
	public boolean passwordKontrol(String sifre) {
		
		if (sifre.equals(password)) {
			System.out.println("Sifreniz onaylandi");
			boolean TF=true;
			return TF;
		}else {
			System.out.println("Hatali giris");
			boolean TF=false;
			return TF;
		}
		
	}
	public void paraCekme() {
	Scanner scan=new Scanner(System.in) ;
	System.out.println("Cekmek istediginiz tutari tuslayiniz");
		int tutar=scan.nextInt();
		bakiye-=tutar;
		System.out.println("bakiyeniz : "+bakiye+" TL");
		
	}
	public void paraYatirma() {
		Scanner scan=new Scanner(System.in) ;
		System.out.println("Yatirmak istediginiz tutari tuslayiniz");
			int tutar=scan.nextInt();
			bakiye+=tutar;
			System.out.println("bakiyeniz : "+bakiye+" TL");
		
	}
	public String passwordDegistirme() {
		Scanner scan=new Scanner(System.in) ;
		System.out.println("4 haneli, sayilardan olusan sifre giriniz");
		String sifre=scan.next();
		for (int i = 0; i < sifre.length(); i++) {
			if (sifre.charAt(i)<48|| sifre.charAt(i)>57) {
				System.out.println("hatali karakter girdiniz");
				break;
			}else {
				continue;
			}
		}
		System.out.println("Sifreyi tekrar giriniz");
		String sifre2=scan.next();
		
		if (!sifre.equals(sifre2)) {
			System.out.println("Sifreler eslesmedi");
			return password;
			
		}else {
			System.out.println("Sifreniz basariyla degistirildi");
			return sifre;
		}
		
	}
	
	
	
	
}
