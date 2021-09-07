package day42_Exceptions;

public class Exceptions08 {

	public static void main(String[] args) {
		
		int sayi=34;
		String str="1453";
		
//		String str1=sayi; ==> checked exceptions CTE yani (ClassCast)
		
		int okulNo=Integer.parseInt(str);
		
		System.out.println("okul no : "+okulNo);//1453
		System.out.println(str+35);//145335
		System.out.println(okulNo+35);//1488
		
		String str1="14a3";
		
//		int strSayi=Integer.parseInt(str1);//NumberFormatException (unchecked)
		
		Object sayi3 = 45; // object dta type Javadaki tum calssalrin parenti
		
//		String strSayi2 = (String) sayi3; // ClassCastException (unchecked)
		
		// Data turlerini casting yaparken uygun olmayan islem yaparsaniz Java ClassCastException verir.
	
		// data type'i olan class casting yaptik.
		// yani buyuk veri kucuk konteiner'a atandi

	}

}
