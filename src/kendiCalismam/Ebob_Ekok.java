package kendiCalismam;

import java.util.Scanner;

public class Ebob_Ekok {

	public static void main(String[] args) {
	/*
	 Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

		Input :

		30 and 40

		Expected OutPut:

		GCD for 30 and 40 = 10

		LCM for 30 and 40 = 120
	 */
	
	Scanner scan= new Scanner(System.in);
	System.out.println("enter two int");
	
	int gcd=0;
	
	int num1=scan.nextInt();
	int num2=scan.nextInt();
		
	for (int i = 1 ; i <=num1 && i<=num2 ; i++) {
		
		if( num1%i==0 && num2%i==0) {
			gcd=i;
		}
	}
		int lcm=num1*num2/gcd;
	
	System.out.println("GCD for "+num1+" and "+num2+" = "+gcd);
	System.out.println("LCM for "+num1+" and "+num2+" = "+lcm);
	
	scan.close();
	}

}
