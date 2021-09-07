package day34_Encapsulation;

public class C02_ {

	
	
	public static void main(String[] args) {
		
		C01_Encapsulation01 insan1=new C01_Encapsulation01();// C01_Enc. classýndan obj create ettik

	// insan1.age=-47; .. private oldugu icin direkt ulasamadik
	insan1.name="onur";
	insan1.surname="enes";
	insan1.yasAta(-47); // C01_Enc classinda method create ettik ki ulaslim	
	System.out.println(insan1.name);//onur
	System.out.println(insan1.surname);//enes
	//System.out.println(insan1.age); age yazdirmiyor cunku getirmem lazim
	System.out.println(insan1.yasGoster());// 47
	
	
	//ANCAK BUNUN KOLAY YOLU GET-SET METHODLARÝ 
	
	insan1.setAge(-34);
	System.out.println(insan1.getAge());//34
	
	}

}
