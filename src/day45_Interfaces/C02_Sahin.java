package day45_Interfaces;

public class C02_Sahin extends C02_Tofas implements C02_IcDonanim, C02_Lastik {

	
	@Override
	public void motor() {
		System.out.println("1.6 aile motoru");
		
	}

	@Override
	public void yakit() {
		System.out.println("tup takmazsan cook yakar");
		
	}

	@Override
	public void koltuk() {
		System.out.println("deri koltuk yazin pisirir..");
		System.out.println("icinde saman olmasin yeter");
		
	}

	@Override
	public void ayna() {
		System.out.println("elentrikli aynalar");
		
	}

	@Override
	public void kapi() {
		System.out.println("4 kapili");
		
	}

	@Override
	public void kaporta() {
		System.out.println("Kordon gibi kaporta");
		
	}

	@Override
	public void ebat() {
		System.out.println("16 inc lastik ebati vardir");		
	}

	@Override
	public void jant() {
System.out.println("celik jant kullanilmistir");		
	}
	
	

}
