package day40_Overriding_Overloading;

public class C01_HalukHoca_Otobus extends C01_HalukHoca_Arac {

	 int yolcuSayisi;

	public C01_HalukHoca_Otobus(String renk, int motor, String model, int yolcuSayisi) {
		super(renk, motor, model);// parents'ten gelecek fields'lar
		this.yolcuSayisi = yolcuSayisi;
	}

	@Override
	public String toString() {
		return "Otobus [yolcuSayisi=" + yolcuSayisi + ", model=" + model + getRenk() 
		+ getMotor()		+ ", toString()=" + super.toString() + "]";
	}
	
	 
	 
	 
}
