package practice09;

public class ConstructorStudent {
	
		 /*
		 * Write program as a Student class   that has instance variables name and address.
	     *  Create a constructor that will initialize those variables. 
	     *  Print name & address of given  student by the displayInfo method.
	     *  
	     *  Programý, örnek deðiþkenlerin(instance variable) adý ve adresi olan bir Student sýnýfý olarak yazýn. 
	     *  Bu deðiþkenleri baþlatacak bir const oluþturun. 
	     *  DisplayInfo methoduyla verilen öðrencinin adýný ve adresini yazdýrýn.
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
