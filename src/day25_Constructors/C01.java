package day25_Constructors;

public class C01 {

	public int ilanNo;
	public String marka;
	public String model="Yazilmadi";
	public int yil=1900;
	public int fiyat;
	
	C01(int ilanNo, String marka, String model,	 int yil, int fiyat){
		// parametreli constructor
	this.ilanNo=ilanNo;// bu classtaki mavi olan ilanNo instance variable'ina
		// parametre olarak gelen kahverengi ilanNo'daki degeri "this" ile ata
	this.marka=marka;
	this.model=model;
	this.yil=yil;
	this.fiyat=fiyat;
	
	}
	// eger parametreli bir constructor olusturursak Java default olani oldurur
		// bu durumda projemizde aksama olmamasi icin default constructor yerine
		// parametresiz bir constructor'i biz olusturmaliyiz
	
	C01(){
		
	}
	
	C01(int ilanNo,  String marka, int fiyat){
		this.ilanNo=ilanNo;
		this.marka=marka;
		this.fiyat=fiyat;
	}
	
	
	
	public C01(int ilanNo, String marka, String model, int yil) {
		super();// KISA YOOLL
			// sol ustte source ordan generate constructor using fields'te olusturabiliriz
		this.ilanNo = ilanNo;
		this.marka = marka;
		this.model = model;
		this.yil = yil;
	}
	
	
	public void maxhiz (int hiz) {
		System.out.println("Araba "+ hiz+" km hiz yapabilir");
		
	}
	
	public void yakit (String yakitTuru) {
		System.out.println("Araba yakit olarak "+ yakitTuru+" kullanir");
	}
}
