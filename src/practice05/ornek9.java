package practice05;

public class ornek9 {

	public static void main(String[] args) {
		
		/*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        �ekli yazd�r�n�z
        A'nin ascci degeri=65
        */
		
		int harf = 64;
        for (int satir = 1; satir <= 6; satir++) {// sat�r kontrolu
            for (int sutun =1 ; sutun <= satir; sutun++) {// sutun kontrolu
                System.out.print((char)(satir+harf)+" ");
            }
            System.out.println();
        }
		
	}

}
