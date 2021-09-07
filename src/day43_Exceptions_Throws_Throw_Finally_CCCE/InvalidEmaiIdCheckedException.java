package day43_Exceptions_Throws_Throw_Finally_CCCE;

public class InvalidEmaiIdCheckedException extends Exception {
// InvalidEmaiIdCheckedException buna kendimiz de isim verebiliriz ancak bu convention'dir
	private static final long serialVersionUID = 1L;
	//Java exception'larin tekrarsiz olmasini saglamak icin her exception'a bir kod verir

	InvalidEmaiIdCheckedException(String message){//p'li const create ettim ki bu class'dan
		// olusan object ile class'dan ve parent'inden field ve variable call yapabilelim
		super(message);
		
	}
	
}
