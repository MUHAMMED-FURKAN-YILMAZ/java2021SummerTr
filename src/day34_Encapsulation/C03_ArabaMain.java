package day34_Encapsulation;

public class C03_ArabaMain {

	public static void main(String[] args) {//4.step
		//5.step 8-9-10. satirlar
	C04_Araba volvo=new C04_Araba("xc90", "beyaz",-2400,-2020);	
	C04_Araba audi=new C04_Araba("Q7","bej",-3000,-2021);
	C04_Araba honda=new C04_Araba();// default parametresiz 
	//cons yoksa calismaz o yuzden parametresiz create ettim diger classa
		
	honda.model="civic";
	honda.renk="siyah";
	honda.setYil(1999);
	honda.setMotor(1400);	
		
	System.out.println("honda yil :"+honda.getYil());//1999
	System.out.println("honda motor :"+honda.getMotor());//1400	
		
	System.out.println("volvo motor :"+volvo.getMotor());//2400
	System.out.println("audi yil :"+audi.getYil());	//2021
	
	
	}
	
}
