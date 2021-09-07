package Practice02;

import java.util.Scanner;

public class C4_Practice {

	public static void main(String[] args) {

		/*
	     *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	     *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	        eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	         
	         üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, 
	         herhangi iki kenar farký diger kenardan büyük olmali
	         a+b>c>a-b
	         a+c>b>a-c  
	         b+c>a>b-c  
	        a=b=c ise es kenar ucgen 
	         
	     */
		
		 Scanner scan=new Scanner(System.in);
	        System.out.print("a  kenarýný  giriniz : ");
	        int a=scan.nextInt();
	        
	        System.out.print("b kenarýný  giriniz : ");
	        int b=scan.nextInt();
	        
	        System.out.print("c  kenarýný  giriniz : ");
	        int c=scan.nextInt();
	    
	        
	    if (a+b>c && a-b<c && a+c>b && a-c<b && b+c>a && b-c<a) {//ücgen olayý kontrol eder
	        
	        if (a==b && b==c) {//ücgenin eskenarlýðýný kontrol eder
	            System.out.println("ucgeniniz eskenar");
	            
	        } else System.out.println("ucgeniniz eskenar degil");//ucgen ama eskear olamama durumu
	        
	    } else System.out.println("girdiginiz kenarlar bir ucgen belirtmez");//ucgen olmama durumu
		
	    scan.close();
	}										

	}


