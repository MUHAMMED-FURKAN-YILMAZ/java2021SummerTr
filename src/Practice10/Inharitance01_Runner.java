package Practice10;

public class Inharitance01_Runner {

	/*
A ve B isminde iki class olusturalım A parent, 
B child iliskisi kuralım B de parametresiz bir 
constructor create edelim ve bu constructor içinden 
A daki variable çağırarak assignment yapınız.
Bir runner class create edip her iki class'tan
obje ureterek variable ları print ediniz
	 */
public static void main(String[] args) {
	
	A_01 a=new A_01();	
	System.out.println(a.mesaj);
	
	B_01 b=new B_01();	
	System.out.println(b.mesaj);
}	
	
	
}
