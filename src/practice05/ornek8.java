package practice05;

public class ornek8 {

	public static void main(String[] args) {

		/*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        þeklini yazdýrýnýz.  65=A'nýn ascýý deðeri
        */
		int harf = 64;
        for (int satir = 1; satir <= 6; satir++) {// satýr kontrolu
            for (int sutun = 1; sutun <= satir; sutun++) {// sutun kontrolu
                System.out.print((char)(sutun+harf)+" ");
            }
            System.out.println();
        }
	
	}

}
