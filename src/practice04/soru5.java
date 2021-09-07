package practice04;

public class soru5 {

	public static void main(String[] args) {

	/*
      Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
      String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     */
	   String  pickName="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char a=pickName.charAt(pickName.indexOf("A"));
		char l=pickName.charAt(pickName.indexOf("L"));
		char i=pickName.toLowerCase().charAt(pickName.indexOf("I"));
		
		System.out.println(a+" "+l+" "+i);
	}

}
