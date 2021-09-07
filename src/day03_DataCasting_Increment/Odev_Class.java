package day03_DataCasting_Increment;

public class Odev_Class {

	public static void main(String[] args) {
	/* Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve 
	  double data tiplerinde birer degisken olusturup adim adim widening yapin ve 
	  yazdirin
   */	
		
		byte sayi1= 20;
		
		System.out.println("byte turunden degisken ile : "+ sayi1);
		
		short sayi2= sayi1;
	
		System.out.println("short turunden degisken ile : "+ sayi2);
		
		int sayi3= sayi2;
		
		System.out.println("int turunden degisken ile : "+ sayi3);
		
		float sayi4= sayi3;
		
		System.out.println("float turunden degisken ile : "+ sayi4);
		
		double sayi5= sayi4;
		
		System.out.println("double turunden degisken ile : "+ sayi5);
		
		
		// Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
		
		int sayi6= 99;
		
		System.out.println("int turunden degisken ile : "+ sayi6);
		 
		short sayi7=(short) sayi6;
		
		System.out.println("short turunden degisken ile : "+sayi7);
		
		byte sayi8= (byte) sayi7;
		
		System.out.println("byte turunden degisken ile : "+ sayi8);
		
		// Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
		
		float sayi9= 1234.75999f;
		
		System.out.println(sayi9);
		
		// Soru 4 ) double 255.36 sayisini int�a ve sonra da olusturdugunuz int
		//          sayiyi byte�a cevirip yazdirin
		
		 double sayi10= 255.36;
		 
		 System.out.println("double degisken turunden degeri : "+ sayi10);
		 
		 int sayi11=(int) sayi10;
		 
		 System.out.println("int degisken turunden degeri : "+ sayi11);
		 
		 byte sayi12=(byte) sayi11;
		 
		 System.out.println("byte turunden degisken degeri : "+ sayi12);
		 
		// Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
		 
		 int sayi13= 120;
		 int sayi14= 30;
		 
		 System.out.println("bolme islemi sonucu : "+ sayi13/sayi14);
		 
		 // Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
		 
		 int sayi15= 2500;
		 double sayi16= 200.5;
		 
		 System.out.println("bolme islemi sonucu : "+ sayi15/sayi16);
		 
		// Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
		
		int sayi17=1000;
		char sayi18='5';
		
		System.out.println("�arpma islemi sonucu : "+ sayi17*sayi18); // ASCII TABLE
		
		float sayi19=50.50f;
		
		System.out.println("bolme islemi sonucu : "+ sayi17/sayi19);

	}

}
