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
        �eklini yazd�r�n�z.  65=A'n�n asc�� de�eri
        */
		int harf = 64;
        for (int satir = 1; satir <= 6; satir++) {// sat�r kontrolu
            for (int sutun = 1; sutun <= satir; sutun++) {// sutun kontrolu
                System.out.print((char)(sutun+harf)+" ");
            }
            System.out.println();
        }
	
	}

}
