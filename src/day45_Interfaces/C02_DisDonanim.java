package day45_Interfaces;

public interface C02_DisDonanim {

	public void ayna();
	public void kapi();
	public void kaporta();
	
	String RENK="metalik";
	
	
	public default String sisLambasi() { // bu method bildigin body'li concrete'dir
		return "sisli hava dikkat";
		
	}
	
	public static   String boya() { // bu method bildigin body'li concrete'dir
		return "koyu renk boya gunes yanigi yapar";
		
	}
	
	
	
}
