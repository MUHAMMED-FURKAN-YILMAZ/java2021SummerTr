package day32_StringBuilder;

import java.util.Arrays;

public class C01_StringBuilder01 {

	public static void main(String[] args) {
	
		StringBuilder sb1=new StringBuilder();// bos bir sb1 creat ettik.
		
		// SB'ye eleman ekleme --> obj.append(obj);
		sb1.append("faruk");	
			System.out.println(sb1);// faruk
		sb1.append(" efehan");	
			System.out.println("sb1 efehan eklenmis hali : "+sb1);// efehan
			System.out.println("sb1 uzunluk : "+sb1.length());//12..
			System.out.println("sb1 kapasitesi : "+sb1.capacity());//16
			System.out.println("sb1 son hali : "+sb1.append(" guzel insan"));//faruk efehan guzel insan
			System.out.println("sb1 son hali kapasite : "+sb1.capacity());//34

			//BURADAN DEVAM
			
			// Fazladan ayrilan kapasiteyi silme--> obj.trimToSize()
			sb1.trimToSize();// fazla kapasiteyi kestik
			System.out.println(sb1.capacity());//24 
			
			// Istenen character'in index'ini alma --> obj.indexOf()
		System.out.println(sb1.indexOf("e"));//6 ..demek ki ilk e karakteri 6.index'teymis
		System.out.println(sb1.lastIndexOf("e"));//16.. demek ki son e karakteri 16.index'teymis	
		
		
			// Istenen bir characteri index'ine gore alma--> obj.charAt();
		
		 System.out.println(sb1.charAt(7)); //f... sb1'in 7. karakteri f'mis
		
		 
		 	// Belirli bir araliktaki characteri alma-->obj.subSequence();
		System.out.println("sb1'in 7 dahil 12 haric karakterleri "+sb1.subSequence(7, 12));//fehan.. 7'den 12'ye bunlar varmis
		System.out.println(sb1.toString().substring(5));// efehan guzel insan.. tek parametreli sequence calismadi. once string'e cevirdik oyle substring yaptik
		System.out.println(sb1.subSequence(5,sb1.length()));// efehan guzel insan.. veya bu sekilde yapabiliriz
		
		
			// sb'deki belli bir index'teki karakteri silme-->obj.delete(a,b) a'dan b'ye kadar siler...  obj.deleteCharAt(a); yaln�zca a'yi
		sb1.delete(3, 7);
		System.out.println("3-7 arasi silinmis hali :"+sb1);//farfehan guzel insan
		sb1.deleteCharAt(2);
		System.out.println("2. karakteri silinmis hali :"+sb1);//fafehan guzel insan
		
		
			//istenen index'te istenen karakteri ve karakterleri eklemek--> obj.insert(index,obj) 
				  //insert methodu parametre olarak sadece char almaz obje de alabilir
		sb1.insert(2, "r");
		System.out.println("2. index'ine r eklenmis hali :"+sb1);//farfehan guzel insan
		
		sb1.insert(7, 3.14);// 7. index'e 7. index'3.14 eklendi
		System.out.println(sb1);//farfeha3.14n guzel insan .. 
		
		int arr[]= {17,63,21};
		sb1.insert(9, Arrays.toString(arr));//9. index'e array'i ekledi
		System.out.println("sb1'e arr eklenmis hali : "+sb1);// farfeha3.[17, 63, 21]14n guzel insan
		
		
			//istenen index'teki karakterin yerine birden fazla character ekleme-->obj.replace(a,b,"Characterler")
		StringBuilder sb2=new StringBuilder("Bugun hava cook iscakk");
		System.out.println(sb2);//Bugun hava cook iscakk
		
		sb2.replace(3, 8, "xxxxxxxx");// 3 dahil 8 haric index'ler arasini silip  yerine verilen stringi  atar
		// ama atanacak string kisa atanacak index uzun olursa kalan indexteki karakterleri siler
		System.out.println(sb2);//Bugxxxxxxxxva cook iscakk

		
		System.out.println("ozel durum : "+sb2.insert(5, "basarili", 2, 4));// Bugxxsaxxxxxxva cook iscakk
		/*
		 * 5 : sb2'ye basarili ekleme baslangic index'i
		 * basarili : eklenecek string
		 * 2 :eklenecek stringin baslangic indexi-->dahil
		 * 4 :eklenecek stringin bitis indexi-->haric 
		 */
	

			// reverse methodu sb'deki elemanlari index'e gore ters cevirir -->obj.reverse()
		StringBuilder sb3=new StringBuilder("Bugun hava cook iscakk");
		System.out.println(sb3);// Bugun hava cook iscakk

		sb3.reverse();
		System.out.println("sb3 ters cevrilmis hali : "+sb3);//kkacsi kooc avah nuguB
		
		// DAY 33.. DAY 32'DEN KALAN YERDEN DEVAM***
		
		//String ile StringBuilder karsilsatirmasi : == equals-->
		//SB'de equals methodu string classindan farkli calisir. String classindaki == operatoru ile 
		//ayni islemi yapar.. Hem icerik hem de referans esitligine bakar
		
		String s="hayat";
		StringBuilder sb = new StringBuilder("hayat");
		
	//System.out.println(s==sb); --> farkli data type'lari karsilastirma operatorlari derleyemez CTE verir
		
		System.out.println(s.equals(sb));// false--> ref+value esit olmadigi icin f verdi
		// SB toString methodu ile stringe cevrilerek string manipulation methodlari kullanilabilir
		System.out.println(sb.toString().equals(s));//true --> cunku string'e cevirdik SB'yi bu sebeple SB-SB=>T
		System.out.println(sb.toString().equals(sb));// false--> burada da string ile SB'yi karsilastirmis oluyoruz o yuzden f
	
		System.out.println(sb.toString().concat("guzel"));// hayatguzel--
		System.out.println(sb);//hayat
		System.out.println(sb.append(s,2,5));//hayatyat-- sb ye s'in 2-3-4. satirlari eklendi
		

		
		
		
	}

}
