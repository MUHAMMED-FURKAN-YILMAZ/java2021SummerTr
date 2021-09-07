package day44_Abs_Calisma;

public class BenimHesabim extends Banka {
	
	
	public BenimHesabim(double bakiye) {
		super.bakiye=bakiye;
		System.out.println(bakiye);
	}

	@Override
	protected double paraCek(double miktar) {
		super.bakiye-=miktar;
		return bakiye;
			
	}

	@Override
	protected double paraYatir(double miktar) {
		super.bakiye+=miktar;
		return bakiye;
				
	}

}
