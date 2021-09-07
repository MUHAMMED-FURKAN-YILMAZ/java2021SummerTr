package practice09;

public class BMI {
	/*
1 ) BMI ve MainBMI class'larý creat ediniz
2 ) BMI class'ý için field'larý name(String), age(int), weight(double) ve 
height(double) olan veriable'lar oluþturup tüm veriableleri encapsule ediniz.
3 ) tüm  field'larý setter getter ve  constructor creat ediniz.
4 ) bmi=weight/(height*height) formulüne göre bmi hesaplayan bir method creat ediniz.
5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez durumunu veren method creat ediniz.
6 ) MainBMI de  bu deðereli yazdýrýnýz.
  */

	private String name; 
	private int age;
	private double weight; 
	private double height;
	
	
	
	
	public BMI(String name, int age, double weight, double height) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double BMIHesapla() {
		double bmi=weight/(height*height);
		return bmi;
	}
	
	public String BMIDurumu() {
		double bmi=BMIHesapla();// bmi degerini methoddan al dedik
		
		if (bmi<18.5) {
			return "zayif";
		}else if (bmi<25) {
			return "normal";
		}else if (bmi<30) {
			return "kilolu";
		}else
			return "obez";
		
	}


}
