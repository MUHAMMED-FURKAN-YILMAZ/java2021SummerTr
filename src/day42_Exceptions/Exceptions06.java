package day42_Exceptions;

public class Exceptions06 {

	public static void main(String[] args) {
		String str1=" ";//space
		String str2="";//hiclik
		String str3=null;//str3 variable'inin hic bir degere esit olmadigini
						 // belirten bir pointer (belirtec-isaretci)
		//null BIR DEGER DEGILDIR ama konsola yazdirilabilir	
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
//		System.out.println(str3.length());//NullPointerException--> unchecked
		System.out.println(str3+" erol tas");// null erol tas
//		System.out.println(str3.concat("erol tas"));// NullPointerException
		//	==>null olarak atanmis bir obj uygun olmayan bir islem yapilirsa
		//Java (NullPointerException) (unchecked) (RTE) verir		
	
	// str3 objesini methoda sokunca hep hata verdi. ama toplama yapti. method calistirmaz
	}
}
