package day39_Overridding;

public class Overriding {

/*					*****OVERRİDİNG*****
 * Parent classtaki bir METHOD'u child class'a gore ozellestirip kullanmanin adidir.
 * 
 * 					*****OVERRİDİNG KURALLARI*****
 * 1) Overriding create edilirken "method signature"(name+parameters) 
 	 		KESINLIKLE ve ASLAA DEGİSTİRİLEMEZ.
 	 		
 * 2) Overriding create edilirken "access modifier" belirli kurallara gore degistirilebilirler.
 
 * 3) Overriding create edilirken "return type" belirli kurallara gore degistirilebilirler.
 
 * 4) Overriding create edilirken "method body" %99 degistirilir. ama degistirilmezse CTE vermez
  		(amelelik olur overriding amaci body create etmek)
  		
 * 5) Overriding create edilirken "parent --child" relationship sarttir.
  	   TRICK: inheritance olmadan overriding olamaz, OLAMAZ.
  	   
 * 6)"Overridden method" : Parent class'taki methoddur(zavalli ezilen)
 	 "Overriding method" : Child class'taki methoddur(ezen)
 	 
 * 7)"Overriding Method" (child)'in access modifier'i  ya "Overridden method" (Parent) ile ayni
   	   ya da daha genis olmali.Evlat babanin erisimini daraltamaz ama genisletebilir.
   	   	YANİ==>  ****** SubAccMod >= SuperAccMod******
   	   	
 * 8)"Overriding method" (child)'in return type'i void ise "Overriden method" (parent) return type'i 
 		void olmayani kabul etmez..  ayni olmali	 
 
 * 9)"Overriding method" (child)'in return type'i wrapper class'tan ise "Overriden method" (parent) return type'i 
 		wrapper class olmayani kabul etmez.. ayni olmali
 
 	***ISTISNA*** ezen-ezilen arasindaki return type parent-child iliskisi varsa farkli olabilir..(Animal-Dog classindan bak)
 
 * 10)"Overriding method" (child)'in return  type ile "Overriden method" (parent) return arasinda is-A(child-->parent relationship)
   	iliskisi olmali
 
 * 11)Statik methodlar overridig edilemezlerr. 	 
 	 
 * 12)Private methodlar overriding edilemezler.--> Cunku korumak icindir degistirilmesin diye amac korumak
 
 * 13)Final methodlar overriding edilemezler.--> cunku son hali artik degistirilemez de ondan.
 
 * 14)"Polymorphism" -->(Java Coklu bicimlilik)  ***INTERVIEW*** sorusu  -->"overloading" ve "overriding"'den olusan yapiya denir.	 
 	 
 	 	"overloading"--> public void yemek() {...}
 	 					 public void yemek(String tatli) {...}
 	 					 public void yemek(String tatli, int ucret) {...}
 	 	
 	 	"overriding"--> public void yemek() {syso(gazoz)}
 	 					public void yemek() {syso(dark ve sek bir kahve)}
 	 					public void yemek() {syso(ucret)}
 	 					
 	 					
 	 	**** "overloading" ile "overriding" arasindaki farklar: ****
 	 
 	1) "overloading" de method signature (name+parametre) degistirilir.(parametre degisir)
 	   "overriding" de method signature (name+parametre) asla degistirilemez.
 	   
 	2)  "overloading" de inheritance gerekmez
 	    "overriding" de inharitance olmadan overriding yapilamaz.
 	    
 	3)  "overloading" de body genelde degistirilmeden kullanilir
 	    "overriding" de body hemen hemen her zaman degistieilir.
 	    
 	4)  Static methodlar overriding edilemezler.Ama overloading edilebilirler.
 	    Private methodlar'lar overriding edilemezlere. Ama overloading edilebilirler.
 	    
 	5) overloading Compile Time   Polymorphism'dir. -->static
 	5) overriding Run Compile Time   Polymorphism'dir. -->dynamic
 	 
 	 
 	 
 	 
 	 
 */
}
