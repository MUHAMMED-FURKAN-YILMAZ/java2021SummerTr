package Practice10;

public class Calisan04 {

	String isim;
	int maas;
	String departman;
	
	public Calisan04(String isim, int maas, String departman) {	
		
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}
	
	public void bilgileriGoster() {
		System.out.println("isim : "+isim );
		System.out.println("maas : "+maas );
		System.out.println("departman : "+departman );
		
	}
}
