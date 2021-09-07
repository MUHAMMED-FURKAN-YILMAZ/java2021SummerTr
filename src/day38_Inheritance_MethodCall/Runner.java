package day38_Inheritance_MethodCall;

public class Runner {


	public static void main(String[] args) {
		
		Cat c1=new Cat(); // p'siz constructor ile obje create ettik.. Data type'i cat class'indan
		
		// ayni isimli variable'lar obje. ile call edilirken once objenin klendi class'indaki variable call edilir.
		//Sonra parentindeki variable call edilir.
		
		
		System.out.println(c1.a); // 5 animal
		System.out.println(c1.c);// 9 cat..hem cat'te var hem mammal'da ama cat'dekini getirdi..
		System.out.println(c1.d);// 5 cat
		System.out.println(c1.m);// 4 mammal
	
	// Method call edilirken ayni isimli methodlarin hangisinin alinacagina constructor karar verir
	//child'dan parente dogru hiyerarsi calisir. Babadan dedeye once kimde bulursa onu alir getirir	
		//Data type ve cons farkli classlar--> parent obj=new child();
		//*** parent class'tan baslanir childden degil***
		
		
		// Cat'ten const. ettigimiz icin 
		//variable aranirken childden parente aranir
		// constructor aranirken parentten child'e aranir
		
		c1.mM();//animal mamal olmasina ragmen mammal
		c1.mC();//cat --> hem cat hem mammal'da olmasina ragmen cat'dekini aldi
		c1.mA();//mammal --> hem mammal hem animal'de olmasina ragmen mammal'den geliyor
		
		// Method call edilirken AYNI ISIMLI METHODLARIN hangisinin alinacagina constructor karar verir
		//child'dan parente dogru hiyerarsi calisir. Babadan dedeye once kimde bulursa onu alir getirir	
			//Data type ve cons farkli classlar--> parent obj=new child();
			//*** parent class'tan baslanir childden degil***
	
		
		// *********** parent obj=new child();
		// method icin -->  icin const'dan bakilir yani childden gelir..  
		// variable icin --> data type dan(parent) gelir.**************
		
		
		Mammal c2=new Cat("X");// c2 objesinin kendi class'i mammal'dir variable'i once buradan alacak
		// bu consta mammal'den cat yaptik . o yuzden c2. yazinca cat'den variable veya method gelmiyor
		System.out.println(c2.a);//5.. animals--> class call
		System.out.println(c2.c);// 7..mammal --> class call --hem cat'te hem mamal'da olmasina ragmen mammel geldi
		System.out.println(c2.m);//4 .. mammalden-->class call
		
		c2.mA();// mammal
		c2.mC();// cat*** mammal cikmasi lazimdi***
		c2.mM();//animal mammal
		//c2.mD  cat'dekini gormuyor mesela ama mammal'a da koyunca cat'dekini getiriyor s
		c2.mD();//
		
		Mammal m1=new Mammal();
		Animal c3=new Cat();
		//m1 ve c3 obj uzerinden veriable ve method call odev???
		
		
	}
}
