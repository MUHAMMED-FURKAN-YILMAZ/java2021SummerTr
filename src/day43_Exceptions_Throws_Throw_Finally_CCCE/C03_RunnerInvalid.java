package day43_Exceptions_Throws_Throw_Finally_CCCE;

import java.util.Scanner;

public class C03_RunnerInvalid {

	public static void main(String[] args) throws InvalidEmaiIdCheckedException {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("email giriniz : ");
		String email=scan.nextLine();
		if (email.contains("@gmail.com")|| email.contains("@ebikgabik.com")) {
			
			System.out.println("basarili");
			
		}else {
			throw new InvalidEmaiIdCheckedException("neyin kafasi bu, ne ictiysen bana da");
		}

	}

}
