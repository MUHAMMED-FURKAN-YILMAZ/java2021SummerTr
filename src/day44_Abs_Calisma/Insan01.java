package day44_Abs_Calisma;

public abstract class Insan01 {

	private String isim;	
	private String soyisim;
	
	
	public Insan01(String isim, String soyisim) {
		this.isim = isim;
		this.soyisim = soyisim;
	}
	
	
	public abstract void calis();
	
	public void bilgilendirme() {
		System.out.println("isim: "+this.isim+" soyisim: "+this.soyisim);
	}
	
	public String isimDegistir(String isim, String soyisim) {
		this.isim=isim;
		this.soyisim=soyisim;
		return isim;
		
	}
	
	
	
}
