package day44_Abs_Calisma;

public class Calisan_Task01 extends Insan01 {
	/*
1)  abstract  bir insan class creat ediniz. fields:  
	 private String isim;
	 private String soyisim;
	 p'li constructor  creat ediniz
	 abs calis method creat ediniz
	 concrete bilgilendirme method creat ediniz-->fields print etsin
	 concrete isimDegistir  method creat ediniz-->fields parametre alsin atama yapsin

2) insan classina sub class olacak Calisan class creat ediniz  
	fields:private int calisanId;
	calisanId==0 ise calisan degil aksi durumda calýsan 
	oldugunu kontrol edip id si ile  yazdirinz
	
3 farkli obj ile ozellikleriniz yazdiriniz
 */
	private int calisanId;
	
	
	public Calisan_Task01(String isim, String soyisim, int calisanId) {
		super(isim, soyisim);
		this.calisanId = calisanId;
	}


	@Override
	public void calis() {
		if (calisanId==0) {
			System.out.println("Bu sahis sirket calisani degil");
			System.out.println("sahsin id'si : "+calisanId);

		}else {
			System.out.println("Bu sahis sirket calisanidir");
			System.out.println("sahsin id'si : "+calisanId);
		}
		
	}
	
	public static void main(String[] args) {
		
		Calisan_Task01 ITManager= new Calisan_Task01("Merve", "Arslan", 0);
		Calisan_Task01 QAtester= new Calisan_Task01("Omer", "Faruk", 1453);
		Calisan_Task01 Developer= new Calisan_Task01("Oguzhan", "Akkafa", 1905);
		
		ITManager.bilgilendirme();
		ITManager.calis();
		
		QAtester.bilgilendirme();
		QAtester.calis();
		
		Developer.bilgilendirme();
		Developer.calis();
		
		
	}
	
	

}
