package Practice10;

public class Inharitance01_Runner {

	/*
A ve B isminde iki class olustural�m A parent, 
B child iliskisi kural�m B de parametresiz bir 
constructor create edelim ve bu constructor i�inden 
A daki variable �a��rarak assignment yap�n�z.
Bir runner class create edip her iki class'tan
obje ureterek variable lar� print ediniz
	 */
public static void main(String[] args) {
	
	A_01 a=new A_01();	
	System.out.println(a.mesaj);
	
	B_01 b=new B_01();	
	System.out.println(b.mesaj);
}	
	
	
}
