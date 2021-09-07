package Practice01;

import java.util.Scanner;

public class C4_MesafeHizSorusu {

	public static void main(String[] args) {
		
		/*  Problem Tan�m�
        Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
        �rne�in:�stanbul ile Ankara aras� 400km olarak �l��lmektedir. Bu yolu
        ortalama 120 km/saat h�zla giden bir ara� ne kadar s�rede hedefe var�r?
        �rnek Ekran ��kt�s�
        Mesafeyi giriniz: 400
        H�z� giriniz: 100
        S�re 4 saattir.
     */
        Scanner scan =new Scanner(System.in);
        System.out.print("Gideceginiz mesafeyi kilometre cinsinden giriniz : ");
        double mesafe=scan.nextDouble();
        
        System.out.print("Hiznizi km/saat cinsinden giriniz : ");
        double hiz=scan.nextDouble();
        
        double sure=mesafe/hiz;
        System.out.println("yolculuk sureniz :"+sure+" saattir.");
		
        scan.close();

	}

}
