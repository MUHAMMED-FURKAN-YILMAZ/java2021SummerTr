package Practice02;

import java.util.Scanner;

public class C3_Practice_fahrenheitToCelcius {

	public static void main(String[] args) {
		
		/*
		 *  Write a Java program to convert temperature from Fahrenheit to Celsius degree.
		 *  formula
		    
		    c = (f-32)*5/9
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen Fahrenheit degerini giriniz");
		
		double f=scan.nextDouble();
		
		double c= (f-32)*5/9;
		
		System.out.println("Girdiginiz Fahrenheit degerinin Celcius esiti : "+c);

		scan.close();
		
	}

}
