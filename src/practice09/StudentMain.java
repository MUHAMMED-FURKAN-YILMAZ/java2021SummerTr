package practice09;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("adinizi giriniz :");
		String name=scan.nextLine();
		System.out.print("yasinizi giriniz :");
		int age=scan.nextInt();
		
		Student obj=new Student();
		obj.setName(name);
		obj.setAge(age);
		
		System.out.println("ogrencinin adi : "+obj.getName()+" ve yasi : "+obj.getAge());
		
		scan.close();
	}

}
