package day39_Overridding;

public class Dog extends Animal {
@Override //annotation--> mutlaka child'a yazilir. Parent ve child methodlarinda iliski kurar
// animal ve dog icindeki beslenme methodlari arasinda iliski kurar	
	public void beslenme() {
		System.out.println("Kemik ile beslenir..");
	}

@Override
public void tatli() {//access modifier degisti cte vermedi
	//1-) parent sadece private olamaz. 
	//2-) child'in access modifier'i parent'ten daha dar olamaz
	//Paret'in access modifier'ini daraltamazsin genisletebilirsin
	
	System.out.println("fistik sarma");
}

@Override
public String icecek() {
System.out.println("tursu suyu");
	return "yarasin";
}

@Override
public Integer topla() {
	return 41+54;
}

@Override //ISTISNA
public Dog fatih() {
	return new Dog();
}



}
