package day34_Encapsulation;

/*
1- fieldlar� model(String), renk(String), motor(int), yil (int)
		olan Araba  isimli bir class tan�mlay�n�z.
2- b�t�n fieldlar� parametre alan bir constructor tan�mlay�n�z.
3- b�t�n fieldlar� i�in getter ve setter metodlar� olu�turunuz.
4- ArabaMain isminde main method i�in bir class olu�turunuz.
5- �ki adet parametreli const 1 adet parametresiz cons ile 3 
		adet araba create ediniz
6- araclar�n motor ve y�l�n� hatal� veri girisine karsi 
		kapsulleyiniz.
 */

public class C04_Araba {
	
	 String model;//1.step
	 String renk;
	private int motor;// encapsulation icin private yaptik . 6.step
	private int yil ;// encapsulation icin private yaptik. 6.step
	
	public C04_Araba(){};// parametresiz cons create ettik
	
	//parametreli constructor olusturduk //2.step
	public C04_Araba(String model, String renk, int motor, int yil) {
		super();
		setModel(model);
		setMotor(motor);
		setRenk(renk);
		setYil(yil);
	// buradaki this.'lari cikarip methodlari getirdik. cunku
	// silmeseydik siger classtaki const'tan gelip bunun icinden
	//cikmadan yani kontrol methodlarimiza(get-set) girmeden dolasip
	//gidecekti. kontrole girsin diye this. silip method call koyduk	
	
	}
	
	

	// hepsini set-get ettik //3. step
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
	if (motor>0) {
		this.motor = motor;
	}else this.motor = -motor;
	
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
	if (yil>0) {
		this.yil = yil;
	}else this.yil = -yil;
	}
	

	

}
