package practice09;

public class ConstructorStudent {
	
		 /*
		 * Write program as a Student class   that has instance variables name and address.
	     *  Create a constructor that will initialize those variables. 
	     *  Print name & address of given  student by the displayInfo method.
	     *  
	     *  Program�, �rnek de�i�kenlerin(instance variable) ad� ve adresi olan bir Student s�n�f� olarak yaz�n. 
	     *  Bu de�i�kenleri ba�latacak bir const olu�turun. 
	     *  DisplayInfo methoduyla verilen ��rencinin ad�n� ve adresini yazd�r�n.
	     */

	String name;
	String address;
	
	public ConstructorStudent(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		
	
	
	ConstructorStudent ogrenci=new ConstructorStudent("TolgaDemir","buyuk dut agacinin alti");
	ogrenci.DisplayInfo();
	}

	private void DisplayInfo() {
		System.out.println(name+" "+address);
		
	}
}
